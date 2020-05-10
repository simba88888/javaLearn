package demo_base.pattern.prototypePattern;

public class TestCloneShape {
    public static void main(String[] args) {
        ProtoTypeContext.loadCache();
        Shape specify1Shape = ProtoTypeContext.getCloneShapeById("1");
        System.out.println(specify1Shape.toString()+","+specify1Shape.getType());
        //super class name is Circle
        //type=Circle,id=1

        System.out.println();
        Shape specify2Shape = ProtoTypeContext.getCloneShapeById("2");
        System.out.println(specify2Shape.toString()+","+specify2Shape.getType());
        //super class name is Square
        //type=Square,id=2,Square
    }
}
