package com.ohgiraffers.javaFinalTest.controller;

import com.ohgiraffers.hw2.model.comparator.AscCategory;
import com.ohgiraffers.hw2.model.comparator.DescCategory;
import com.ohgiraffers.javaFinalTest.model.dto.BookDTO;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Comparator;

public class BookManager {

    private ArrayList<BookDTO> booklist;

    //기본 생성자 ->ArrayList<BookDTO> 인스턴스 생성
    public BookManager() {
        ArrayList<BookDTO> booklist =new ArrayList<>();
    }

    //전달받은 BookDTO객체를 생성자시 선언한 ArrayList 객체에 추가
    public void addBook(BookDTO book) {
        booklist.add(book);
    }

    //전달받은 도서 번호로 ArrayList 안에 있는 정보 삭제
    public void deleteBook(int index) {
        if(index >=0 && index < booklist.size()) {
            booklist.remove(index);
        }
    }

    //전달받은 도서 제목으로 도서를 검색하고 결과값 반환
    public int searchBook(String bTitle) {
        for(BookDTO book : booklist) {
            if(book.getTitle().equals(bTitle)) {
            }
        }
        return searchBook(bTitle);
    }

    //전달받은 인덱스에 있는 도서정보 출력
    public void printBook(int index) {
        if (index >= 0 && index < booklist.size()) {
            System.out.println(booklist.get(index));
        }
    }

    public void displayAll() {
        for(BookDTO book : booklist) {
            System.out.println(book);
        }
    }


    //전달받은 번호를 기준으로 해당 카테고리순으로 정렬해서 ArrayList<BookDTO>에 담아서 리턴
    public ArrayList<BookDTO> sortedBook(int select) {
        ArrayList<BookDTO> sortedList = new ArrayList<>(booklist);
        switch (select) {
            case 1:
                Object AscCategory;
                break;
            case 2:
                Object DescCategory;
                break;
        }
        return sortedList;
    }


    //전달 받은 ArrayList<BookDTO>를 향상된 for문으로 출력
    public void printBookList(ArrayList<BookDTO> br) {}
}
