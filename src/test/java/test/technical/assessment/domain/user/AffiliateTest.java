package test.technical.assessment.domain.user;

import org.junit.Test;
import test.technical.assessment.domain.user.base.BaseUser;
import test.technical.assessment.testbase.TestBase;

import static org.junit.Assert.*;

public class AffiliateTest {

    private static double AFFILIATE_DISCOUNT_RATE = 0.1D;

    @Test
    public void getDiscountRate() {
        BaseUser affiliateUser = TestBase.userDOFactory.getLongTermAffiliate();

        assertNotNull(affiliateUser);
        assertEquals(affiliateUser.getDiscountRate(), AFFILIATE_DISCOUNT_RATE, 0.01D);
    }
}