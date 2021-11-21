package com.core.springcorestudy.discount;

import com.core.springcorestudy.AppConfig;
import com.core.springcorestudy.member.Grade;
import com.core.springcorestudy.member.Member;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RateDiscountPolicyTest {

    RateDiscountPolicy discountPolicy = new RateDiscountPolicy();

    @Test
    @DisplayName("VIP는 10% 할인이 적용되어야 한다")
    void vip_discount_10_percent() {

        // given
        Member member = new Member(1L, "memberVIP", Grade.VIP);

        // when
        int discount = discountPolicy.discount(member, 10000);

        // then
        assertEquals(discount, 1000);
    }

    @Test
    @DisplayName("VIP가 아니면 할인이 적용되지 않아야 한다")
    void not_vip_discount_none() {

        // given
        Member member = new Member(1L, "memberVIP", Grade.BASIC);

        // when
        int discount = discountPolicy.discount(member, 10000);

        // then
        assertEquals(discount, 0);
    }


}