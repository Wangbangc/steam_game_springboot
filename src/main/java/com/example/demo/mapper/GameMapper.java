package com.example.demo.mapper;

import com.example.demo.model.Game;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface GameMapper {



    @ResultMap("gameResultMap") // 使用结果映射
    List<Game> selectAllGames();

    // 你的方法定义
}