package com.example.firstProject.controller;

import com.example.firstProject.dto.ArticleForm;
import com.example.firstProject.entity.Article;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller

public class ArticleController {
    @GetMapping("/articles/new")
    public String newArticleForm(){
        return "articles/new";
    }

    @PostMapping("/articles/create")
    public String createArticle(ArticleForm form){
        System.out.println(form.toString());
        //DTO를 엔티티로 변환
        Article article = form.toEntity();
        //리파지터리로 엔티티를 DB에 저장
        return "";
    }//form 데이터를 받음! 요청을 받는 것은 post mapping
}
