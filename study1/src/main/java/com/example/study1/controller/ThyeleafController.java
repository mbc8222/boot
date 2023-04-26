package com.example.study1.controller;

import com.example.study1.dto.ThymeleafDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value = "/thymeleaf")
public class ThyeleafController {

    @GetMapping(value = "/ex01")
    public String thymeleafExample01(Model model){
        model.addAttribute("data", "스프링 부트 시작!");

        return "thymeleaf";
    }

    @GetMapping(value = "/ex02")
    public String thymeleafExample02(Model model){
        ThymeleafDto dto = new ThymeleafDto();
        dto.setItemDetail("제품 상세설명");
        dto.setItemNm("제품이름1");
        dto.setPrice(1000);
        dto.setRegTime(LocalDateTime.now());

        model.addAttribute("dto", dto);
        return "thymeleafEx02";
    }

    @GetMapping(value = "/ex03")
    public String thymeleafExample03(Model model){
        List<ThymeleafDto> list = new ArrayList<>();

        for (int i=1; i<=10; i++){
            ThymeleafDto dto = new ThymeleafDto();
            dto.setItemNm("제품이름" + i);
            dto.setItemDetail("제품상세설명" + i);
            dto.setPrice(1000 * i);
            dto.setRegTime(LocalDateTime.now());
            list.add(dto);
        }
        model.addAttribute("list", list);
        return "thymeleafEx03";
    }

    @GetMapping(value = "/ex04")
    public String thymeleafExample04(Model model){
        List<ThymeleafDto> list = new ArrayList<>();

        for (int i=1; i<=10; i++){
            ThymeleafDto dto = new ThymeleafDto();
            dto.setItemNm("제품이름" + i);
            dto.setItemDetail("제품상세설명" + i);
            dto.setPrice(1000 * i);
            dto.setRegTime(LocalDateTime.now());
            list.add(dto);
        }
        model.addAttribute("list", list);
        return "thymeleafEx04";
    }

    @GetMapping(value = "/ex05")
    public String thymeleafExample05(){
        return "thymeleafEx05";
    }

    @GetMapping(value = "/ex06")
    public String thymeleafExample06(Model model, String param1, String param2){
        model.addAttribute("param1", param1);
        model.addAttribute("param2", param2);
        return "thymeleafEx06";
    }

    @GetMapping(value = "/ex07")
    public String thymeleafExample07(){
        return "thymeleafEx07";
    }

}
