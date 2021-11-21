package com.core.springcorestudy.order;

import com.core.springcorestudy.discount.DiscountPolicy;
import com.core.springcorestudy.discount.FixDiscountPolicy;
import com.core.springcorestudy.member.Member;
import com.core.springcorestudy.member.MemberRepository;
import com.core.springcorestudy.member.MemoryMemberRepository;

public class OrderServiceImpl implements OrderService {

    private final MemberRepository memberRepository = new MemoryMemberRepository();
    private final DiscountPolicy discountPolicy = new FixDiscountPolicy();

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);

        return new Order(memberId, itemName, itemPrice, discountPrice);
    }
}
