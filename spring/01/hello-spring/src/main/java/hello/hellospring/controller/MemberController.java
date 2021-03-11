package hello.hellospring.controller;

import hello.hellospring.repository.MemberRepository;
import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MemberController {
    private final MemberService memberService;

//    1. Constructor Injection (Recommended)
   @Autowired
    public MemberController(MemberService memberService){
        this.memberService = memberService;
    }

//    2. Field Injection
//    @Autowired
//    private MemberService memberService;


//    3. Setter Injection
//    private MemberRepository memberRepository;
//    @Autowired
//    public void setMemberService(MemberService memberService){
//       this.memberService = memberService;
//    }
}
