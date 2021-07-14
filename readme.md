# Querydsl Basic
해당 글은 우아한 형제들에서 근무중인 김영한님의 Querydsl 강의를 공부하며 작성한 글입니다. 강의를 바탕으로 추가적인 내용을 덧붙였습니다. 정리된 내용 이외에도 좋은 컨테츠가 많이 담겨 있기 때문에 책과 강의를 결제해서 공부해 보실 것을 추천드립니다.
JPA에 대한 기본적인 설명이 필요하신 분들은 아래 글을 참조하실 것을 권장드립니다.

- tistory주소1 :
- tistory주소2 :
- tistory주소3 :
- tistory주소4 :
- tistory주소5 :

<br><br/>

## JPQL이 제공하는 모든 검색 조건

- member.name.eq("memberA")    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; ->&nbsp;&nbsp; name = '
  memberA'
- member.name.ne("memberA)  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; ->&nbsp;&nbsp;
  name !='memberA'
- member.name.eq("memberA).not() &nbsp;&nbsp;&nbsp;&nbsp; ->&nbsp;&nbsp; name !='memberA'
  <br><br/>
- member.name.isNotNull() &nbsp;&nbsp; -> 이름 is not null
  <br><br/>
- member.age.in(10,20) &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; ->&nbsp;&nbsp; age in (10,20)
- member.age.notIn(10,20) &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; ->&nbsp;&nbsp; age not in (10,20)
- member.age.between(10,30) &nbsp;&nbsp;&nbsp;-> &nbsp;&nbsp; between(10, 30)
  <br><br/>
- member.age.goe(30) &nbsp;&nbsp;&nbsp;&nbsp; -> &nbsp;&nbsp; age>=30
- member.age.gt(30) &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; -> &nbsp;&nbsp; age>30
- member.age.loe(30) &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; -> &nbsp;&nbsp; age<=30
- member.age.lt(30) &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; -> &nbsp;&nbsp; age<30
  <br><br/>
- member.name.like("member%") &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; ->  &nbsp;&nbsp; like 검색
- member.name.contains("member%") &nbsp;&nbsp;&nbsp;&nbsp; ->  &nbsp;&nbsp; like '%member%'검색
- member.name.contains("member%") &nbsp;&nbsp;&nbsp;&nbsp; ->  &nbsp;&nbsp; like 'member%'검색

> [공식문서 참조](https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#jpa.query-methods.query-creation)

<br><br/>

## 결과조회
- fetch : 리스트로 조회, 데이터가 없으면 빈 리스트 반환 
- fetchOne : 조회 대상이 1건일 경우(1건 이상일 경우 에러). generic에 지정한 타입으로 반환
  - 결과가 없을 때 : null 반환 
  - 결과가 둘 이상이면 : com.querydsl.core.NonUniqueResultException 
- fetchFirst : 조회 대상이 1건이든 1건 이상이든 무조건 1건만 반환. 내부에 보면 return limit(1).fetchOne( ) 으로 되어있음
- fetchCount : count 쿼리로 변경해서 count 수 조회 
- fetchResults : 페이징 정보 포함, total count 쿼리 추가 실행

**FetchResult가 복잡해지면 content를 가져오는 쿼리와 totalcount를 가지고 오는 쿼리가 다를 때가 있다. 이때는 fetchResult를 사용하면 안되고 쿼리를 두 번 따로 날려야 한다.

<br><br/>
## Sort

- desc() , asc() : 일반 정렬
- nullsLast() , nullsFirst() : null 데이터 순서 부여
<br><br/>
### * 전체 조회수가 필요하면?

주의: count 쿼리가 실행되니 성능상 주의!
> 실무에서 페이징 쿼리를 작성할 때, 데이터를 조회하는 쿼리는 여러 테이블을 조인해야 하지만, count 쿼리는 조인이 필요 없는 경우도 있다. 그런데 이렇게 자동화된 count 쿼리는 원본 쿼리와 같이 모두 조인을 해버리기 때문에 성능이 안나올 수 있다. count 쿼리에 조인이 필요없는 성능 최적화가 필요하다면, count 전용 쿼리를 별도로 작성해야 한다

<br><br/>
## 집합 함수
- COUNT(m) &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; ->&nbsp;&nbsp;회원수
- SUM(m.age) &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; ->&nbsp;&nbsp;나이 합 
- AVG(m.age) &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; ->&nbsp;&nbsp;평균 나이
- MAX(m.age) &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; ->&nbsp;&nbsp;최대 나이
- MIN(m.age) &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; ->&nbsp;&nbsp;최소 나이

#### 완벽하게 이해하지 못한 부분 -> 페이징
<br><br/>
## GroupBy
- groupBy , 그룹화된 결과를 제한하려면 having
- groupBy(), having() 예시 
>groupBy(item.price)
<br/>.having(item.price.gt(1000))



<br><br/>
## 조인 - 기본 조인

기본 조인 조인의 기본 문법은 첫 번째 파라미터에 조인 대상을 지정하고, 두 번째 파라미터에 별칭(alias)으로 사용할 Q 타입을 지정하면 된다. join(조인 대상, 별칭으로 사용할 Q타입)
join() , innerJoin() : 내부 조인(inner join)
leftJoin() : left 외부 조인(left outer join)
rightJoin() : rigth 외부 조인(rigth outer join)
JPQL의 on 과 성능 최적화를 위한 fetch 조인 제공 다음 on 절에서 설명

<br><br/>
## 세타 조인(Theta Join)

연관관계가 없는 필드로 조인 from 절에 여러 엔티티를 선택해서 세타 조인 외부 조인 불가능 다음에 설명할 조인 on을 사용하면 외부 조인 가능
<br><br/>





## Projections
- 프로젝션 : select절에 가져올 대상 지정
 
```java

```


- 프로재ㅔㄱ션 대상이 둘 이상이면 튜플이나 DTO로 조회 


### 튜플 조회
- 프로젝션 대상이 둘 이상일 때 사용
com.querydsl.core.Tuple