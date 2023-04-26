package com.example.study1.repository;

import com.example.study1.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {

    //Member findMemberByEmail(String email);
}
