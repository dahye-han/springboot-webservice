package com.leebe.springboot.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PostsRepository extends JpaRepository<Posts, Long> {
    //JpaRepository<Entity클래스, PK 타입>를 상속하면 기본적인 CRUD 메소드가 자동으로 생성

}
