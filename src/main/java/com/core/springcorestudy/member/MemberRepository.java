package com.core.springcorestudy.member;

public interface MemberRepository {
    void save(Member member);

    Member findById(Long memberId);
}
