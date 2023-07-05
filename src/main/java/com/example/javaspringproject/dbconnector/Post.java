package com.example.javaspringproject.dbconnector;

import lombok.Data;
@Data
public class Post {
    private int postIdx;
    private char title;
    private char writer;
    private char createdDate;
    private String content;
    private boolean delidx;
}
