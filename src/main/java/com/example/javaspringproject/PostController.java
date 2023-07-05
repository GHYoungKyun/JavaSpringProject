package com.example.javaspringproject;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.javaspringproject.dbconnector.*;

@RestController
public class PostController {
    private PostService postService;
    public PostController(PostController postController){
        this.postService = postService;
    }

    @GetMapping("/post")
    public ResponseEntity AllPost() {
        return new ResponseEntity(postService.getAllPost(), HttpStatus.OK);
    }
}
