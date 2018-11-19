package data_structure.file;

import java.io.File;

public class Test5 {
    public static void main(String[] args) {
        File file = new File("E:\\test");//代表目录的File对象
        deleteDir(file);
//        if (data_structure.file.exists()) {
//            System.out.println(data_structure.file.delete());//false
//        }
    }

    private static void deleteDir(File dir) {
        if (dir.exists()) {
            File[] files = dir.listFiles();
            for (File file : files) {
                if (file.isDirectory()) {
                    deleteDir(file);
                } else {
                    //如果是文件，直接删除
                    System.out.println(file.delete());//true
                }
            }
            //删除完一个目录里的所哟文件后，就删除这个目录
            System.out.println(dir.delete());//true
        }
    }
}
