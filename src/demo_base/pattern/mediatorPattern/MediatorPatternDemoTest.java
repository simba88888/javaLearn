package demo_base.pattern.mediatorPattern;


class BigStudent extends Student {

    BigStudent(Mediator mediator) {
        super(mediator);
    }

    @Override
    Product needHouse(String scale) {
        return mediator.chooseProduct(this, scale);
    }
}

class SmallStudent extends Student {

    SmallStudent(Mediator mediator) {
        super(mediator);
    }

    @Override
    Product needHouse(String scale) {
        return mediator.chooseProduct(this, scale);
    }
}

class MiddleStudent extends Student {

    MiddleStudent(Mediator mediator) {
        super(mediator);
    }

    @Override
    Product needHouse(String scale) {
        return mediator.chooseProduct(this, scale);
    }
}

class House extends Product {
    String name;

    Student student;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public House(String name,Mediator mediator) {
        super(mediator);
        this.name = name;
    }

    @Override
    public String toString() {
        return "House : name = "+ name+" student = "+student.getClass().getSimpleName();
    }

    @Override
    Product assign(Student student, String scale) {
        House house = (House) mediator.chooseProduct(student, scale);
        house.setStudent(student);
        return house ;
    }
}

interface Mediator {
    Product chooseProduct(Student student, String scale);

    Student getProductPerson(Product product);
}

class ConcreHouseMediator implements Mediator {
    BigStudent bigStudent;
    MiddleStudent middleStudent;
    SmallStudent smallStudent;
    House bigHouse = new House("大",this);
    House smallHouse = new House("小",this);
    House otherHouse = new House("other",this);
    @Override
    public Product chooseProduct(Student student, String scale) {
        House result = otherHouse;
        if (student instanceof BigStudent) { //可以看做是类的与属性作比较，因为比较较为麻烦，简化了。
            if (scale.length() > 2)
                result = bigHouse;
            else
                result = smallHouse;
        }
        if (student instanceof MiddleStudent) {
            if (scale.length() > 2)
                result = bigHouse;
            else
                result = smallHouse;
        }
        if (student instanceof SmallStudent) {
            if (scale.length() > 2)
                result = bigHouse;
            else
                result = smallHouse;
        }

        result.setStudent(student);
        return result;
    }

    @Override
    public Student getProductPerson(Product product) {
        if(product instanceof House){ //可以看做是与类的属性作比较，因为比较较为麻烦，简化了。
            return ((House)product).getStudent();
        }
        return null;
    }
}

public class MediatorPatternDemoTest {
    public static void main(String[] args) {
        Mediator mediator = new ConcreHouseMediator();
        Student bigStudent = new BigStudent(mediator);
        Student middleStudent = new MiddleStudent(mediator);
        Student smallStudent = new SmallStudent(mediator);
        System.out.println(mediator.chooseProduct(bigStudent, "123"));
        System.out.println(mediator.getProductPerson(mediator.chooseProduct(bigStudent, "123")) == bigStudent);
        System.out.println(mediator.chooseProduct(middleStudent, "1"));
        System.out.println(mediator.chooseProduct(smallStudent, "1dddd23"));


/*        House : name = 大 student = BigStudent
        true
        House : name = 小 student = MiddleStudent
        House : name = 大 student = SmallStudent*/
    }
}
