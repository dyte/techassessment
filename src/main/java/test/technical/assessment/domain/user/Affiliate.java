package test.technical.assessment.domain.user;

public class Affiliate extends User {

    private static double AFFILIATE_DISCOUNT_RATE = 0.1D;

    @Override
    public double getDiscountRate() {
        return AFFILIATE_DISCOUNT_RATE;
    }
}
