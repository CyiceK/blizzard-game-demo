package com.game.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.game.demo.entity.Game;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * <p></p>
 *
 * @author: tzy
 * @date: 2021/12/19 13:38
 */

@Mapper
public interface GameMapper extends BaseMapper<Game> {

    @Select("SELECT id,name,icon,jump FROM game")
    public List<Map<String,Object>> GetListGame();
}
