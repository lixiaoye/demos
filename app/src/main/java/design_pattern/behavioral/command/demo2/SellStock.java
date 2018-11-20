package design_pattern.behavioral.command.demo2;

/**
 * Create concrete class implementing the Order interface.
 * 具体命令类：卖出股票的命令类
 */

public class SellStock implements Order {
    private Stock stock;

    public SellStock(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.sell();
    }
}
