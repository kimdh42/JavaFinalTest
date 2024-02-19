package com.ohgiraffers.javaFinalTest.view;

import com.ohgiraffers.javaFinalTest.controller.BookManager;
import com.ohgiraffers.javaFinalTest.model.dto.BookDTO;

import java.awt.print.Book;
import java.util.Scanner;

public class BookMenu {

    Scanner sc = new Scanner(System.in);

    BookManager bm = new BookManager();

    public BookMenu() {}

    //도서관리 프로그램에 해당하는 메인메뉴 출력, 각 메뉴에 해당하는 BookManager 클래스의 메소드 실행 -> 반복 출력
    public void menu() {
        System.out.println("*******메뉴*******");
        System.out.println("1. 도서 추가");
        System.out.println("2. 도서 삭제");
        System.out.println("3. 도서 제목으로 검색");
        System.out.println("4. 도서 정보 출력");
        System.out.println("5. 도서목록 전체 출력");
        System.out.println("6. 끝내기");

        int input = sc.nextInt();

        switch (input) {
            case 1:
                BookDTO newBook = inputBook();
                bm.addBook(newBook);
                break;
            case 2:
                System.out.print("삭제할 도서의 번호를 입력하세요 : ");
                int deleteNum = sc.nextInt();
                bm.deleteBook(deleteNum);
                break;
            case 3:
                System.out.print("도서 제목을 입력하세요 : ");
                String searchTitle = sc.next();
                bm.searchBook(searchTitle);
                break;
            case 4:
                System.out.print("출력할 도서의 번호를 입력하세요 : ");
                int index = sc.nextInt();
                bm.printBook(index);
                break;
            case 5:
                bm.displayAll();
                break;
            case 6:
                System.out.println("프로그램을 종료합니다.");
                return;
        }
    }

    //BookDTO 객체의 필드 값을 키보드로 입력 받아 초기화 하고 객체 리턴
    public BookDTO inputBook() {
        System.out.println("카테고리를 입력하세요. (1. 인문 2. 자연과학 3. 의료 4. 기타)");
        int category = sc.nextInt();
        System.out.println("제목을 입력하세요.");
        String title = sc.next();
        System.out.println("저자를 입력하세요.");
        String author = sc.next();

        return new BookDTO(category, title, author);
    }

    //검색할 도서제목을 키보드로 입력 받아 리턴
    public String inputBookTitle() {
        System.out.println("검색할 도서 제목을 입력하세요");
        return  sc.next();
    }
}
