package com.example.study1.controller;

import com.example.study1.dto.MemberDto;
import com.example.study1.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(value = "/member")
@Controller
@RequiredArgsConstructor
public class MemberController {

    private final MemberService service;
    private final PasswordEncoder passwordEncoder;

    @GetMapping(value = "/new")
    public String memberform(Model model){
        model.addAttribute("dto", new MemberDto());
        return "member/memberForm";
    }

    @GetMapping (value = "/newmember")
    public String newmember(MemberDto dto){
        dto.setPassword("1234");
        dto.setName("테스터");
        dto.setAddress("테스트주소");
        dto.setEmail("asd@sda.com");
        System.out.println(dto.getName());
        System.out.println(dto.getEmail());
        System.out.println(dto.getAddress());
        System.out.println(dto.getPassword());
        //Member member = Member.createmember(dto);
        service.saveMember(dto);
        return "redirect:/";
    }
}
