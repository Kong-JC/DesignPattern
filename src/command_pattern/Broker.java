package command_pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kong on 2016/11/3.
 */
public class Broker {

    private List<Order> mOrderList = new ArrayList<>();

    public void takeOrder(Order order) {
        mOrderList.add(order);
    }

    public void placeOrder() {
        for (Order order : mOrderList) {
            order.execute();
        }
        mOrderList.clear();
    }

}
