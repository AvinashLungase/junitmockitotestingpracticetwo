package com.practice.TestingJunitMaven.dao;

import com.practice.TestingJunitMaven.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberDao extends JpaRepository <Member, Long>{
}
