package data_structure.file;

import java.io.File;

public class Test4 {
    public static void main(String[] args) {
        File file = new File("D:\\work\\ReflectDemo\\app\\src");
        fileDir(file);

    }

    private static void fileDir(File dir) {
        File[] files = dir.listFiles();//获取该目录下所有文件数组
        for (File f : files) {
            if (f.isDirectory()) {
                fileDir(f);
            }
            System.out.println(f.getAbsolutePath());
        }
    }
    /**
     * C:\Java\jdk1.8.0_91\bin\java -Didea.launcher.port=61591 "-Didea.launcher.bin.path=D:\Developer\Android\Android Studio\bin" -Dfile.encoding=UTF-8 -classpath "D:\Developer\Android\sdk\platforms\android-26\android.jar;D:\Developer\Android\sdk\platforms\android-26\data\res;D:\work\ReflectDemo\app\build\intermediates\classes\debug;C:\Users\lixiaoye\.gradle\caches\transforms-1\files-1.1\support-media-compat-26.1.0.aar\c607cfc3488667b1ff0bd2ecc8b062a5\jars\classes.jar;C:\Users\lixiaoye\.gradle\caches\transforms-1\files-1.1\support-media-compat-26.1.0.aar\c607cfc3488667b1ff0bd2ecc8b062a5\res;C:\Users\lixiaoye\.gradle\caches\modules-2\files-2.1\android.arch.lifecycle\common\1.0.0\e414a4cb28434e25c4f6aa71426eb20cf4874ae9\common-1.0.0.jar;C:\Users\lixiaoye\.gradle\caches\transforms-1\files-1.1\support-fragment-26.1.0.aar\a3537055939896b672e1dc6a09525028\jars\classes.jar;C:\Users\lixiaoye\.gradle\caches\transforms-1\files-1.1\support-vector-drawable-26.1.0.aar\51fbc4490480ae70bd994eb15181c415\jars\classes.jar;C:\Users\lixiaoye\.gradle\caches\transforms-1\files-1.1\runtime-1.0.0.aar\b3c7fb9015e4b4be6e4d12307b5d5b9e\jars\classes.jar;C:\Users\lixiaoye\.gradle\caches\transforms-1\files-1.1\appcompat-v7-26.1.0.aar\e42ecce237efcb93e5d72049b0089374\jars\classes.jar;C:\Users\lixiaoye\.gradle\caches\transforms-1\files-1.1\appcompat-v7-26.1.0.aar\e42ecce237efcb93e5d72049b0089374\res;C:\Users\lixiaoye\.gradle\caches\modules-2\files-2.1\com.android.support\support-annotations\26.1.0\814258103cf26a15fcc26ecce35f5b7d24b73f8\support-annotations-26.1.0.jar;C:\Users\lixiaoye\.gradle\caches\transforms-1\files-1.1\constraint-layout-1.1.2.aar\b30caec6d8b22bc15cbe03b3670b36d9\res;C:\Users\lixiaoye\.gradle\caches\transforms-1\files-1.1\constraint-layout-1.1.2.aar\b30caec6d8b22bc15cbe03b3670b36d9\jars\classes.jar;C:\Users\lixiaoye\.gradle\caches\transforms-1\files-1.1\support-core-utils-26.1.0.aar\60a1bd14340877c7bd6556cbb9149e63\jars\classes.jar;C:\Users\lixiaoye\.gradle\caches\transforms-1\files-1.1\support-core-ui-26.1.0.aar\4c43f5752e5ccd3e829d927a855d64a3\jars\classes.jar;C:\Users\lixiaoye\.gradle\caches\transforms-1\files-1.1\support-compat-26.1.0.aar\ebb523b70ebf8ed6b7f7cd8cf7070037\res;C:\Users\lixiaoye\.gradle\caches\transforms-1\files-1.1\support-compat-26.1.0.aar\ebb523b70ebf8ed6b7f7cd8cf7070037\jars\classes.jar;C:\Users\lixiaoye\.gradle\caches\modules-2\files-2.1\android.arch.core\common\1.0.0\a2d487452376193fc8c103dd2b9bd5f2b1b44563\common-1.0.0.jar;C:\Users\lixiaoye\.gradle\caches\transforms-1\files-1.1\support-v4-26.1.0.aar\d1c9a5d7bcd973519c1c56d84ebbb239\jars\classes.jar;C:\Users\lixiaoye\.gradle\caches\transforms-1\files-1.1\animated-vector-drawable-26.1.0.aar\956a2e65a25a1a6fabf0d709fd7215c3\jars\classes.jar;C:\Users\lixiaoye\.gradle\caches\modules-2\files-2.1\com.android.support.constraint\constraint-layout-solver\1.1.2\bfc967828daffc35ba01c9ee204d98b664930a0f\constraint-layout-solver-1.1.2.jar;D:\Developer\Android\Android Studio\lib\idea_rt.jar" com.intellij.rt.execution.application.AppMainV2 data_structure.file.Test4WaitNotify
     D:\work\ReflectDemo\app\src\androidTest\java\lxy\android\com\reflectdemo\ExampleInstrumentedTest.java
     D:\work\ReflectDemo\app\src\androidTest\java\lxy\android\com\reflectdemo
     D:\work\ReflectDemo\app\src\androidTest\java\lxy\android\com
     D:\work\ReflectDemo\app\src\androidTest\java\lxy\android
     D:\work\ReflectDemo\app\src\androidTest\java\lxy
     D:\work\ReflectDemo\app\src\androidTest\java
     D:\work\ReflectDemo\app\src\androidTest
     D:\work\ReflectDemo\app\src\main\AndroidManifest.xml
     D:\work\ReflectDemo\app\src\main\java\leetcode.anagram\AnagramDemo.java
     D:\work\ReflectDemo\app\src\main\java\leetcode.anagram
     D:\work\ReflectDemo\app\src\main\java\data_structure.anonymousDemo\Demo.java
     D:\work\ReflectDemo\app\src\main\java\data_structure.anonymousDemo
     D:\work\ReflectDemo\app\src\main\java\data_structure.arrays\RemoveDuplicateMain.java
     D:\work\ReflectDemo\app\src\main\java\data_structure.arrays\BuilderPatternDemo.java
     D:\work\ReflectDemo\app\src\main\java\data_structure.arrays\Test1.java
     D:\work\ReflectDemo\app\src\main\java\data_structure.arrays
     D:\work\ReflectDemo\app\src\main\java\data_structure.buffer\Test1.java
     D:\work\ReflectDemo\app\src\main\java\data_structure.buffer
     D:\work\ReflectDemo\app\src\main\java\data_structure.bytearray\Test1.java
     D:\work\ReflectDemo\app\src\main\java\data_structure.bytearray\ListIntf.java
     D:\work\ReflectDemo\app\src\main\java\data_structure.bytearray
     D:\work\ReflectDemo\app\src\main\java\data_structure.collections\BuilderPatternDemo.java
     D:\work\ReflectDemo\app\src\main\java\data_structure.collections
     D:\work\ReflectDemo\app\src\main\java\data_structure.date\BuilderPatternDemo.java
     D:\work\ReflectDemo\app\src\main\java\data_structure.date
     D:\work\ReflectDemo\app\src\main\java\data_structure.exceptionDemo\ExceptionTest.java
     D:\work\ReflectDemo\app\src\main\java\data_structure.exceptionDemo
     D:\work\ReflectDemo\app\src\main\java\data_structure.file\Test1.java
     D:\work\ReflectDemo\app\src\main\java\data_structure.file\ListIntf.java
     D:\work\ReflectDemo\app\src\main\java\data_structure.file\Test3Sleep.java
     D:\work\ReflectDemo\app\src\main\java\data_structure.file\Test4WaitNotify.java
     D:\work\ReflectDemo\app\src\main\java\data_structure.file
     D:\work\ReflectDemo\app\src\main\java\data_structure.finalDemo\FinalTest.java
     D:\work\ReflectDemo\app\src\main\java\data_structure.finalDemo\OuterFinal.java
     D:\work\ReflectDemo\app\src\main\java\data_structure.finalDemo
     D:\work\ReflectDemo\app\src\main\java\data_structure.foreach\Test1.java
     D:\work\ReflectDemo\app\src\main\java\data_structure.foreach
     D:\work\ReflectDemo\app\src\main\java\data_structure.hashmap\Test1.java
     D:\work\ReflectDemo\app\src\main\java\data_structure.hashmap\ListIntf.java
     D:\work\ReflectDemo\app\src\main\java\data_structure.hashmap
     D:\work\ReflectDemo\app\src\main\java\data_structure.interfaceDemo\C.java
     D:\work\ReflectDemo\app\src\main\java\data_structure.interfaceDemo
     D:\work\ReflectDemo\app\src\main\java\data_structure.iterator\Test1.java
     D:\work\ReflectDemo\app\src\main\java\data_structure.iterator
     D:\work\ReflectDemo\app\src\main\java\data_structure.linkedList\Test1.java
     D:\work\ReflectDemo\app\src\main\java\data_structure.linkedList
     D:\work\ReflectDemo\app\src\main\java\data_structure.list\Test1.class
     D:\work\ReflectDemo\app\src\main\java\data_structure.list\Test1.java
     D:\work\ReflectDemo\app\src\main\java\data_structure.list
     D:\work\ReflectDemo\app\src\main\java\lxy\android\com\reflectdemo\MainActivity.java
     D:\work\ReflectDemo\app\src\main\java\lxy\android\com\reflectdemo
     D:\work\ReflectDemo\app\src\main\java\lxy\android\com
     D:\work\ReflectDemo\app\src\main\java\lxy\android
     D:\work\ReflectDemo\app\src\main\java\lxy
     D:\work\ReflectDemo\app\src\main\java\packaging\Test1.java
     D:\work\ReflectDemo\app\src\main\java\packaging
     D:\work\ReflectDemo\app\src\main\java\piped\Test1.java
     D:\work\ReflectDemo\app\src\main\java\piped
     D:\work\ReflectDemo\app\src\main\java\set\Test1.java
     D:\work\ReflectDemo\app\src\main\java\set\ListIntf.java
     D:\work\ReflectDemo\app\src\main\java\set
     D:\work\ReflectDemo\app\src\main\java\Storage\Storage.java
     D:\work\ReflectDemo\app\src\main\java\Storage\BuilderPatternDemo.java
     D:\work\ReflectDemo\app\src\main\java\Storage
     D:\work\ReflectDemo\app\src\main\java\stream\Test1.java
     D:\work\ReflectDemo\app\src\main\java\stream\ListIntf.java
     D:\work\ReflectDemo\app\src\main\java\stream\Test3Sleep.java
     D:\work\ReflectDemo\app\src\main\java\stream\Test4WaitNotify.java
     D:\work\ReflectDemo\app\src\main\java\stream
     D:\work\ReflectDemo\app\src\main\java\string\StringInitTest.java
     D:\work\ReflectDemo\app\src\main\java\string\StringTest.java
     D:\work\ReflectDemo\app\src\main\java\string\ListIntf.java
     D:\work\ReflectDemo\app\src\main\java\string
     D:\work\ReflectDemo\app\src\main\java\stringBuffer\Test1.java
     D:\work\ReflectDemo\app\src\main\java\stringBuffer
     D:\work\ReflectDemo\app\src\main\java\switchDemo\BuilderPatternDemo.java
     D:\work\ReflectDemo\app\src\main\java\switchDemo
     D:\work\ReflectDemo\app\src\main\java\system\PropertiesTest.java
     D:\work\ReflectDemo\app\src\main\java\system\BuilderPatternDemo.java
     D:\work\ReflectDemo\app\src\main\java\system
     D:\work\ReflectDemo\app\src\main\java\test\Person.java
     D:\work\ReflectDemo\app\src\main\java\test\PersonDemo.java
     D:\work\ReflectDemo\app\src\main\java\test\StaticCodeBlock.java
     D:\work\ReflectDemo\app\src\main\java\test\BuilderPatternDemo.java
     D:\work\ReflectDemo\app\src\main\java\test
     D:\work\ReflectDemo\app\src\main\java\threeSum\ThreeSumDemo.java
     D:\work\ReflectDemo\app\src\main\java\threeSum
     D:\work\ReflectDemo\app\src\main\java\treemap\Test1.java
     D:\work\ReflectDemo\app\src\main\java\treemap
     D:\work\ReflectDemo\app\src\main\java\treeset\Test1.java
     D:\work\ReflectDemo\app\src\main\java\treeset\ListIntf.java
     D:\work\ReflectDemo\app\src\main\java\treeset
     D:\work\ReflectDemo\app\src\main\java
     D:\work\ReflectDemo\app\src\main\res\drawable\ic_launcher_background.xml
     D:\work\ReflectDemo\app\src\main\res\drawable
     D:\work\ReflectDemo\app\src\main\res\drawable-v24\ic_launcher_foreground.xml
     D:\work\ReflectDemo\app\src\main\res\drawable-v24
     D:\work\ReflectDemo\app\src\main\res\layout\activity_main.xml
     D:\work\ReflectDemo\app\src\main\res\layout
     D:\work\ReflectDemo\app\src\main\res\mipmap-anydpi-v26\ic_launcher.xml
     D:\work\ReflectDemo\app\src\main\res\mipmap-anydpi-v26\ic_launcher_round.xml
     D:\work\ReflectDemo\app\src\main\res\mipmap-anydpi-v26
     D:\work\ReflectDemo\app\src\main\res\mipmap-hdpi\ic_launcher.png
     D:\work\ReflectDemo\app\src\main\res\mipmap-hdpi\ic_launcher_round.png
     D:\work\ReflectDemo\app\src\main\res\mipmap-hdpi
     D:\work\ReflectDemo\app\src\main\res\mipmap-mdpi\ic_launcher.png
     D:\work\ReflectDemo\app\src\main\res\mipmap-mdpi\ic_launcher_round.png
     D:\work\ReflectDemo\app\src\main\res\mipmap-mdpi
     D:\work\ReflectDemo\app\src\main\res\mipmap-xhdpi\ic_launcher.png
     D:\work\ReflectDemo\app\src\main\res\mipmap-xhdpi\ic_launcher_round.png
     D:\work\ReflectDemo\app\src\main\res\mipmap-xhdpi
     D:\work\ReflectDemo\app\src\main\res\mipmap-xxhdpi\ic_launcher.png
     D:\work\ReflectDemo\app\src\main\res\mipmap-xxhdpi\ic_launcher_round.png
     D:\work\ReflectDemo\app\src\main\res\mipmap-xxhdpi
     D:\work\ReflectDemo\app\src\main\res\mipmap-xxxhdpi\ic_launcher.png
     D:\work\ReflectDemo\app\src\main\res\mipmap-xxxhdpi\ic_launcher_round.png
     D:\work\ReflectDemo\app\src\main\res\mipmap-xxxhdpi
     D:\work\ReflectDemo\app\src\main\res\values\colors.xml
     D:\work\ReflectDemo\app\src\main\res\values\strings.xml
     D:\work\ReflectDemo\app\src\main\res\values\styles.xml
     D:\work\ReflectDemo\app\src\main\res\values
     D:\work\ReflectDemo\app\src\main\res
     D:\work\ReflectDemo\app\src\main
     D:\work\ReflectDemo\app\src\test\java\lxy\android\com\reflectdemo\ExampleUnitTest.java
     D:\work\ReflectDemo\app\src\test\java\lxy\android\com\reflectdemo
     D:\work\ReflectDemo\app\src\test\java\lxy\android\com
     D:\work\ReflectDemo\app\src\test\java\lxy\android
     D:\work\ReflectDemo\app\src\test\java\lxy
     D:\work\ReflectDemo\app\src\test\java
     D:\work\ReflectDemo\app\src\test

     Process finished with exit code 0

     */
}
