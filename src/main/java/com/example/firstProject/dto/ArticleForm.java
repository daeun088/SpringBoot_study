package com.example.firstProject.dto;

import com.example.firstProject.entity.Article;
import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor //title과 content를 매개변수로 하는 생성자 자동 생성
@ToString //to string 간소화
public class ArticleForm {
    private String title;
    private String content;


    public Article toEntity() {//폼 데이터를 받은 DTO 객체를 엔티티로 반환
        return new Article(null, title, content);
    }
}
