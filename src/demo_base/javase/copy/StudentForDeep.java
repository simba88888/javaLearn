package demo_base.javase.copy;

import java.io.Serializable;

public class StudentForDeep implements Cloneable, Serializable {
    private String name;
    private int number;

    @Override
    protected Object clone(){
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String toString() {
        return StudentForDeep.class.getSimpleName()+": "+"name="+name+",number="+number;
    }

    public StudentForDeep(String name, int number) {
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
