package design_pattern.behavioral.command.demo7;


/**
 * 在增加了命令队列类CommandQueue以后，请求发送者类Invoker将针对CommandQueue编程
 */

public class Invoker {
    private CommandQueue commandQueue;//维持一个CommandQueue对象的引用
    //构造注入
    public Invoker(CommandQueue commandQueue){
        this.commandQueue=commandQueue;
    }
    //设值注入
    public void setCommandQueue(CommandQueue queue){
        this.commandQueue=queue;
    }
    //调用CommandQueue类的execute()方法
    public void call(){
        this.commandQueue.execute();
    }
}
