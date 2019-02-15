package test.technical.assessment.domain.order.base;

import org.junit.Assert;
import org.junit.Test;
import test.technical.assessment.domain.user.base.BaseUser;
import test.technical.assessment.testbase.TestBase;

public class BaseOrderTest {

    private final double NO_DISCOUNT = 0D;
    private final int OVER_HUNDRED_DISCOUNT = 5;
    private final int DISCOUNT_LIMIT = 100;


    @Test
    public void commonDiscountCalculatorWithAmountLessThanZero() {
        BaseOrder order = TestBase.orderDOFactory.getGroceryOrderWithLongTermAffiliate();
        double discount = order.commonDiscountCalculator(0);

        Assert.assertEquals(discount, NO_DISCOUNT, 0D);
    }

    @Test
    public void commonDiscountCalculatorWithAmountGreaterThanZero() {
        BaseOrder order = TestBase.orderDOFactory.getGroceryOrderWithLongTermAffiliate();
        final double orderAmount = 1000D;
        double discount = order.commonDiscountCalculator(orderAmount);

        Double rate = orderAmount / DISCOUNT_LIMIT;
        double expectedDiscount = rate.intValue() * OVER_HUNDRED_DISCOUNT;

        Assert.assertEquals(discount, expectedDiscount, 0.01);
    }

    @Test
    public void getAmount() {
        BaseOrder order = TestBase.orderDOFactory.getGroceryOrderWithLongTermUser();

        Assert.assertNotNull(order);
        Assert.assertNotNull(order.getAmount());
    }

    @Test
    public void setAmount() {
        BaseOrder order = TestBase.orderDOFactory.getGroceryOrderWithLongTermUser();

        Assert.assertNotNull(order);
        Assert.assertNotNull(order.getAmount());
    }

    @Test
    public void setUser() {
        BaseOrder order = TestBase.orderDOFactory.getGroceryOrderWithLongTermUser();
        BaseUser expectedUser = TestBase.userDOFactory.getLongTermUser();

        Assert.assertNotNull(order.getUser());
        Assert.assertEquals(order.getUser().getFullName(), expectedUser.getFullName());
    }
}