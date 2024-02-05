package com.example.firstProject.controller;

import com.example.firstProject.dto.MemberForm;
import com.example.firstProject.entity.Member;
import com.example.firstProject.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MemberController {
    @Autowired
    private MemberRepository memberRepository;

    @GetMapping("/signup")
    public String newMemberForm() { return "signup";}

    @PostMapping("join")
    public String createMember(MemberForm form){
        Member member = form.toEntity();
        Member saved = memberRepository.save(member);
        return "";
    }
}
