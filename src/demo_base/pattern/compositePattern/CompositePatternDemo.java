package demo_base.pattern.compositePattern;

import java.util.ArrayList;
import java.util.List;

interface Node {
    void operation();
}

class File implements Node {
    private String name;

    public File(String name) {
        this.name = name;
    }

    @Override
    public void operation() {
        System.out.println("File name is " + name);
    }
}

class Folder implements Node {
    private List<Node> nodes;

    public Folder() {
        this.nodes = new ArrayList<>();
    }

    public void add(Node node) {
        this.nodes.add(node);
    }

    @Override
    public void operation() {
        for (Node compoment : nodes) {
            compoment.operation();
        }
    }
}

public class CompositePatternDemo {
    public static void main(String[] args) {
        Folder folder1 = new Folder();
        Folder folder2 = new Folder();

        File fileA = new File("A");
        File fileB = new File("B");
        File fileC = new File("C");

        folder1.add(folder2);
        folder1.add(fileC);
        folder2.add(fileB);
        folder2.add(fileA);


        folder1.operation();

//        File name is B
//        File name is A
//        File name is C
    }
}
