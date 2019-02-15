package test.technical.assessment.domain.user;

import org.junit.Test;
import test.technical.assessment.domain.user.base.BaseUser;
import test.technical.assessment.testbase.TestBase;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import static org.junit.Assert.*;

public class UserTest {

    private final double USER_RATE = 0.05D;
    private final int MEMBERSHIP_DATE_SPEC = 365 * 2;

    @Test
    public void getDiscountRate() {
        BaseUser longTermUser = TestBase.userDOFactory.getLongTermUser();
        validateDiscountRate(longTermUser);

        BaseUser shortTermUser = TestBase.userDOFactory.getShortTermUser();
        validateDiscountRate(shortTermUser);


    }

    private void validateDiscountRate(BaseUser user) {
        double actualRate = user.getDiscountRate();

        if (isLongTermUser(user)) {
            assertEquals(actualRate, USER_RATE, 0.01);
        } else {
            assertEquals(actualRate, 0D, 0D);
        }
    }

    private boolean isLongTermUser(BaseUser user) {
        long membershipDayCount = ChronoUnit.DAYS.between(user.getMembershipDate(), LocalDate.now());
        return membershipDayCount > MEMBERSHIP_DATE_SPEC;
    }


}