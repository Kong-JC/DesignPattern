package command_pattern;

import com.sun.org.apache.xpath.internal.operations.Or;

/**
 * Created by Kong on 2016/11/3.
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
