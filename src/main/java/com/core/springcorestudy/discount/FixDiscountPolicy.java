package com.core.springcorestudy.discount;

import com.core.springcorestudy.member.Grade;
import com.core.springcorestudy.member.Member;

public class FixDiscountPolicy implements DiscountPolicy {

    private int discountFixAmount = 1000;

    @Override
    public int discount(Member memmber, int price) {

        if (memmber.getGrade() == Grade.VIP) {
            return discountFixAmount;
        }

        return 0;
    }

}
