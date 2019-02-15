package loader.demo1;

/**
 * Created by LIXIAOYE on 2019/2/15.
 */

public class ClassLoaderTest {
    public static void main(String[] args) {
        ClassLoader loader = ClassLoaderTest.class.getClassLoader();
        while (loader != null) {
            System.out.println(loader.toString());
            loader = loader.getParent();
        }
        System.out.println(loader);
    }
    /**
     * 打印结果：
     * sun.misc.Launcher$AppClassLoader@4aa298b7
     sun.misc.Launcher$ExtClassLoader@1540e19d
     null
     */
}
