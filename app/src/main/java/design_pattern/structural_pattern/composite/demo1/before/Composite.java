package design_pattern.structural_pattern.composite.demo1.before;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by LIXIAOYE on 2019/1/14.
 */

public class Composite extends Component {
    //存储节点的容器
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

    /**
     * 添加子节点
     *
     * @param child 子节点
     */
    public void addChild(Component child) {
        components.add(child);
    }

    /**
     * 移除子节点
     *
     * @param child
     */
    public void removeChild(Component child) {
        components.remove(child);
    }

    /**
     * 获取子节点
     * @param index 子节点对应下标
     * @return 子节点
     */
    public Component getChildren(int index) {
        return components.get(index);
    }
}
