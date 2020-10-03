package com.leebe.springboot.web.dto;

import com.leebe.springboot.domain.posts.Posts;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class PostsSaveRequestDto {
    //Entity 클래스와 유사하지만 Dto 클래스를 추가로 생성
    //Entity 클래스는 데이터베이스와 맞닿은 핵심 클래스라서 Request/Response 클래스로 사용하지 않기 위함
    //View를 위한 클래스 : 자주 변경 필요
    private String title;
    private String content;
    private String author;
    @Builder
    public PostsSaveRequestDto(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public Posts toEntity(){
        return Posts.builder()
                .title(title)
                .content(content)
                .author(author)
                .build();
    }
}
