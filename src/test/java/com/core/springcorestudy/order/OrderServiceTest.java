package com.core.springcorestudy.order;

import com.core.springcorestudy.AppConfig;
import com.core.springcorestudy.member.Grade;
import com.core.springcorestudy.member.Member;
import com.core.springcorestudy.member.MemberService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class OrderServiceTest {

    MemberService memberService;
    OrderService orderService;

    @BeforeEach
    void setup() {
        AppConfig appConfig = new AppConfig();
        this.memberService = appConfig.memberService();
        this.orderService = appConfig.orderService();
    }

    @Test
    void createOrder() {

        Long memberId = 1L;
        Member member1 = new Member(memberId, "member1", Grade.VIP);

        memberService.join(member1);

        Order order = orderService.createOrder(member1.getId(), "itemA", 10000);
        Assertions.assertEquals(order.getDiscountPrice(), 1000);
    }

}