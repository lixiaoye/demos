package stream;

import java.io.FileOutputStream;

public class Test2 {
    public static void main(String[] args) throws Exception {
        //创建一个文件字节输出流
        FileOutputStream fos=new FileOutputStream("test2.txt");
        String str="hello";
        byte[] b=str.getBytes();
        for (int i = 0; i <b.length ; i++) {
            fos.write(b[i]);
        }
        fos.close();
    }

}
