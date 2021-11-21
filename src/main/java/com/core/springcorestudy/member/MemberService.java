package com.core.springcorestudy.member;

public interface MemberService {
    void join(Member member);

    Member findMemberById(Long memberId);
}
