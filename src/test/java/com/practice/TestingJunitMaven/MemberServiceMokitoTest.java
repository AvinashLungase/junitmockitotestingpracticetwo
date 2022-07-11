package com.practice.TestingJunitMaven;
import com.practice.TestingJunitMaven.dao.MemberDao;
import com.practice.TestingJunitMaven.entity.Member;
import com.practice.TestingJunitMaven.service.MemberService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.ArrayList;
import java.util.List;

@SpringBootTest(classes = {MemberServiceMokitoTest.class})
public class MemberServiceMokitoTest {

    @Mock
    MemberDao mDao;

    @InjectMocks
    MemberService mService;

    Member member = new Member(1L,"avinash Lungase","avinashlungase@cybage.com","7776963431","avinash1");
    Member member2 = new Member(2L,"avinash Lungase","avinashlungase@cybage.com","7776963431","avinash1");

    @Test @Order(1)
    public  void test_findallMember(){
        List<Member> memberTestList= new ArrayList<Member>();
        memberTestList.add(member);
        memberTestList.add(member2);
        Mockito.when( mDao.findAll()).thenReturn(memberTestList);
        Assertions.assertEquals(2,mService.findAll().size());
    }

    @Test
    @Order(2)
    public void test_findMemberById(){
        ArrayList<Member> memberTestList= new ArrayList<Member>();
        memberTestList.add(member);
        memberTestList.add(member2);
        Long memberId=1L;
        Mockito.when( mDao.findAll()).thenReturn(memberTestList);
        Assertions.assertEquals(1, mService.findMemberById(memberId).getId());

    }

    @Test
    @Order(3)
    public  void addMember(){
        Member member1 = new Member(1L,"avinash Lungase","avinashlungase@cybage.com","7776963431","avinash1");

        Mockito.when( mDao.save(member1)).thenReturn(member1);
        Assertions.assertEquals(member1, mService.addMember(member1));

    }

}
