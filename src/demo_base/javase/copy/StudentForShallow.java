package demo_base.javase.copy;

public class StudentForShallow {
    private String name;
    private int number;

    @Override
    public String toString() {
        return StudentForShallow.class.getSimpleName()+": "+"name="+name+",number="+number;
    }

    public StudentForShallow(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
