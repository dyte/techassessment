package test.technical.assessment.service;

import org.junit.Test;
import test.technical.assessment.domain.order.base.BaseOrder;
import test.technical.assessment.testbase.TestBase;

import static org.junit.Assert.*;

public class BillCalculatorTest {

    @Test
    public void calculateDiscount() {
        testOnlineOrderWithLongTermEmployee();
        testOnlineOrderWithShortTermEmployee();
        testOnlineOrderWithLongTermAffiliate();
        testOnlineOrderWithShortTermAffiliate();
        testOnlineOrderWithLongTermUser();
        testOnlineOrderWithShortTermUser();

        testGroceryOrderWithLongTermEmployee();
        testGroceryOrderWithShortTermEmployee();
        testGroceryOrderWithLongTermAffiliate();
        testGroceryOrderWithShortTermAffiliate();
        testGroceryOrderWithLongTermUser();
        testGroceryOrderWithShortTermUser();
    }

    private void testOnlineOrderWithLongTermEmployee() {
        BaseOrder order = TestBase.orderDOFactory.getOnlineOrderWithLongTermEmployee();
        BillCalculator onlineLongTermCalculator = new BillCalculator<>(order);

        double actualOrder = onlineLongTermCalculator.calculateDiscount();
        double expectedOrder = testCalculateDiscount(order);


        assertEquals(actualOrder, expectedOrder, 0.01D);
    }

    private void testOnlineOrderWithShortTermEmployee() {
        BaseOrder order = TestBase.orderDOFactory.getOnlineOrderWithShortTermEmployee();
        BillCalculator onlineLongTermCalculator = new BillCalculator<>(order);

        double actualOrder = onlineLongTermCalculator.calculateDiscount();
        double expectedOrder = testCalculateDiscount(order);


        assertEquals(actualOrder, expectedOrder, 0.01D);
    }

    private void testOnlineOrderWithLongTermAffiliate() {
        BaseOrder order = TestBase.orderDOFactory.getOnlineOrderWithLongTermAffiliate();
        BillCalculator onlineLongTermCalculator = new BillCalculator<>(order);

        double actualOrder = onlineLongTermCalculator.calculateDiscount();
        double expectedOrder = testCalculateDiscount(order);


        assertEquals(actualOrder, expectedOrder, 0.01D);
    }

    private void testOnlineOrderWithShortTermAffiliate() {
        BaseOrder order = TestBase.orderDOFactory.getOnlineOrderWithShortTermAffiliate();
        BillCalculator onlineLongTermCalculator = new BillCalculator<>(order);

        double actualOrder = onlineLongTermCalculator.calculateDiscount();
        double expectedOrder = testCalculateDiscount(order);


        assertEquals(actualOrder, expectedOrder, 0.01D);
    }

    private void testOnlineOrderWithLongTermUser() {
        BaseOrder order = TestBase.orderDOFactory.getOnlineOrderWithLongTermUser();
        BillCalculator onlineLongTermCalculator = new BillCalculator<>(order);

        double actualOrder = onlineLongTermCalculator.calculateDiscount();
        double expectedOrder = testCalculateDiscount(order);


        assertEquals(actualOrder, expectedOrder, 0.01D);
    }

    private void testOnlineOrderWithShortTermUser() {
        BaseOrder order = TestBase.orderDOFactory.getOnlineOrderWithShortTermUser();
        BillCalculator onlineLongTermCalculator = new BillCalculator<>(order);

        double actualOrder = onlineLongTermCalculator.calculateDiscount();
        double expectedOrder = testCalculateDiscount(order);


        assertEquals(actualOrder, expectedOrder, 0.01D);
    }


    private void testGroceryOrderWithLongTermEmployee() {
        BaseOrder order = TestBase.orderDOFactory.getGroceryOrderWithLongTermEmployee();
        BillCalculator onlineLongTermCalculator = new BillCalculator<>(order);

        double actualOrder = onlineLongTermCalculator.calculateDiscount();
        double expectedOrder = testCalculateDiscount(order);


        assertEquals(actualOrder, expectedOrder, 0.01D);
    }

    private void testGroceryOrderWithShortTermEmployee() {
        BaseOrder order = TestBase.orderDOFactory.getGroceryOrderWithShortTermEmployee();
        BillCalculator onlineLongTermCalculator = new BillCalculator<>(order);

        double actualOrder = onlineLongTermCalculator.calculateDiscount();
        double expectedOrder = testCalculateDiscount(order);


        assertEquals(actualOrder, expectedOrder, 0.01D);
    }

    private void testGroceryOrderWithLongTermAffiliate() {
        BaseOrder order = TestBase.orderDOFactory.getGroceryOrderWithLongTermAffiliate();
        BillCalculator onlineLongTermCalculator = new BillCalculator<>(order);

        double actualOrder = onlineLongTermCalculator.calculateDiscount();
        double expectedOrder = testCalculateDiscount(order);


        assertEquals(actualOrder, expectedOrder, 0.01D);
    }

    private void testGroceryOrderWithShortTermAffiliate() {
        BaseOrder order = TestBase.orderDOFactory.getGroceryOrderWithShortTermAffiliate();
        BillCalculator onlineLongTermCalculator = new BillCalculator<>(order);

        double actualOrder = onlineLongTermCalculator.calculateDiscount();
        double expectedOrder = testCalculateDiscount(order);


        assertEquals(actualOrder, expectedOrder, 0.01D);
    }

    private void testGroceryOrderWithLongTermUser() {
        BaseOrder order = TestBase.orderDOFactory.getGroceryOrderWithLongTermUser();
        BillCalculator onlineLongTermCalculator = new BillCalculator<>(order);

        double actualOrder = onlineLongTermCalculator.calculateDiscount();
        double expectedOrder = testCalculateDiscount(order);


        assertEquals(actualOrder, expectedOrder, 0.01D);
    }

    private void testGroceryOrderWithShortTermUser() {
        BaseOrder order = TestBase.orderDOFactory.getGroceryOrderWithShortTermUser();
        BillCalculator onlineLongTermCalculator = new BillCalculator<>(order);

        double actualOrder = onlineLongTermCalculator.calculateDiscount();
        double expectedOrder = testCalculateDiscount(order);


        assertEquals(actualOrder, expectedOrder, 0.01D);
    }


    private double testCalculateDiscount(BaseOrder order) {
        double discount = 0D;
        if (order.applyPercentageBaseDiscount()) {
            discount = order.getAmount() * order.getUser().getDiscountRate();
        }

        double userDiscountedAmount = order.getAmount() - discount;
        return discount + order.calculateDiscount(userDiscountedAmount);
    }

    private double getOrderDiscount(double discountedAmount, BaseOrder order) {
        return order.calculateDiscount(discountedAmount);
    }
}