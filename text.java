package data_structure.file;

import java.io.File;

public class Test2 {
    public static void main(String[] args) {
        File file = new File("D:\\work\\ReflectDemo");
        if (file.isDirectory()) {//判断File对象对应的目录是否存在
            String[] names = file.list();
            for (String name : names) {
                System.out.println(name);
            }
            /**
             .gitignore
             .gradle
             .idea
             app
             build
             build.gradle
             gradle
             gradle.properties
             gradlew
             gradlew.bat
             local.properties
             mp3
             ReflectDemo.iml
             settings.gradle
             target2.txt
             test.txt
             test2.txt

             */
        }
    }
}
