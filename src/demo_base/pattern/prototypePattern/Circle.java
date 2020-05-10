package demo_base.pattern.prototypePattern;

public class Circle extends Shape {
    public Circle(){
        type = Circle.class.getSimpleName();
    }
    @Override
    protected void draw() {
        ProtoTypeUtils.print(Circle.class);
    }
}
