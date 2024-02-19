package com.ohgiraffers.javaFinalTest.model.dto;

public class BookDTO {

    private int bNo;
    private int category;
    private String title;
    private String author;

    public BookDTO() {}

    public BookDTO(int category, String title, String author) {
        this.category = category;
        this.title = title;
        this.author = author;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public int getCategory() {
        return category;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    //toString() : String 필드값 문자열 합친 후 리턴 category 분류 별로 출력 1.인문 2. 자연과학 3. 의료 4. 기타
    @Override
    public String toString() {
        return "BookDTO{" +
                "bNo=" + bNo +
                ", category=" + category +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
