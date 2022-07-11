package com.practice.TestingJunitMaven.resource;

import com.practice.TestingJunitMaven.entity.Member;
import com.practice.TestingJunitMaven.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class MemberResource {

@Autowired
    private MemberService memberService;

      public Member addMember( @RequestBody @Validated Member member){
          return memberService.addMember(member);

      }

      public List<Member> findAll(){
          return memberService.findAll();
      }

      public Member findMemberById(@RequestParam Long id){

          return  memberService.findMemberById(id);
      }
}
