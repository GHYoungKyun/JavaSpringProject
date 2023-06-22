package me.ghyk.demo.mapper;

import com.example.javaspringproject.dbconnector.Post;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PostMapper {

    List<Post> findAll();
}