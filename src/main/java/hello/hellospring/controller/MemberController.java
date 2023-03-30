package hello.hellospring.controller;

import hello.hellospring.domain.Member;
import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller// Controller -> Service -> Repository 어노테이션으로 Controller Service Repository 등록 시 스프링 으로 올림
public class MemberController {
    private final MemberService memberService;

    @Autowired//스프링에서 Controller 호출시 생성자 를 보고 Service가필요한걸 확인 이후 스프링으로 올라와있는 Service를 찾아 의존성 주입
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @GetMapping("/members/new")
    public String createForm(){
        return "members/createMemberForm";
    }
    @PostMapping("/members/new")
    public String create(MemberForm form){
        Member member = new Member();
        member.setName(form.getName());

        memberService.join(member);

        return "redirect:/";
    }
}
