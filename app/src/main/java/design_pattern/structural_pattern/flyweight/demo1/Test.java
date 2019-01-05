package design_pattern.structural_pattern.flyweight.demo1;

import java.net.ServerSocket;

/**
 * Created by LIXIAOYE on 2018/12/26.
 */

public class Test {
    public static void main(String[] args) {
        Ticket ticket01 = TicketFactory.getTicket("北京", "青岛");
        ticket01.showTicketInfo("上铺");
        Ticket ticket02 = TicketFactory.getTicket("北京", "青岛");
        ticket02.showTicketInfo("下铺");
        Ticket ticket03 = TicketFactory.getTicket("北京", "青岛");
        ticket03.showTicketInfo("坐票");
    }
    /**
     * 打印结果：
     创建对象==> 北京-青岛
     购买从 北京 到 青岛的 上铺 火车票,价格：244
     使用缓存==> 北京-青岛
     购买从 北京 到 青岛的 下铺 火车票,价格：130
     使用缓存==> 北京-青岛
     购买从 北京 到 青岛的 坐票 火车票,价格：298
     */
//ServerSocket
}
