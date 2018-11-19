package system;

import java.io.IOException;
import java.util.Random;

public class Test {
    public static void main(String[] args) throws IOException, InterruptedException {
      /*  long startTime = System.currentTimeMillis();//循环开始时的当前时间
        int sum = 0;
        for (int i = 0; i < 100000000; i++) {
            sum += i;
        }
        long endTime = System.currentTimeMillis();//循环结束后的当前时间
        System.out.println("程序运行的时间为：" + (endTime - startTime) + "毫秒");//程序运行的时间为：31毫秒*/

       /* int[] fromArray = {101, 102, 103, 104, 105, 106};//源数组 6
        int[] destArray = {201, 202, 203, 204, 205, 206, 207};//目标数组:7
        System.arraycopy(fromArray, 2, destArray, 3, 4);
        for (int i = 0; i < destArray.length; i++) {
            System.out.print(destArray[i] + " ");//201 202 203 103 104 105 106
        }*/

//        Runtime runtime = Runtime.getRuntime();//获取Runtime对象
//        System.out.println("处理器的个数：" + runtime.availableProcessors());//处理器的个数：8
//        System.out.println("空闲内存数量:" + runtime.freeMemory() / 1024 / 1024 + "M");//空闲内存数量:118M
//        System.out.println("最大可用内存数量：" + runtime.maxMemory() / 1024 / 1024 + "M");//最大可用内存数量：1774M

//        runtime.exec("notepad.exe");

//        Runtime runtime = Runtime.getRuntime();//创建一个Runtime实例对象
//        Process process = runtime.exec("notepad.exe");//得到表示进程的Process对象
//        Thread.sleep(3000);//程序休眠3秒
//        process.destroy();//杀死进程

//        System.out.println(Math.round(4.5));//5
//        System.out.println(Math.ceil(5.6));//6.0
//        System.out.println(Math.floor(-4.2));//-5.0

//        Random random = new Random();//不传入种子
//        for (int i = 0; i < 10; i++) {
//            //随机产生10个[0,100)之间的整数
//            System.out.println(random.nextInt(100));
//            /**
//             19
//             97
//             10
//             24
//             37
//             50
//             80
//             99
//             51
//             49
//             */
//        }

        Random random = new Random(13);//创建对象时传入种子
        for (int i = 0; i < 10; i++) {
            System.out.println(random.nextInt(100));
            /**
             92
             0
             75
             98
             63
             10
             93
             13
             56
             14
             */
        }
    }

}
