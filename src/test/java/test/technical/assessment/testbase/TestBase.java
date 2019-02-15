package test.technical.assessment.testbase;

import test.technical.assessment.testbase.datahelper.OrderDOFactory;
import test.technical.assessment.testbase.datahelper.UserDOFactory;

public abstract class TestBase {

    public static OrderDOFactory orderDOFactory;
    public static UserDOFactory userDOFactory;

    static {
        TestBase.setUpFactories();
    }

    private static void setUpFactories() {
        TestBase.userDOFactory = new UserDOFactory();
        TestBase.orderDOFactory = new OrderDOFactory();
    }
}
