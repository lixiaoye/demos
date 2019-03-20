package synchronizedDemo;

/**
 * Created by lixiaoye on 2019/3/19.
 */

public class SynchronizedTest {
    public synchronized void sychronized_method() {

    }

    public static synchronized void synchronized_static_method() {

    }

    public void method_block_synchronized() {
        synchronized (this) {

        }
    }
    /**
     D:\workspace\demos\app\src\main\java\synchronizedDemo>javap -c -v SynchronizedTest.class
     Classfile /D:/workspace/demos/app/src/main/java/synchronizedDemo/SynchronizedTest.class
     Last modified 2019-3-19; size 530 bytes
     MD5 checksum 3b4ae29921d3578a177353653251701a
     Compiled from "SynchronizedTest.java"
     public class synchronizedDemo.SynchronizedTest
     minor version: 0
     major version: 52
     flags: ACC_PUBLIC, ACC_SUPER
     Constant pool:
     #1 = Methodref          #3.#17         // java/lang/Object."<init>":()V
     #2 = Class              #18            // synchronizedDemo/SynchronizedTest
     #3 = Class              #19            // java/lang/Object
     #4 = Utf8               <init>
     #5 = Utf8               ()V
     #6 = Utf8               Code
     #7 = Utf8               LineNumberTable
     #8 = Utf8               sychronized_method
     #9 = Utf8               synchronized_static_method
     #10 = Utf8               method_block_synchronized
     #11 = Utf8               StackMapTable
     #12 = Class              #18            // synchronizedDemo/SynchronizedTest
     #13 = Class              #19            // java/lang/Object
     #14 = Class              #20            // java/lang/Throwable
     #15 = Utf8               SourceFile
     #16 = Utf8               SynchronizedTest.java
     #17 = NameAndType        #4:#5          // "<init>":()V
     #18 = Utf8               synchronizedDemo/SynchronizedTest
     #19 = Utf8               java/lang/Object
     #20 = Utf8               java/lang/Throwable
     {
     public synchronizedDemo.SynchronizedTest();
     descriptor: ()V
     flags: ACC_PUBLIC
     Code:
     stack=1, locals=1, args_size=1
     0: aload_0
     1: invokespecial #1                  // Method java/lang/Object."<init>":()V
     4: return
     LineNumberTable:
     line 7: 0

     public synchronized void sychronized_method();
     descriptor: ()V
     flags: ACC_PUBLIC, ACC_SYNCHRONIZED
     Code:
     stack=0, locals=1, args_size=1
     0: return
     LineNumberTable:
     line 10: 0

     public static synchronized void synchronized_static_method();
     descriptor: ()V
     flags: ACC_PUBLIC, ACC_STATIC, ACC_SYNCHRONIZED
     Code:
     stack=0, locals=0, args_size=0
     0: return
     LineNumberTable:
     line 14: 0

     public void method_block_synchronized();
     descriptor: ()V
     flags: ACC_PUBLIC
     Code:
     stack=2, locals=3, args_size=1
     0: aload_0
     1: dup
     2: astore_1
     3: monitorenter
     4: aload_1
     5: monitorexit
     6: goto          14
     9: astore_2
     10: aload_1
     11: monitorexit
     12: aload_2
     13: athrow
     14: return
     Exception table:
     from    to  target type
     4     6     9   any
     9    12     9   any
     LineNumberTable:
     line 17: 0
     line 19: 4
     line 20: 14
     StackMapTable: number_of_entries = 2
     frame_type = 255 // full_frame
    offset_delta = 9
    locals = [ class synchronizedDemo/SynchronizedTest, class java/lang/Object ]
    stack = [ class java/lang/Throwable ]
    frame_type = 250 // chop
    offset_delta = 4
    }
SourceFile: "SynchronizedTest.java"

        D:\workspace\demos\app\src\main\java\synchronizedDemo>
     */


}

