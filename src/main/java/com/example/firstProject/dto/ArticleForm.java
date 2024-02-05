package com.example.firstProject.dto;

import com.example.firstProject.entity.Article;

public class ArticleForm {
    private String title;
    private String content;

    public ArticleForm(String title, String content) {
        this.title = title;
        this.content = content;
    }

    @Override
    public String toString() {
        return "ArticleForm{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }

    public Article toEntity() {//폼 데이터를 받은 DTO 객체를 엔티티로 반환
        return new Article(null, title, content);
    }
}
