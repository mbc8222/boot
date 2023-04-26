package com.example.study1.service;

import com.example.study1.dto.MemberDto;
import com.example.study1.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;
    public void saveMember(MemberDto memberDto){
        //memberValidation(member);
        System.out.println("service 들어옴");
        //memberRepository.save(memberDto);
        //return memberRepository.save(memberDto);
    }

    /*public void memberValidation(Member member){
        Member findmember = memberRepository.findMemberByEmail(member.getEmail());
        if(findmember != null){
            throw new IllegalStateException("이미 가입된 회원입니다.");
        }
    }*/


}
