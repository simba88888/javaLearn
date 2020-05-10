package demo_base.pattern.prototypePattern;

import java.util.HashMap;
import java.util.Map;

public class ProtoTypeContext {
    private static Map<String, Shape> shapeMap = new HashMap<>();

    //获取克隆对象
    public static Shape getCloneShapeById(String id) {
        Shape cashShape = shapeMap.get(id);
        return cashShape.clone();
    }

    // 例如，我们要添加三种形状
    public static void loadCache() {
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(), circle);

        Square square = new Square();
        square.setId("2");
        shapeMap.put(square.getId(), square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        shapeMap.put(rectangle.getId(), rectangle);
    }
}
