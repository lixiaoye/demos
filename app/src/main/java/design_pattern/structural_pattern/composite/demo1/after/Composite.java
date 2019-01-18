package design_pattern.structural_pattern.composite.demo1.after;

import java.util.ArrayList;
import java.util.List;

/**
 * 透明的组合模式具体枝干节点
 */
public class Composite extends Component {
    /**
     * 存储节点的容器
     */
    private List<Component> components = new ArrayList<>();

    public Composite(String name) {
        super(name);
    }

    @Override
    public void doSomething() {
        System.out.println(name);
        if (null != components) {
            for (Component c : components) {
                c.doSomething();
            }
        }
    }

    @Override
    public void addChild(Component child) {
        components.add(child);
    }

    @Override
    public void removeChild(Component child) {
        components.remove(child);
    }

    @Override
    public Component getChildren(int index) {
        return components.get(index);
    }
}
