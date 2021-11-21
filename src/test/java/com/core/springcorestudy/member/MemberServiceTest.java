package com.core.springcorestudy.member;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MemberServiceTest {

    MemberService memberService = new MemberServiceImpl();

    @Test
    public void join() {
        // given
        Member member1 = new Member(1L, "member1", Grade.VIP);

        // when
        memberService.join(member1);
        Member memberById = memberService.findMemberById(member1.getId());
        // then

        Assertions.assertEquals(member1, memberById);
    }

}