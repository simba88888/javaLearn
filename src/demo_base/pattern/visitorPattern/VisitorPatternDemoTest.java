package demo_base.pattern.visitorPattern;

interface Visitor{
    void visit(ConcreElementA element);
    void visit(ConcreElementB element);
}
class ConcreVisitorA implements Visitor{
    @Override
    public void visit(ConcreElementA element) {
        System.out.println(ConcreVisitorA.class.getSimpleName()+" is visiting for "+element.getClass().getSimpleName());
    }

    @Override
    public void visit(ConcreElementB element) {
        System.out.println(ConcreVisitorA.class.getSimpleName()+" is visiting for "+element.getClass().getSimpleName());
    }
}

class ConcreVisitorB implements Visitor{
    @Override
    public void visit(ConcreElementA element) {
        System.out.println(ConcreVisitorB.class.getSimpleName()+" is visiting for "+element.getClass().getSimpleName());
    }

    @Override
    public void visit(ConcreElementB element) {
        System.out.println(ConcreVisitorB.class.getSimpleName()+" is visiting for "+element.getClass().getSimpleName());
    }
}
interface Element{
    void acceptVisitor(Visitor visitor);
}

class ConcreElementA implements Element{
    @Override
    public void acceptVisitor(Visitor visitor) {
        visitor.visit(this);
    }
}

class ConcreElementB implements Element{
    @Override
    public void acceptVisitor(Visitor visitor) {
        visitor.visit(this);
    }
}

public class VisitorPatternDemoTest {
    public static void main(String[] args) {
        Aggregate<Element> list = new ConcreAggregate<>(5);
        list.add(new ConcreElementA());
        list.add(new ConcreElementB());
        list.add(new ConcreElementB());
        list.add(new ConcreElementA());
        list.add(new ConcreElementB());

        list.visitorAll(new ConcreVisitorA());

        System.out.println();

        list.visitorAll(new ConcreVisitorB());

/*        ConcreVisitorA is visiting for ConcreElementA
        ConcreVisitorA is visiting for ConcreElementB
        ConcreVisitorA is visiting for ConcreElementB
        ConcreVisitorA is visiting for ConcreElementA
        ConcreVisitorA is visiting for ConcreElementB

        ConcreVisitorB is visiting for ConcreElementA
        ConcreVisitorB is visiting for ConcreElementB
        ConcreVisitorB is visiting for ConcreElementB
        ConcreVisitorB is visiting for ConcreElementA
        ConcreVisitorB is visiting for ConcreElementB*/
    }
}
