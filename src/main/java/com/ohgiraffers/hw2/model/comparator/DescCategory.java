package com.ohgiraffers.hw2.model.comparator;

import com.ohgiraffers.javaFinalTest.model.dto.BookDTO;

import java.awt.print.Book;
import java.util.Comparator;

public class DescCategory implements Comparator<BookDTO> {
    @Override
    public int compare(BookDTO o1, BookDTO o2) {
        int result = 0;

        if(o2.getCategory() < o1.getCategory()) {
            result = 1;
        } else if (o2.getCategory() > o1.getCategory()) {
            result = -1;
        } else {
            result = 0;
        }
        return result;
    }
}
