package demo_base.pattern.adapterPattern;

class ObjectAdapter implements Target {
    private Adaptee adaptee;

    public ObjectAdapter(Adaptee adaptee){
        this.adaptee = adaptee;
    }

    @Override
    public int service() {
        adaptee.specificSevice();
        System.out.println(ObjectAdapter.class.getSimpleName()+" be called");
        return 2;
    }
}

//客户端代码
public class ObjectAdapterTest
{
    public static void main(String[] args)
    {
        System.out.println("对象适配器模式测试：");
        Adaptee adaptee = new Adaptee();
        Target target = new ObjectAdapter(adaptee);
        target.service();
    }
}
