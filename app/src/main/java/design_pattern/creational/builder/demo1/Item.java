package design_pattern.creational.builder.demo1;

/**
 * Item接口：食物项目，比如：汉堡包和冷饮
 */

public interface Item {
    public String name();
    public Packing packing();
    public float price();
}
