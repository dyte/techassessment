package test.technical.assessment.domain.user;

public class Employee extends User {

    private static double EMPLOYEE_DISCOUNT_RATE = 0.3D;

    @Override
    public double getDiscountRate() {
        return EMPLOYEE_DISCOUNT_RATE;
    }
}
