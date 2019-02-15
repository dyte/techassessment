package test.technical.assessment.domain.user;

import test.technical.assessment.domain.user.base.BaseUser;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class User extends BaseUser {

    private final double USER_RATE = 0.05D;
    private final int MEMBERSHIP_DATE_SPEC = 365 * 2;

    @Override
    public double getDiscountRate() {
        long membershipDayCount = ChronoUnit.DAYS.between(getMembershipDate(), LocalDate.now());
        if (membershipDayCount > MEMBERSHIP_DATE_SPEC) {
            return USER_RATE;
        }
        return 0D;
    }
}