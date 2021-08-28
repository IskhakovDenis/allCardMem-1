package com.example.allcardmem.repository.member;

import com.example.allcardmem.model.member.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}