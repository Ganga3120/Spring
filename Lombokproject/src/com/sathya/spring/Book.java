package com.sathya.spring;

import lombok.Builder;
import lombok.ToString;

@Builder
@ToString
public class Book {
private int bookid;
private String bookname;
private double price;
}
