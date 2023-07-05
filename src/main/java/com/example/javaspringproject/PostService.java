package com.example.javaspringproject;

import com.example.javaspringproject.PostMapper;
import com.example.javaspringproject.dbconnector.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {
    private PostMapper postMapper;
    public PostService(PostMapper postMapper){
        this.postMapper = postMapper;
    }

    public DefaultRes getAllPost(){
        final List<Post> postList = postMapper.findAll();
        if (postList.isEmpty())
            return DefaultRes.res(StatusCode.NOT_FOUND, ResponseMessage.NOT_FOUND_POST);
        return DefaultRes.res(StatusCode.OK, ResponseMessage.READ_POST, postList);
    }
}
