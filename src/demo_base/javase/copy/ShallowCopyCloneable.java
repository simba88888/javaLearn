package demo_base.javase.copy;

public class ShallowCopyCloneable implements Cloneable {
    private String type;
    private StudentForShallow studentForShallow;

    @Override
    protected Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        StudentForShallow bob = new StudentForShallow("Bob", 20);
        ShallowCopyCloneable copyContructor = new ShallowCopyCloneable();
        copyContructor.setStudentForShallow(bob);
        copyContructor.setType(ShallowCopyCloneable.class.getSimpleName());
        System.out.println(copyContructor);

        ShallowCopyCloneable copyer = (ShallowCopyCloneable) copyContructor.clone();
        System.out.println(copyer);

        bob.setName("David");
        System.out.println(copyer);
        System.out.println(copyContructor);

        /*
            ShallowCopyCloneable: type=ShallowCopyCloneable,StudentForShallow: name=Bob,number=20
            ShallowCopyCloneable: type=ShallowCopyCloneable,StudentForShallow: name=Bob,number=20
            ShallowCopyCloneable: type=ShallowCopyCloneable,StudentForShallow: name=David,number=20
            ShallowCopyCloneable: type=ShallowCopyCloneable,StudentForShallow: name=David,number=20
        */
    }

    @Override
    public String toString() {
        return ShallowCopyCloneable.class.getSimpleName() + ":" + " type=" + type + "," + studentForShallow;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public StudentForShallow getStudentForShallow() {
        return studentForShallow;
    }

    public void setStudentForShallow(StudentForShallow studentForShallow) {
        this.studentForShallow = studentForShallow;
    }
}
