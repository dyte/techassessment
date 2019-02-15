package test.technical.assessment.testbase.datahelper;

import test.technical.assessment.domain.order.GroceryOrder;
import test.technical.assessment.domain.order.MobileOrder;
import test.technical.assessment.domain.order.OnlineOrder;
import test.technical.assessment.domain.order.base.BaseOrder;

public class OrderDOFactory {

    private UserDOFactory userDOFactory;
    private double randomAmount;

    public OrderDOFactory() {
        this.userDOFactory = new UserDOFactory();
        this.randomAmount = Math.random() * 1000D;
    }

    public BaseOrder getOnlineOrderWithLongTermEmployee() {
        BaseOrder order = new OnlineOrder();
        order.setAmount(this.randomAmount);
        order.setUser(userDOFactory.getLongTermEmployee());
        return order;
    }

    public BaseOrder getOnlineOrderWithShortTermEmployee() {
        BaseOrder order = new OnlineOrder();
        order.setAmount(this.randomAmount);
        order.setUser(userDOFactory.getShortTermEmployee());
        return order;
    }

    public BaseOrder getOnlineOrderWithLongTermAffiliate() {
        BaseOrder order = new OnlineOrder();
        order.setAmount(this.randomAmount);
        order.setUser(userDOFactory.getLongTermAffiliate());
        return order;
    }

    public BaseOrder getOnlineOrderWithShortTermAffiliate() {
        BaseOrder order = new OnlineOrder();
        order.setAmount(this.randomAmount);
        order.setUser(userDOFactory.getShortTermAffiliate());
        return order;
    }

    public BaseOrder getOnlineOrderWithLongTermUser() {
        BaseOrder order = new OnlineOrder();
        order.setAmount(this.randomAmount);
        order.setUser(userDOFactory.getLongTermUser());
        return order;
    }

    public BaseOrder getOnlineOrderWithShortTermUser() {
        BaseOrder order = new OnlineOrder();
        order.setAmount(this.randomAmount);
        order.setUser(userDOFactory.getShortTermUser());
        return order;
    }

    public BaseOrder getGroceryOrderWithLongTermEmployee() {
        BaseOrder order = new GroceryOrder();
        order.setUser(userDOFactory.getLongTermEmployee());
        order.setAmount(this.randomAmount);
        return order;
    }

    public BaseOrder getGroceryOrderWithShortTermEmployee() {
        BaseOrder order = new GroceryOrder();
        order.setUser(userDOFactory.getShortTermEmployee());
        order.setAmount(this.randomAmount);
        return order;
    }

    public BaseOrder getGroceryOrderWithLongTermAffiliate() {
        BaseOrder order = new GroceryOrder();
        order.setUser(userDOFactory.getLongTermAffiliate());
        order.setAmount(this.randomAmount);
        return order;
    }

    public BaseOrder getGroceryOrderWithShortTermAffiliate() {
        BaseOrder order = new GroceryOrder();
        order.setUser(userDOFactory.getShortTermAffiliate());
        order.setAmount(this.randomAmount);
        return order;
    }

    public BaseOrder getGroceryOrderWithLongTermUser() {
        BaseOrder order = new GroceryOrder();
        order.setUser(userDOFactory.getLongTermUser());
        order.setAmount(this.randomAmount);
        return order;
    }

    public BaseOrder getGroceryOrderWithShortTermUser() {
        BaseOrder order = new GroceryOrder();
        order.setUser(userDOFactory.getShortTermUser());
        order.setAmount(this.randomAmount);
        return order;
    }
}
