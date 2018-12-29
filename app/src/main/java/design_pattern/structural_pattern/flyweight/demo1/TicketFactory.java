package design_pattern.structural_pattern.flyweight.demo1;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by LIXIAOYE on 2018/12/26.
 */

public class TicketFactory {
 /*   public static Ticket getTicket(String from, String to) {
        return new TrainTicket(from, to);
        *//**
         * 此种方式每次回new对象，如果短时间内有3000万的用户求购北京到青岛的车票，
         * 那么北京到青岛的车票对象就会被创建3000万次，当数据返回之后这些对象变得无用了又会被虚拟机回收。
         * 此时就会造成大量的重复对象存在内存中，GC对这些对象的回收也会非常消耗资源。
         *  如果用户的请求量很大可能导致系统变得极其缓慢，甚至可能导致OOM。
         *  优化：可采用享元模式通过消息池的形式有效地减少了重复对象的存在。
         *  它通过内部状态标识某个种类的对象，外部程序根据这个不会变化的内部状态从消息池中取出对象。
         *  使得同一类对象可以被复用，避免大量重复对象。
         *//*
    }*/

    static Map<String, Ticket> sTicketMap = new ConcurrentHashMap<String, Ticket>();

    public static Ticket getTicket(String from, String to) {
        String key = from + "-" + to;
        if (sTicketMap.containsKey(key)) {
            System.out.println("使用缓存==> " + key);
            return sTicketMap.get(key);
        } else {
            System.out.println("创建对象==> " + key);
            Ticket ticket = new TrainTicket(from, to);
            sTicketMap.put(key, ticket);
            return ticket;
        }
    }
}
