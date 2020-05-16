package demo_base.pattern.flyWeightPattern;

import java.util.ArrayList;
import java.util.List;

enum Color {
    RED("red"), BLUE("blue"), GREEN("green");
    String name;

    Color(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

interface LineFlyWeight {
    Color getColor();

    void operation();
}
class Line implements LineFlyWeight {
    private static int initNum = 0;
    private Color color;

    public Line(Color color) {
        System.out.println(Line.class.getSimpleName() + " init num is " + ++initNum);
        this.color = color;
    }

    @Override
    public Color getColor() {
        return color;
    }

    @Override
    public void operation() {
        System.out.println("Line = " + color.getName());
    }
}

class LineFlyWeightFactory {

    private List<Line> lines;

    public LineFlyWeightFactory() {
        this.lines = new ArrayList<>();
    }

    public LineFlyWeight getLine(Color color) {
        for (LineFlyWeight line : lines) {
            if (color.equals(line.getColor())) {
                return line;
            }
        }
        Line data = new Line(color);
        lines.add(data);
        return data;
    }
}



public class FlyWeightPatternDemo {
    public static void main(String[] args) {
        LineFlyWeightFactory factory = new LineFlyWeightFactory();
        LineFlyWeight line = factory.getLine(Color.RED);
        LineFlyWeight line2 = factory.getLine(Color.RED);
        // can use the lines independently
        line.operation();
        line2.operation();
        /*
        Line init num is 1
        Line = red
        Line = red
        */
    }
}
