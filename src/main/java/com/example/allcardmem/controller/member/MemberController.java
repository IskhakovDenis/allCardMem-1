package com.example.allcardmem.controller.member;

import com.example.allcardmem.model.member.Member;
import com.example.allcardmem.repository.member.MemberRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/member")
public class MemberController {
MemberRepository memberRepository;

@GetMapping
    public List<Member> list(){
    return memberRepository.findAll();
}
//@GetMapping
//    public Member getId(@PathVariable Long id){
//    return memberRepository.getById(id);
//}
//@PostMapping
//    public Member addMember(@PathVariable Long id, @RequestBody Member newMember){
//    Member oldMember = memberRepository.getById(id);
//    oldMember.setName(newMember.getName());
//    oldMember.setMemberId(newMember.getMemberId());
//    return memberRepository.save(oldMember);
//}
}