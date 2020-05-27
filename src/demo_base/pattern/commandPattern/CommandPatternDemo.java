package demo_base.pattern.commandPattern;

//命令
abstract class Command {
    protected Receiver receiver;

    abstract void execute();
}
class ConcreCommandA extends Command {
    ConcreCommandA() {
        receiver = new Receiver();
    }

    @Override
    void execute() {
        System.out.println(ConcreCommandA.class.getSimpleName() + " is running");
        receiver.action();
    }
}
class ConcreCommandB extends Command {
    ConcreCommandB() {
        receiver = new Receiver();
    }

    @Override
    void execute() {
        System.out.println(ConcreCommandB.class.getSimpleName() + " is running");
        receiver.action();
    }
}

//请求者
class Invoker {
    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void request() {
        System.out.println("调用者執行 请求命令");
        command.execute();
    }
}

//接受者
class Receiver {
    public void action() {
        System.out.println("接收者的action()方法被调用...");
    }
}

public class CommandPatternDemo {
    public static void main(String[] args) {
        Command commandA = new ConcreCommandA();
        Invoker invokerA = new Invoker(commandA);
        invokerA.request();

        System.out.println();


        Command commandB = new ConcreCommandB();
        Invoker invokerB = new Invoker(commandB);
        invokerB.request();

 /*       调用者執行 请求命令
        ConcreCommandA is running
        接收者的action()方法被调用...

        调用者執行 请求命令
        ConcreCommandB is running
        接收者的action()方法被调用...
*/
    }


}
