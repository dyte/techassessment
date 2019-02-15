package test.technical.assessment.domain.order;

import test.technical.assessment.domain.order.base.BaseOrder;

public class OnlineOrder extends BaseOrder {

    @Override
    public boolean applyPercentageBaseDiscount() {
        return true;
    }

    @Override
    public double calculateDiscount(double amount) {
        return commonDiscountCalculator(amount);
    }
}
