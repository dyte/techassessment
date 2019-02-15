package test.technical.assessment.domain.user.base;

import java.time.LocalDate;

public abstract class BaseUser {

    private String fullName;
    private LocalDate membershipDate;

    public abstract double getDiscountRate();


    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public LocalDate getMembershipDate() {
        return membershipDate;
    }

    public void setMembershipDate(LocalDate membershipDate) {
        this.membershipDate = membershipDate;
    }
}
