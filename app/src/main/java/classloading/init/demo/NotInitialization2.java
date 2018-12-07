package classloading.init.demo;

/**
 * 被动使用类字段演示二：
 * 通过数组定义来引用类，不会触发此类的初始化
 */

public class NotInitialization2 {
    public static void main(String[] args) {
        SuperClass[] superClasses = new SuperClass[10];
        /**
         * 打印结果：
         * 没有任何输出
         * 分析：
         * 说明没有触发类classloading.init.demo.SuperClass的初始化阶段。
         * 但是会触发另外一个名为"[classloading.init.demo.SuperClass"的类的初始化阶段，
         *
         */
    }
}
