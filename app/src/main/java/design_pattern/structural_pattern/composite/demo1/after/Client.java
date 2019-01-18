package design_pattern.structural_pattern.composite.demo1.after;

/**
 * Created by LIXIAOYE on 2019/1/14.
 */

public class Client {
    public static void main(String[] args) {
        //构造一个根节点
        Component root = new Composite("Root");
        //构造两个枝干节点
        Component branch1 = new Composite("Branch1");
        Component branch2 = new Composite("Branch2");
        //构造两个叶子节点
        Component leaf1 = new Leaf("Leaf1");
        Component leaf2 = new Leaf("Leaf2");
        //将叶子节点添加至枝干节点中
        branch1.addChild(leaf1);
        branch2.addChild(leaf2);
        //将枝干节点添加至根节点中
        root.addChild(branch1);
        root.addChild(branch2);
        root.doSomething();
    }
    /**
     * Root
     Branch1
     Leaf1
     Branch2
     Leaf2
     */
}
