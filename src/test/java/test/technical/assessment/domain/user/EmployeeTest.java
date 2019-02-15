package test.technical.assessment.domain.user;

import org.junit.Test;
import test.technical.assessment.domain.user.base.BaseUser;
import test.technical.assessment.testbase.TestBase;

import static org.junit.Assert.*;

public class EmployeeTest {

    private static double EMPLOYEE_DISCOUNT_RATE = 0.3D;

    @Test
    public void getDiscountRate() {
        BaseUser employeeUser = TestBase.userDOFactory.getLongTermEmployee();

        assertNotNull(employeeUser);
        assertEquals(employeeUser.getDiscountRate(), EMPLOYEE_DISCOUNT_RATE, 0.01D);
    }
}