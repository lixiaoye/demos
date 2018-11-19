package data_structure.file;

import java.io.File;

public class Test1 {
    public static void main(String[] args) {
        File file = new File("example.txt");//创建File文件对象，表示一个文件
        //获取文件名称
        System.out.println(file.getName());//example.txt
        //获取文件的相对路径
        System.out.println(file.getPath());//example.txt
        //获取文件的绝对路径
        System.out.println(file.getAbsolutePath());//D:\work\ReflectDemo\example.txt
        //获取文件的父路径
        System.out.println(file.getParent());//null
        //判断文件是否可读
        System.out.println(file.canRead());//false
        //判断文件是否可写
        System.out.println(file.canWrite());//false
        //判断是否是一个文件
        System.out.println(file.isFile() ? "是一个文件" : "不是一个文件");//不是一个文件
        //判断是否是一个目录
        System.out.println(file.isDirectory() ? "是一个目录" : "不是一个目录");//不是一个目录
        //判断是否是一个绝对路径
        System.out.println(file.isAbsolute() ? "是绝对路径" : "不是绝对路径");//不是绝对路径
        //得到文件最后修改的时间
        System.out.println("最后修改时间为：" + file.lastModified());//最后修改时间为：0
        //得到文件的大小
        System.out.println("文件大小为：" + file.length() + "bytes");//文件大小为：0bytes
        //是否成功删除文件
        System.out.println(file.delete());//false
    }
}
