package data_structure.bytearray;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Test1 {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("test.txt");
        ByteArrayOutputStream bos = new ByteArrayOutputStream();//创建一个字节数组缓冲区
        FileOutputStream fos = new FileOutputStream("target2.txt");
        //循环读取缓冲区中的数据，并将数据一次性地写入文件
        int b;
        while ((b = fis.read()) != -1) {
            bos.write(b);
        }
        fis.close();
        bos.close();
        fos.write(bos.toByteArray());//将缓冲区中的数据一次性写入文件
        fos.close();
    }
}
