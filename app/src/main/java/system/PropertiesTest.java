package system;

import java.util.Enumeration;
import java.util.Properties;

public class PropertiesTest {
    public static void main(String[] args) {
        //获取当前系统的属性
        Properties properties = System.getProperties();
        //获得所有系统属性的key，返回Enumeration对象
        Enumeration propertyNames = properties.propertyNames();
        while (propertyNames.hasMoreElements()) {
            //获取系统属性的键key
            String key = (String) propertyNames.nextElement();
            //获取当前键key对应的值value
            String value = System.getProperty(key);
            System.out.println(key + "--->" + value);
        }
    }
    /**
     打印结果：
     java.runtime.name--->Java(TM) SE Runtime Environment
     sun.boot.library.path--->C:\Java\jdk1.8.0_91\jre\bin
     java.vm.version--->25.91-b14
     java.vm.vendor--->Oracle Corporation
     java.vendor.url--->http://java.oracle.com/
     path.separator--->;
     java.vm.name--->Java HotSpot(TM) 64-Bit Server VM
     data_structure.file.encoding.pkg--->sun.io
     idea.launcher.port--->56748
     user.script--->
     user.country--->CN
     sun.java.launcher--->SUN_STANDARD
     sun.os.patch.level--->Service Pack 1
     java.vm.specification.name--->Java Virtual Machine Specification
     user.dir--->D:\work\ReflectDemo
     java.runtime.version--->1.8.0_91-b14
     java.awt.graphicsenv--->sun.awt.Win32GraphicsEnvironment
     java.endorsed.dirs--->C:\Java\jdk1.8.0_91\jre\lib\endorsed
     os.arch--->amd64
     java.io.tmpdir--->C:\Users\lixiaoye\AppData\Local\Temp\
     line.separator--->

     java.vm.specification.vendor--->Oracle Corporation
     user.variant--->
     os.name--->Windows 7
     sun.jnu.encoding--->GBK
     java.library.path--->C:\Java\jdk1.8.0_91\bin;C:\Windows\Sun\Java\bin;C:\Windows\system32;C:\Windows;C:\Ruby24-x64\bin;C:\Java\jdk1.8.0_91\bin;C:\Java\jdk1.8.0_91\jre;D:\Developer\Android\sdk\platform-tools;D:\Developer\Android\sdk\tools;D:\Developer\Android\gradle-4.2.1-all\gradle-4.2.1\bin;C:\ProgramData\Oracle\Java\javapath;C:\Windows\system32;C:\Windows;C:\Windows\System32\Wbem;C:\Windows\System32\WindowsPowerShell\v1.0\;C:\Program Files (x86)\NVIDIA Corporation\PhysX\Common;C:\Program Files\TortoiseGit\bin;D:\Python\Python27;D:\Python\Anaconda2;D:\Python\Anaconda2\Scripts;D:\Python\Anaconda2\Library\bin;C:\Program Files\nodejs;C:\Users\lixiaoye\AppData\Roaming\npm;C:\Ruby24-x64\bin;C:\Program Files\MATLAB\R2017b\bin;D:\Developer\Android\sdk\ndk-bundle;C:\Program Files (x86)\QuickTime\QTSystem\;C:\Program Files (x86)\Microsoft VS Code\bin;C:\Users\lixiaoye\AppData\Roaming\npm;C:\Users\lixiaoye\AppData\Local\GitHubDesktop\bin;.
     java.specification.name--->Java Platform API Specification
     java.class.version--->52.0
     sun.management.compiler--->HotSpot 64-Bit Tiered Compilers
     os.version--->6.1
     user.home--->C:\Users\lixiaoye
     user.timezone--->
     java.awt.printerjob--->sun.awt.windows.WPrinterJob
     java.specification.version--->1.8






     data_structure.file.encoding--->UTF-8
     idea.launcher.bin.path--->D:\Developer\Android\Android Studio\bin
     user.name--->LIXIAOYE
     java.class.path--->D:\Developer\Android\sdk\platforms\android-26\android.jar;D:\Developer\Android\sdk\platforms\android-26\data\res;D:\work\ReflectDemo\app\build\intermediates\classes\debug;C:\Users\lixiaoye\.gradle\caches\transforms-1\files-1.1\support-media-compat-26.1.0.aar\c607cfc3488667b1ff0bd2ecc8b062a5\jars\classes.jar;C:\Users\lixiaoye\.gradle\caches\transforms-1\files-1.1\support-media-compat-26.1.0.aar\c607cfc3488667b1ff0bd2ecc8b062a5\res;C:\Users\lixiaoye\.gradle\caches\modules-2\files-2.1\android.arch.lifecycle\common\1.0.0\e414a4cb28434e25c4f6aa71426eb20cf4874ae9\common-1.0.0.jar;C:\Users\lixiaoye\.gradle\caches\transforms-1\files-1.1\support-fragment-26.1.0.aar\a3537055939896b672e1dc6a09525028\jars\classes.jar;C:\Users\lixiaoye\.gradle\caches\transforms-1\files-1.1\support-vector-drawable-26.1.0.aar\51fbc4490480ae70bd994eb15181c415\jars\classes.jar;C:\Users\lixiaoye\.gradle\caches\transforms-1\files-1.1\runtime-1.0.0.aar\b3c7fb9015e4b4be6e4d12307b5d5b9e\jars\classes.jar;C:\Users\lixiaoye\.gradle\caches\transforms-1\files-1.1\appcompat-v7-26.1.0.aar\e42ecce237efcb93e5d72049b0089374\jars\classes.jar;C:\Users\lixiaoye\.gradle\caches\transforms-1\files-1.1\appcompat-v7-26.1.0.aar\e42ecce237efcb93e5d72049b0089374\res;C:\Users\lixiaoye\.gradle\caches\modules-2\files-2.1\com.android.support\support-annotations\26.1.0\814258103cf26a15fcc26ecce35f5b7d24b73f8\support-annotations-26.1.0.jar;C:\Users\lixiaoye\.gradle\caches\transforms-1\files-1.1\constraint-layout-1.1.2.aar\b30caec6d8b22bc15cbe03b3670b36d9\res;C:\Users\lixiaoye\.gradle\caches\transforms-1\files-1.1\constraint-layout-1.1.2.aar\b30caec6d8b22bc15cbe03b3670b36d9\jars\classes.jar;C:\Users\lixiaoye\.gradle\caches\transforms-1\files-1.1\support-core-utils-26.1.0.aar\60a1bd14340877c7bd6556cbb9149e63\jars\classes.jar;C:\Users\lixiaoye\.gradle\caches\transforms-1\files-1.1\support-core-ui-26.1.0.aar\4c43f5752e5ccd3e829d927a855d64a3\jars\classes.jar;C:\Users\lixiaoye\.gradle\caches\transforms-1\files-1.1\support-compat-26.1.0.aar\ebb523b70ebf8ed6b7f7cd8cf7070037\res;C:\Users\lixiaoye\.gradle\caches\transforms-1\files-1.1\support-compat-26.1.0.aar\ebb523b70ebf8ed6b7f7cd8cf7070037\jars\classes.jar;C:\Users\lixiaoye\.gradle\caches\modules-2\files-2.1\android.arch.core\common\1.0.0\a2d487452376193fc8c103dd2b9bd5f2b1b44563\common-1.0.0.jar;C:\Users\lixiaoye\.gradle\caches\transforms-1\files-1.1\support-v4-26.1.0.aar\d1c9a5d7bcd973519c1c56d84ebbb239\jars\classes.jar;C:\Users\lixiaoye\.gradle\caches\transforms-1\files-1.1\animated-vector-drawable-26.1.0.aar\956a2e65a25a1a6fabf0d709fd7215c3\jars\classes.jar;C:\Users\lixiaoye\.gradle\caches\modules-2\files-2.1\com.android.support.constraint\constraint-layout-solver\1.1.2\bfc967828daffc35ba01c9ee204d98b664930a0f\constraint-layout-solver-1.1.2.jar;D:\Developer\Android\Android Studio\lib\idea_rt.jar
     java.vm.specification.version--->1.8
     sun.arch.data.model--->64
     java.home--->C:\Java\jdk1.8.0_91\jre
     sun.java.command--->com.intellij.rt.execution.application.AppMainV2 system.PropertiesTest
     java.specification.vendor--->Oracle Corporation
     user.language--->zh
     awt.toolkit--->sun.awt.windows.WToolkit
     java.vm.info--->mixed mode
     java.version--->1.8.0_91
     java.ext.dirs--->C:\Java\jdk1.8.0_91\jre\lib\ext;C:\Windows\Sun\Java\lib\ext
     sun.boot.class.path--->C:\Java\jdk1.8.0_91\jre\lib\resources.jar;C:\Java\jdk1.8.0_91\jre\lib\rt.jar;C:\Java\jdk1.8.0_91\jre\lib\sunrsasign.jar;C:\Java\jdk1.8.0_91\jre\lib\jsse.jar;C:\Java\jdk1.8.0_91\jre\lib\jce.jar;C:\Java\jdk1.8.0_91\jre\lib\charsets.jar;C:\Java\jdk1.8.0_91\jre\lib\jfr.jar;C:\Java\jdk1.8.0_91\jre\classes
     java.vendor--->Oracle Corporation
     data_structure.file.separator--->\
     java.vendor.url.bug--->http://bugreport.sun.com/bugreport/
     sun.cpu.endian--->little
     sun.io.unicode.encoding--->UnicodeLittle
     sun.desktop--->windows
     sun.cpu.isalist--->amd64

     */
}
