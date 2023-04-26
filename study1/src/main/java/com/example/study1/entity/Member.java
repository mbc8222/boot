package com.example.study1.entity;

import com.example.study1.constant.Role;
import com.example.study1.dto.MemberDto;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString
@Entity
@Table(name="member")
public class Member {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;

    @Column(unique = true)
    private String email;

    private String password;

    private String address;

    @Enumerated(EnumType.STRING)
    private Role role;

    public static Member createmember(MemberDto dto){
        System.out.println("들어옴");
        Member member = new Member();
        member.setName(dto.getName());
        member.setEmail(dto.getEmail());
        member.setAddress(dto.getAddress());
        String password = dto.getPassword();
        member.setPassword(dto.getPassword());
        member.setRole(Role.USER);
        return member;
    }


}
