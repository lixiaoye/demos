package loader.demo1;

import java.net.URL;
import java.net.URLClassLoader;

/**
 * Created by LIXIAOYE on 2019/2/15.
 */

public class BootStrapTest {
    public static void main(String[] args) {
        System.out.println("BootstrapClassLoader urls :");
        URL[] urls = sun.misc.Launcher.getBootstrapClassPath().getURLs();
        for (URL url : urls) {
            System.out.println(url);
        }

        System.out.println(System.getProperty("sun.boot.class.path"));

        URLClassLoader extClassLoader = (URLClassLoader) ClassLoader.getSystemClassLoader().getParent();
        System.out.println("\n" + extClassLoader + " urls :");
        urls = extClassLoader.getURLs();
        for (URL url : urls) {
            System.out.println(url);
        }

        URLClassLoader appClassLoader = (URLClassLoader) ClassLoader.getSystemClassLoader();
        System.out.println("\n" + appClassLoader + " urls :");
        urls = appClassLoader.getURLs();
        for (URL url : urls) {
            System.out.println(url);
        }
    }
/**
 * BootstrapClassLoader urls :
 file:/C:/Java/jdk1.8.0_91/jre/lib/resources.jar
 file:/C:/Java/jdk1.8.0_91/jre/lib/rt.jar
 file:/C:/Java/jdk1.8.0_91/jre/lib/sunrsasign.jar
 file:/C:/Java/jdk1.8.0_91/jre/lib/jsse.jar
 file:/C:/Java/jdk1.8.0_91/jre/lib/jce.jar
 file:/C:/Java/jdk1.8.0_91/jre/lib/charsets.jar
 file:/C:/Java/jdk1.8.0_91/jre/lib/jfr.jar
 file:/C:/Java/jdk1.8.0_91/jre/classes

 sun.misc.Launcher$ExtClassLoader@1540e19d urls :
 file:/C:/Java/jdk1.8.0_91/jre/lib/ext/access-bridge-64.jar
 file:/C:/Java/jdk1.8.0_91/jre/lib/ext/cldrdata.jar
 file:/C:/Java/jdk1.8.0_91/jre/lib/ext/dnsns.jar
 file:/C:/Java/jdk1.8.0_91/jre/lib/ext/jaccess.jar
 file:/C:/Java/jdk1.8.0_91/jre/lib/ext/jfxrt.jar
 file:/C:/Java/jdk1.8.0_91/jre/lib/ext/localedata.jar
 file:/C:/Java/jdk1.8.0_91/jre/lib/ext/nashorn.jar
 file:/C:/Java/jdk1.8.0_91/jre/lib/ext/sunec.jar
 file:/C:/Java/jdk1.8.0_91/jre/lib/ext/sunjce_provider.jar
 file:/C:/Java/jdk1.8.0_91/jre/lib/ext/sunmscapi.jar
 file:/C:/Java/jdk1.8.0_91/jre/lib/ext/sunpkcs11.jar
 file:/C:/Java/jdk1.8.0_91/jre/lib/ext/zipfs.jar

 sun.misc.Launcher$AppClassLoader@4aa298b7 urls :
 file:/D:/Developer/Android/sdk/platforms/android-26/android.jar
 file:/D:/Developer/Android/sdk/platforms/android-26/data/res/
 file:/D:/work/Demos/app/build/intermediates/classes/debug/
 file:/C:/Users/lixiaoye/.gradle/caches/transforms-1/files-1.1/support-media-compat-26.1.0.aar/c607cfc3488667b1ff0bd2ecc8b062a5/jars/classes.jar
 file:/C:/Users/lixiaoye/.gradle/caches/transforms-1/files-1.1/support-media-compat-26.1.0.aar/c607cfc3488667b1ff0bd2ecc8b062a5/res/
 file:/C:/Users/lixiaoye/.gradle/caches/transforms-1/files-1.1/recyclerview-v7-26.1.0.aar/87395e49c327290c2c5f73c8fec9a187/jars/classes.jar
 file:/C:/Users/lixiaoye/.gradle/caches/transforms-1/files-1.1/recyclerview-v7-26.1.0.aar/87395e49c327290c2c5f73c8fec9a187/res/
 file:/C:/Users/lixiaoye/.gradle/caches/modules-2/files-2.1/android.arch.lifecycle/common/1.0.0/e414a4cb28434e25c4f6aa71426eb20cf4874ae9/common-1.0.0.jar
 file:/C:/Users/lixiaoye/.gradle/caches/transforms-1/files-1.1/support-fragment-26.1.0.aar/a3537055939896b672e1dc6a09525028/jars/classes.jar
 file:/C:/Users/lixiaoye/.gradle/caches/transforms-1/files-1.1/support-vector-drawable-26.1.0.aar/51fbc4490480ae70bd994eb15181c415/jars/classes.jar
 file:/C:/Users/lixiaoye/.gradle/caches/transforms-1/files-1.1/runtime-1.0.0.aar/b3c7fb9015e4b4be6e4d12307b5d5b9e/jars/classes.jar
 file:/C:/Users/lixiaoye/.gradle/caches/transforms-1/files-1.1/appcompat-v7-26.1.0.aar/e42ecce237efcb93e5d72049b0089374/jars/classes.jar
 file:/C:/Users/lixiaoye/.gradle/caches/transforms-1/files-1.1/appcompat-v7-26.1.0.aar/e42ecce237efcb93e5d72049b0089374/res/
 file:/C:/Users/lixiaoye/.gradle/caches/modules-2/files-2.1/com.android.support/support-annotations/26.1.0/814258103cf26a15fcc26ecce35f5b7d24b73f8/support-annotations-26.1.0.jar
 file:/C:/Users/lixiaoye/.gradle/caches/transforms-1/files-1.1/constraint-layout-1.1.2.aar/b30caec6d8b22bc15cbe03b3670b36d9/res/
 file:/C:/Users/lixiaoye/.gradle/caches/transforms-1/files-1.1/constraint-layout-1.1.2.aar/b30caec6d8b22bc15cbe03b3670b36d9/jars/classes.jar
 file:/C:/Users/lixiaoye/.gradle/caches/transforms-1/files-1.1/support-core-utils-26.1.0.aar/60a1bd14340877c7bd6556cbb9149e63/jars/classes.jar
 file:/C:/Users/lixiaoye/.gradle/caches/transforms-1/files-1.1/support-core-ui-26.1.0.aar/4c43f5752e5ccd3e829d927a855d64a3/jars/classes.jar
 file:/C:/Users/lixiaoye/.gradle/caches/transforms-1/files-1.1/support-compat-26.1.0.aar/ebb523b70ebf8ed6b7f7cd8cf7070037/res/
 file:/C:/Users/lixiaoye/.gradle/caches/transforms-1/files-1.1/support-compat-26.1.0.aar/ebb523b70ebf8ed6b7f7cd8cf7070037/jars/classes.jar
 file:/C:/Users/lixiaoye/.gradle/caches/modules-2/files-2.1/android.arch.core/common/1.0.0/a2d487452376193fc8c103dd2b9bd5f2b1b44563/common-1.0.0.jar
 file:/C:/Users/lixiaoye/.gradle/caches/transforms-1/files-1.1/support-v4-26.1.0.aar/d1c9a5d7bcd973519c1c56d84ebbb239/jars/classes.jar
 file:/C:/Users/lixiaoye/.gradle/caches/transforms-1/files-1.1/animated-vector-drawable-26.1.0.aar/956a2e65a25a1a6fabf0d709fd7215c3/jars/classes.jar
 file:/C:/Users/lixiaoye/.gradle/caches/transforms-1/files-1.1/design-26.1.0.aar/fad6253f43c6e1f0b31b22c82a359981/res/
 file:/C:/Users/lixiaoye/.gradle/caches/transforms-1/files-1.1/design-26.1.0.aar/fad6253f43c6e1f0b31b22c82a359981/jars/classes.jar
 file:/C:/Users/lixiaoye/.gradle/caches/transforms-1/files-1.1/transition-26.1.0.aar/770f81b278b8489e17613d2f1ce03968/jars/classes.jar
 file:/C:/Users/lixiaoye/.gradle/caches/transforms-1/files-1.1/transition-26.1.0.aar/770f81b278b8489e17613d2f1ce03968/res/
 file:/C:/Users/lixiaoye/.gradle/caches/modules-2/files-2.1/org.greenrobot/eventbus/3.1.1/5cd91fd014f5b72292f959748c20a2cefefae77d/eventbus-3.1.1.jar
 file:/C:/Users/lixiaoye/.gradle/caches/modules-2/files-2.1/com.android.support.constraint/constraint-layout-solver/1.1.2/bfc967828daffc35ba01c9ee204d98b664930a0f/constraint-layout-solver-1.1.2.jar
 file:/D:/Developer/Android/Android%20Studio/lib/idea_rt.jar

 Process finished with exit code 0
  */
}
