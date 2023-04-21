package me.ghyk.demo.mapper;

import com.example.javaspringproject.dbconnector.Post;
import org.apache.ibatis.annotations.*;
import java.util.List;
@Mapper
public interface UserMapper {

    List<Post> findAll();
}
