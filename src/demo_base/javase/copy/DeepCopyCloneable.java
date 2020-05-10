package demo_base.javase.copy;

public class DeepCopyCloneable implements Cloneable {
    private String type;
    private StudentForDeep studentForDeep;

    @Override
    protected Object clone() {
        try {
            DeepCopyCloneable deepCopyCloneable = (DeepCopyCloneable) super.clone();
            StudentForDeep studentDeep = (StudentForDeep) deepCopyCloneable.studentForDeep.clone();
            deepCopyCloneable.setStudentForDeep(studentDeep);
            return deepCopyCloneable;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        StudentForDeep bob = new StudentForDeep("Bob", 20);
        DeepCopyCloneable copyContructor = new DeepCopyCloneable();
        copyContructor.setStudentForDeep(bob);
        copyContructor.setType(DeepCopyCloneable.class.getSimpleName());

        System.out.println(copyContructor);

        DeepCopyCloneable copyer = (DeepCopyCloneable) copyContructor.clone();
        System.out.println(copyer);

        bob.setName("David");
        System.out.println(copyer);
        System.out.println(copyContructor);

        /*
       ShallowCopyCloneable: type=DeepCopyCloneable,StudentForDeep: name=Bob,number=20
        ShallowCopyCloneable: type=DeepCopyCloneable,StudentForDeep: name=Bob,number=20
        ShallowCopyCloneable: type=DeepCopyCloneable,StudentForDeep: name=Bob,number=20
        ShallowCopyCloneable: type=DeepCopyCloneable,StudentForDeep: name=David,number=20
        */
    }

    @Override
    public String toString() {
        return ShallowCopyCloneable.class.getSimpleName() + ":" + " type=" + type + "," + studentForDeep;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public StudentForDeep getStudentForDeep() {
        return studentForDeep;
    }

    public void setStudentForDeep(StudentForDeep studentForDeep) {
        this.studentForDeep = studentForDeep;
    }
}
