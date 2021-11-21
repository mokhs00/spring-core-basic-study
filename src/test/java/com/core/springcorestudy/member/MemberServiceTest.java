package com.core.springcorestudy.member;

import com.core.springcorestudy.AppConfig;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MemberServiceTest {

    MemberService memberService;

    @BeforeEach
    void setup() {
        AppConfig appConfig = new AppConfig();
        this.memberService = appConfig.memberService();
    }


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