package demo_base.pattern.prototypePattern;

public class Rectangle extends Shape {
    public Rectangle(){
        type = Rectangle.class.getSimpleName();
    }
    @Override
    protected void draw() {
        ProtoTypeUtils.print(Rectangle.class);
    }
}
