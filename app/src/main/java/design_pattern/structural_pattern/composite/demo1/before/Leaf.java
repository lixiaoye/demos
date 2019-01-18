package design_pattern.structural_pattern.composite.demo1.before;

/**
 * 具体叶子节点
 */
public class Leaf extends Component{
    public Leaf(String name) {
        super(name);
    }

    @Override
    public void doSomething() {
        System.out.println(name);
    }
}
