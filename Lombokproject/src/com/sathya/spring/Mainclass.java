package com.sathya.spring;

import com.sathya.spring.Book.BookBuilder;

public class Mainclass {
	public static void main(String[] args) {
Book book=Book.builder()
    .bookid(1)
    .bookname("RAMAYANAM")
    .price(500.0)
    .build();
System.out.println(book);
	}

}
