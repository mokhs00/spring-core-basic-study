package com.core.springcorestudy;

import com.core.springcorestudy.discount.DiscountPolicy;
import com.core.springcorestudy.discount.FixDiscountPolicy;
import com.core.springcorestudy.member.MemberRepository;
import com.core.springcorestudy.member.MemberService;
import com.core.springcorestudy.member.MemberServiceImpl;
import com.core.springcorestudy.member.MemoryMemberRepository;
import com.core.springcorestudy.order.OrderService;
import com.core.springcorestudy.order.OrderServiceImpl;

public class AppConfig {

    public MemberService memberService() {
        return new MemberServiceImpl(memberRepository());
    }

    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

    public OrderService orderService() {
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }

    public DiscountPolicy discountPolicy() {
        return new FixDiscountPolicy();
    }

}
