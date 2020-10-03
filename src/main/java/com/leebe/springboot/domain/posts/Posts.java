package com.leebe.springboot.domain.posts;

import com.leebe.springboot.domain.BaseTimeEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Posts extends BaseTimeEntity {

    @Id //해당테이블의 PK 필드
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //PK 생성 규칙
    //스프링 부트 2.0에서는 GenerationType.IDENTITY 옵션을 추가해야만 auto_increment가 됨
    private Long id;

    @Column(length = 500, nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    //기본값 외에 추가로 변경이 필요한 옵션이 있으면 @Column 사용
    private String content;

    private String author; //클래스의 필드는 모두 칼럼이 됨

    @Builder
    public Posts(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public void update(String title, String content) {
        this.title = title;
        this.content = content;
    }

}
