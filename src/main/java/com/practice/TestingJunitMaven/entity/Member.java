package com.practice.TestingJunitMaven.entity;

import jdk.nashorn.internal.objects.annotations.Getter;

import javax.persistence.*;

@Entity
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String mamberName;
    @Column
    private String memberEmail;
    @Column
    private String memberContact;
    @Column
    private String userName;


    public Member(Long id, String mamberName, String memberEmail, String memberContact, String userName) {
        this.id = id;
        this.mamberName = mamberName;
        this.memberEmail = memberEmail;
        this.memberContact = memberContact;
        this.userName = userName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMamberName() {
        return mamberName;
    }

    public void setMamberName(String mamberName) {
        this.mamberName = mamberName;
    }

    public String getMemberEmail() {
        return memberEmail;
    }

    public void setMemberEmail(String memberEmail) {
        this.memberEmail = memberEmail;
    }

    public String getMemberContact() {
        return memberContact;
    }

    public void setMemberContact(String memberContact) {
        this.memberContact = memberContact;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
