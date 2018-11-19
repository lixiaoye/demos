package stream;

import java.io.FileInputStream;

public class Test1 {
    public static void main(String[] args) throws Exception {
        //创建一个文件字节输入流
        FileInputStream fin = new FileInputStream("test.txt");
        int b = 0;
        while (true) {
            b = fin.read();
            if (b == -1) {
                break;
            }
            System.out.println(b);
        }
        fin.close();
        /**
         108
         120
         121
         13
         10
         */
    }
}
