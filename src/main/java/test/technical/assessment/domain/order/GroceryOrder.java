package test.technical.assessment.domain.order;

import test.technical.assessment.domain.order.base.BaseOrder;

public class GroceryOrder extends BaseOrder {

    @Override
    public boolean applyPercentageBaseDiscount() {
        return false;
    }

    @Override
    public double calculateDiscount(double amount) {
        return commonDiscountCalculator(amount);
    }
}
