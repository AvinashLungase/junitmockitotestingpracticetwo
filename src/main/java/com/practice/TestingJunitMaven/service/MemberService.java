package com.practice.TestingJunitMaven.service;
import com.practice.TestingJunitMaven.dao.MemberDao;
import com.practice.TestingJunitMaven.entity.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MemberService {
    @Autowired
    private MemberDao mdao;

    public Member addMember(Member member){
        mdao.save(member);
        return mdao.save(member);
    }

    public List<Member> findAll() {
        List<Member> memberList=mdao.findAll();
        return  memberList;
    }

    public Member findMemberById(Long id) {
        List<Member> memberList=mdao.findAll();

        Member member = null;
        for (Member m:memberList) {
        if(m.getId()== id){
            member =m;
        }
        }
    return member;
    }
}
