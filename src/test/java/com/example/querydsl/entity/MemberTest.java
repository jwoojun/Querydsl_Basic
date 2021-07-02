package com.example.querydsl.entity;

import com.querydsl.jpa.impl.JPAQueryFactory;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

import static com.example.querydsl.entity.QMember.member;

@SpringBootTest
@Transactional
class MemberTest {

    @Autowired
    EntityManager em;

    @Test
    public void startJPQL() {
        Member findMember = em.createQuery("select m from Member m where m.id=:id", Member.class)
                .setParameter("id", 3L)
                .getSingleResult();
        System.out.println(findMember);
    }

    private  JPAQueryFactory queryFactory;

    @Test
    void startQuerydsl(){
        QMember m1 = new QMember("m1");
        Member findMember = queryFactory.select(m1)
                .from(m1)
                .where(m1.username.eq("member1"))
                .fetchOne();
        System.out.println("findMember= "+findMember);
        queryFactory.selectFrom(m1)
                .where(m1.username.eq("member0"))
                .fetchOne();
    }


    @Test
    public void search(){
        Member findMember = queryFactory
                .selectFrom(member)
                .where(member.id.eq(3L))
                .fetchOne();

    }

    @Test
    void searchAnd(){
        Member findMember = queryFactory
                .selectFrom(member)
                .where(
                        member.username.eq("member1")
                        .and(member.age.goe(30))
                ).fetchOne();
    }

    // null이 들어와도 무시한다->동적 쿼리를 짤 때 유리
    @Test
    void searchAndParam(){
        Member findMember = queryFactory
                .selectFrom(member)
                .where(
                        member.username.eq("member1"),
                        member.age.goe(30)
                ).fetchOne();
    }

}