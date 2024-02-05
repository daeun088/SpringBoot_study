package com.example.firstProject.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
@Entity
public class Article {
        @Id //엔티티의 대푯값 지정
        @GeneratedValue // 자동 생성 기능 추가
        private Long id;
        @Column//title 필드 선언, DB 테이블의 title 열과 연결
        private String title;


        @Column//content 필드 선언, DB 테이블의 content 열과 연결
        private String content;

}
