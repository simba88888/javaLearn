package demo_base.javase.copy;

import java.io.Serializable;

public class DeepCopySerializable implements Serializable {
    private String type;
    private StudentForDeep studentForDeep;

    public static void main(String[] args) {
        StudentForDeep bob = new StudentForDeep("Bob", 20);
        DeepCopySerializable copyContructor = new DeepCopySerializable();
        copyContructor.setStudentForDeep(bob);
        copyContructor.setType(DeepCopySerializable.class.getSimpleName());
        System.out.println(copyContructor);

        DeepCopySerializable copyer = (DeepCopySerializable) SerializableUtils.copyObject(copyContructor);
        System.out.println(copyer);

        bob.setName("David");
        System.out.println(copyer);
        System.out.println(copyContructor);
    }
  /*  ShallowCopyCloneable: type=DeepCopySerializable,StudentForDeep: name=Bob,number=20
    ShallowCopyCloneable: type=DeepCopySerializable,StudentForDeep: name=Bob,number=20
    ShallowCopyCloneable: type=DeepCopySerializable,StudentForDeep: name=Bob,number=20
    ShallowCopyCloneable: type=DeepCopySerializable,StudentForDeep: name=David,number=20*/
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
    @Override
    public String toString() {
        return ShallowCopyCloneable.class.getSimpleName() + ":" + " type=" + type + "," + studentForDeep;
    }
}
