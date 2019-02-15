package test.technical.assessment.domain.order;

import org.junit.Assert;
import org.junit.Test;
import test.technical.assessment.domain.order.base.BaseOrder;
import test.technical.assessment.testbase.TestBase;

import static org.junit.Assert.*;

public class GroceryOrderTest {

    private final int OVER_HUNDRED_DISCOUNT = 5;
    private final int DISCOUNT_LIMIT = 100;

    @Test
    public void applyPercentageBaseDiscount() {
        BaseOrder baseOrder = TestBase.orderDOFactory.getGroceryOrderWithLongTermAffiliate();

        assertEquals(baseOrder.applyPercentageBaseDiscount(), false);
    }

    @Test
    public void calculateDiscount() {

        BaseOrder baseOrder = TestBase.orderDOFactory.getGroceryOrderWithShortTermAffiliate();
        double actual = baseOrder.calculateDiscount(baseOrder.getAmount());


        Double rate = baseOrder.getAmount() / DISCOUNT_LIMIT;
        double expectedDiscount = rate.intValue() * OVER_HUNDRED_DISCOUNT;

        Assert.assertEquals(actual, expectedDiscount, 0.01);
    }
}