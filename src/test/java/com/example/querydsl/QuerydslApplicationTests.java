package com.example.querydsl;

import com.example.querydsl.entity.Member;
import com.example.querydsl.entity.QMember;
import com.querydsl.jpa.impl.JPAQueryFactory;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.persistence.EntityManager;

import static com.example.querydsl.entity.QMember.member;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class QuerydslApplicationTests {

    @Test
    void contextLoads() {
    }
    @Autowired
    EntityManager em;

    @Test
    public void startJPQL() {
        Member findMember = em.createQuery("select m from Member m where m.id=:id", Member.class)
                .setParameter("id", 3L)
                .getSingleResult();
        System.out.println(findMember);
    }

    @Autowired JPAQueryFactory queryFactory;

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

        assert findMember != null;
        assertThat(findMember.getUsername()).isEqualTo("member0");
    }


    @Test
    void test(){}

}
