package demo_base.pattern.adapterPattern;

//目标接口
interface Target{
    int service();
}
//适配者
class Adaptee{
    public String specificSevice()
    {
        System.out.println(Adaptee.class.getSimpleName()+" be called by specificService");
        return Adaptee.class.getSimpleName()+" be called by specificService";
    }
}

class ClassAdapter extends Adaptee implements Target{

    @Override
    public int service() {
        super.specificSevice();
        System.out.println(ClassAdapter.class.getSimpleName()+" be called");
        return 2;
    }
}

public class ClassAdapterTest {

    public static void main(String[] args)
    {
        System.out.println("类适配器模式测试：");
        Target target = new ClassAdapter();
        target.service();
    }
}
