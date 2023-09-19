package com.hello.core.member;

public class MemberServiceImpl implements MemberService{

    private final MemberRepository memberRepository=new MemoryMemberRepository();
    //인터페이스만 가지고 있으면 null 포인터 예외 터지므로 그 인터페이스의 구현 객체 클래스를 new로 선언해야한다.
    //다형성에 의해서 MemoryMemberRepository의 save 메소드가 호출된다.
    @Override
    public void join(Member member) {
        memberRepository.save(member);

    }

    @Override
    public Member findMember(Long memberId) {
        //조회

        return memberRepository.findById(memberId);
    }
}
