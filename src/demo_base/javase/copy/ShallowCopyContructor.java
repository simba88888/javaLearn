package demo_base.javase.copy;

public class ShallowCopyContructor {
    private String type;
    private StudentForShallow studentForShallow;

    public ShallowCopyContructor(ShallowCopyContructor bean) {
        type = bean.getType();
        studentForShallow = bean.getStudentForShallow();
    }

    public ShallowCopyContructor() {
    }

    public static void main(String[] args) {
        StudentForShallow bob = new StudentForShallow("Bob", 20);
        ShallowCopyContructor copyContructor = new ShallowCopyContructor();
        copyContructor.setStudentForShallow(bob);
        copyContructor.setType(ShallowCopyContructor.class.getSimpleName());

        System.out.println(copyContructor);

        ShallowCopyContructor copyer = new ShallowCopyContructor(copyContructor);
        System.out.println(copyer);

        bob.setName("David");
        System.out.println(copyer);
        System.out.println(copyContructor);

        /*
        ShallowCopyContructor: type=ShallowCopyContructor,StudentForShallow: name=Bob,number=20
        ShallowCopyContructor: type=ShallowCopyContructor,StudentForShallow: name=Bob,number=20
        ShallowCopyContructor: type=ShallowCopyContructor,StudentForShallow: name=David,number=20
        ShallowCopyContructor: type=ShallowCopyContructor,StudentForShallow: name=David,number=20
        */
    }


    @Override
    public String toString() {
        return ShallowCopyContructor.class.getSimpleName() + ":" + " type=" + type + "," + studentForShallow;
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
