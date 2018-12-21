package queue.demo1;

/**
 * Created by LIXIAOYE on 2018/12/17.
 */

import java.util.LinkedList;
import java.util.Queue;

/**
 * 队列是一种特殊的线性表，它只允许在表的前端进行删除操作，在表的后端进行插入操作。
 * LinkedList类实现了Queue接口，因此可以将LinkedList当成Queue使用。
 */
public class Test {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<String>();
        queue.offer("a");
        queue.offer("b");
        queue.offer("c");
        queue.offer("d");
        queue.offer("e");
        System.out.println("调用offer()方法之后queue队列中元素:");
        for (String q : queue) {
            System.out.print(q + ",");
        }
        System.out.println();
        System.out.println("poll=" + queue.poll());//返回第一个元素，并在队列中删除
        System.out.println("调用poll()方法之后queue队列中元素：");
        for (String q : queue) {
            System.out.print(q + ",");
        }
        System.out.println();
        System.out.println("element()=" + queue.element());//返回第一个元素
        System.out.println("调用queue.element()方法之后queue队列中元素：");
        for (String s : queue) {
            System.out.print(s + ",");
        }
        System.out.println();
        System.out.println("peek()=" + queue.peek());//返回第一个元素
        System.out.println("调用完queue.peek()之后的queue队列中元素：");
        for (String q : queue) {
            System.out.print(q + ",");
        }
    }
    /**
     * 打印结果：
     调用offer()方法之后queue队列中元素:
     a,b,c,d,e,
     poll=a
     调用poll()方法之后queue队列中元素：
     b,c,d,e,
     element()=b
     调用queue.element()方法之后queue队列中元素：
     b,c,d,e,
     peek()=b
     调用完queue.peek()之后的queue队列中元素：
     b,c,d,e,

     */
}


























