package com.example.javaspringproject.dbconnector;

import lombok.Data;
@Data
public class Post {
    private int postIdx;
    private char title;
    private char name;
    private char date;
    private String content;
    private boolean delidx;
}
