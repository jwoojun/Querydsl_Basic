package com.example.querydsl.repository;


import com.example.querydsl.dto.MemberSearchCondition;
import com.example.querydsl.dto.MemberTeamDto;
import com.example.querydsl.entity.Member;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MemberRepository extends JpaRepository<Member, Long>, MemberRepositoryCustom {
    List<Member> findByUsername(String username);
}

interface MemberRepositoryCustom {
    List<MemberTeamDto> searchByBuilder(MemberSearchCondition condition);

    List<MemberTeamDto> serach(MemberSearchCondition condition);

    List<Member> searchMember(MemberSearchCondition condition);

    Page<MemberTeamDto> searchPageSimple_First(MemberSearchCondition condition, Pageable pageable);

    Page<MemberTeamDto> searchPageSimple_Second(MemberSearchCondition condition, Pageable pageable);

    Page<MemberTeamDto> searchPageComplex(MemberSearchCondition condition, Pageable pageable);

    public Page<MemberTeamDto> searchPageComplex_CountQueryOpti(MemberSearchCondition condition, Pageable pageable);
}


