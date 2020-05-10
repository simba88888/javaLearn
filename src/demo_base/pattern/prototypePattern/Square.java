package demo_base.pattern.prototypePattern;

public class Square extends Shape {
    public Square(){
        type = Square.class.getSimpleName();
    }

    @Override
    protected void draw() {
        ProtoTypeUtils.print(Square.class);
    }
}
