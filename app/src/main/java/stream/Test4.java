package stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Test4 {
    public static void main(String[] args) throws Exception {
        //创建一个字节输入流，用于读取当前目录下sourse文件夹中的mp3文件
        InputStream in = new FileInputStream("E:\\Kugou\\bgm.mp3");
        //创建一个文件字节输出流，用于将读取的数据写入target目录下的文件中。
        OutputStream out = new FileOutputStream("mp3\\bgm.mp3");
        int len;
        long begintime = System.currentTimeMillis();
        while ((len = in.read()) != -1) {
            out.write(len);
        }
        long endtime = System.currentTimeMillis();
        System.out.println("拷贝文件所消耗的时间是：" + (endtime - begintime) + "ms");//拷贝文件所消耗的时间是：14003ms
        in.close();
        out.close();
    }

}
