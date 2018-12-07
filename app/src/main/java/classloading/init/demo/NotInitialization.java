package classloading.init.demo;

/**
 * 非主动使用类字段演示
 */

public class NotInitialization {
    public static void main(String[] args) {
        System.out.println(SubClass.value);
/**
 * SuperClass init!
 123
 分析：
 对于静态字段，只有直接定义这个字段的类才会被初始化，
 因此通过其子类来引用父类中定义的静态字段，只会触发父类的初始化而不会触发子类的初始化。
至于是否要触发子类的加载和验证，在虚拟机规范中并未明确规定，这单取决于虚拟机的具体实现。
 */
    }
}
