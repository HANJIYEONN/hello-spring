package hello.hellospring.repository;

import hello.hellospring.damain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member);
    Optional<Member> findById(Long id); //optional 이란 객체가 null 반환시 감싸주는 역활을 함
    Optional<Member> findByName(String name);
    List<Member> findAll();


}
