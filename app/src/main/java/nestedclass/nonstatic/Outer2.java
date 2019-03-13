package nestedclass.nonstatic;

/**
 * Created by lixiaoye on 2019/3/12.
 */

public class Outer2 {
    private int out = 1;

    public void method(final int param) {
        final int in = 2;
        new Thread() {
            @Override
            public void run() {
                out = param;
                out = in;
            }
        }.start();
    }

    /**
     D:\workspace\demos\app\src\main\java\nestedclass\nonstatic>javap -l -v Outer2$1.class
     Classfile /D:/workspace/demos/app/src/main/java/nestedclass/nonstatic/Outer2$1.class
     Last modified 2019-3-12; size 599 bytes
     MD5 checksum fc6bb04470a623c99b0fe37f15bffb00
     Compiled from "Outer2.java"
     class nestedclass.nonstatic.Outer2$1 extends java.lang.Thread
     minor version: 0
     major version: 52
     flags: ACC_SUPER
     Constant pool:
     #1 = Fieldref           #5.#22         // nestedclass/nonstatic/Outer2$1.this$0:Lnestedclass/nonstatic/Outer2;
     #2 = Fieldref           #5.#23         // nestedclass/nonstatic/Outer2$1.val$param:I
     #3 = Methodref          #6.#24         // java/lang/Thread."<init>":()V
     #4 = Methodref          #20.#25        // nestedclass/nonstatic/Outer2.access$002:(Lnestedclass/nonstatic/Outer2;I)I
     #5 = Class              #26            // nestedclass/nonstatic/Outer2$1
     #6 = Class              #28            // java/lang/Thread
     #7 = Utf8               val$param
     #8 = Utf8               I
     #9 = Utf8               this$0
     #10 = Utf8               Lnestedclass/nonstatic/Outer2;
     #11 = Utf8               <init>
     #12 = Utf8               (Lnestedclass/nonstatic/Outer2;I)V
     #13 = Utf8               Code
     #14 = Utf8               LineNumberTable
     #15 = Utf8               run
     #16 = Utf8               ()V
     #17 = Utf8               SourceFile
     #18 = Utf8               Outer2.java
     #19 = Utf8               EnclosingMethod
     #20 = Class              #29            // nestedclass/nonstatic/Outer2
     #21 = NameAndType        #30:#31        // method:(I)V
     #22 = NameAndType        #9:#10         // this$0:Lnestedclass/nonstatic/Outer2;
     #23 = NameAndType        #7:#8          // val$param:I
     #24 = NameAndType        #11:#16        // "<init>":()V
     #25 = NameAndType        #32:#33        // access$002:(Lnestedclass/nonstatic/Outer2;I)I
     #26 = Utf8               nestedclass/nonstatic/Outer2$1
     #27 = Utf8               InnerClasses
     #28 = Utf8               java/lang/Thread
     #29 = Utf8               nestedclass/nonstatic/Outer2
     #30 = Utf8               method
     #31 = Utf8               (I)V
     #32 = Utf8               access$002
     #33 = Utf8               (Lnestedclass/nonstatic/Outer2;I)I
     {
     final int val$param;
     descriptor: I
     flags: ACC_FINAL, ACC_SYNTHETIC

     final nestedclass.nonstatic.Outer2 this$0;
     descriptor: Lnestedclass/nonstatic/Outer2;
     flags: ACC_FINAL, ACC_SYNTHETIC

     nestedclass.nonstatic.Outer2$1(nestedclass.nonstatic.Outer2, int);
     descriptor: (Lnestedclass/nonstatic/Outer2;I)V
     flags:
     Code:
     stack=2, locals=3, args_size=3
     0: aload_0
     1: aload_1
     2: putfield      #1                  // Field this$0:Lnestedclass/nonstatic/Outer2;
     5: aload_0
     6: iload_2
     7: putfield      #2                  // Field val$param:I
     10: aload_0
     11: invokespecial #3                  // Method java/lang/Thread."<init>":()V
     14: return
     LineNumberTable:
     line 12: 0

     public void run();
     descriptor: ()V
     flags: ACC_PUBLIC
     Code:
     stack=2, locals=1, args_size=1
     0: aload_0
     1: getfield      #1                  // Field this$0:Lnestedclass/nonstatic/Outer2;
     4: aload_0
     5: getfield      #2                  // Field val$param:I
     8: invokestatic  #4                  // Method nestedclass/nonstatic/Outer2.access$002:(Lnestedclass/nonstatic/Outer2;I)I
     11: pop
     12: aload_0
     13: getfield      #1                  // Field this$0:Lnestedclass/nonstatic/Outer2;
     16: iconst_2
     17: invokestatic  #4                  // Method nestedclass/nonstatic/Outer2.access$002:(Lnestedclass/nonstatic/Outer2;I)I
     20: pop
     21: return
     LineNumberTable:
     line 15: 0
     line 16: 12
     line 17: 21
     }
     SourceFile: "Outer2.java"
     EnclosingMethod: #20.#21                // nestedclass.nonstatic.Outer2.method
     InnerClasses:
     #5; //class nestedclass/nonstatic/Outer2$1

     */
}
