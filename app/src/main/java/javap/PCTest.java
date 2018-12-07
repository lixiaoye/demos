package javap;

/**
 * Created by lixiaoye on 2018/12/5.
 */

public class PCTest {
    public int calc() {
        int a = 100;
        int b = 200;
        int c = 300;
        return (a + b) * c;
    }
}

/**

 D:\work\Demos\app\src\main\java>javac PCTest.java

 D:\work\Demos\app\src\main\java>javap -c PCTest.class
 Compiled from "PCTest.java"
 public class PCTest {
 public PCTest();
 Code:
 0: aload_0
 1: invokespecial #1                  // Method java/lang/Object."<init>":
 ()V
 4: return

 public int calc();
 Code:
 0: bipush        100
 2: istore_1
 3: sipush        200
 6: istore_2
 7: sipush        300
 10: istore_3
 11: iload_1
 12: iload_2
 13: iadd
 14: iload_3
 15: imul
 16: ireturn
 }
 */