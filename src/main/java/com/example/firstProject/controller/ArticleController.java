package com.example.firstProject.controller;

import com.example.firstProject.dto.ArticleForm;
import com.example.firstProject.entity.Article;
import com.example.firstProject.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller

public class ArticleController {
    @Autowired//스프링 부트가 미리 생성해 놓은 레파 객체 주입(DI)
    private ArticleRepository articleRepository; //객체를 만들지 않아도 되는 이유는 스프링부트가 알아서 만들어주기 때문이당
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
        Article saved = articleRepository.save(article);
        return "";
    }//form 데이터를 받음! 요청을 받는 것은 post mapping
}
