package design_pattern.behavioral.command.demo2;

/**
 * Create concrete classes implementing the Order interface.
 * 具体命令类：买入股票命令类
 */

public class BuyStock implements Order {
    private Stock stock;

    public BuyStock(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.buy();
    }
}
