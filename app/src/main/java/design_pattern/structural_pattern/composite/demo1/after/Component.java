package design_pattern.structural_pattern.composite.demo1.after;

/**
 * 透明的组合模式抽象根节点
 */
public abstract class Component {
    protected String name;//节点名

    public Component(String name) {
        this.name = name;
    }

    /**
     * 具体逻辑方法由子类实现
     */
    public abstract void doSomething();

    /**
     * 添加子节点
     *
     * @param child 子节点
     */
    public abstract void addChild(Component child);

    /**
     * 移除子节点
     *
     * @param child 子节点
     */
    public abstract void removeChild(Component child);


    /**
     * 获取子节点
     *
     * @param index 子节点对应下标
     * @return 子节点
     */
    public abstract Component getChildren(int index);
}
