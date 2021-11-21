package com.core.springcorestudy.order;

import com.core.springcorestudy.member.Grade;
import com.core.springcorestudy.member.Member;
import com.core.springcorestudy.member.MemberService;
import com.core.springcorestudy.member.MemberServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class OrderServiceTest {

    MemberService memberService = new MemberServiceImpl();
    OrderService orderService = new OrderServiceImpl();

    @Test
    void createOrder() {

        Long memberId = 1L;
        Member member1 = new Member(memberId, "member1", Grade.VIP);

        memberService.join(member1);

        Order order = orderService.createOrder(member1.getId(), "itemA", 10000);
        Assertions.assertEquals(order.getDiscountPrice(), 1000);
    }

}