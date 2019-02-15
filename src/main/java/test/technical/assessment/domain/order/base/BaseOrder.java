package test.technical.assessment.domain.order.base;

import test.technical.assessment.domain.user.base.BaseUser;

public abstract class BaseOrder {

    private final double NO_DISCOUNT = 0D;
    private final int OVER_HUNDRED_DISCOUNT = 5;
    private final int DISCOUNT_LIMIT = 100;

    private Double amount;
    private BaseUser user;

    public abstract boolean applyPercentageBaseDiscount();

    public abstract double calculateDiscount(double amount);

    public double commonDiscountCalculator(double amount) {
        if (amount <= 0) {
            return NO_DISCOUNT;
        }

        Double rateOverHundred = amount / DISCOUNT_LIMIT;
        return rateOverHundred.intValue() * OVER_HUNDRED_DISCOUNT;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public BaseUser getUser() {
        return user;
    }

    public void setUser(BaseUser user) {
        this.user = user;
    }
}
