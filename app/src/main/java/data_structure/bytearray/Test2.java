package data_structure.bytearray;

import java.io.ByteArrayInputStream;

public class Test2 {
    public static void main(String[] args) {
        byte[] bufs = new byte[]{97, 99, 100, 102};//创建一个字节数组
        ByteArrayInputStream bis = new ByteArrayInputStream(bufs);//读取字节数组中的数据
        int b;
        while ((b = bis.read()) != -1) {
            System.out.println(b);
            /**
             97
             99
             100
             102
             */
            System.out.println((char) b);
            /**
             a
             c
             d
             f
             */
        }
    }
}
