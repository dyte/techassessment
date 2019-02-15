package test.technical.assessment.service;

import test.technical.assessment.domain.order.base.BaseOrder;

/***
 * @author C. Engin Bilici
 * @param <T extends BaseOrder>
 */
public class BillCalculator<T extends BaseOrder> {

    private BaseOrder T;

    public BillCalculator(T baseOrder) {
        this.T = baseOrder;
    }
    public double calculateDiscount() {
        double discount = 0D;
        if(T.applyPercentageBaseDiscount()) {
            discount = T.getUser().getDiscountRate() * T.getAmount();
        }

        double userDiscountedAmount = T.getAmount() - discount;
        return discount + T.calculateDiscount(userDiscountedAmount);
    }
}