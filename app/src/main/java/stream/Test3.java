package stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class Test3 {
    public static void main(String[] args) throws Exception {
        OutputStream out = new FileOutputStream("test2.txt", true);
        String str = "world";
        byte[] b = str.getBytes();
        for (int i = 0; i < b.length; i++) {
            out.write(b[i]);
        }
        out.close();
        try {

        } finally {
            try {
//                if (in != null) {
//                    in.close;
//                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                if (out != null) {
                    out.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
