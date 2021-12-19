package com.game.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.game.demo.entity.Rotation;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * <p></p>
 *
 * @author: tzy
 * @date: 2021/12/19 13:40
 */

@Mapper
public interface RotationMapper extends BaseMapper<Rotation> {

    @Select("SELECT * FROM rotation")
    public List<Rotation> getRotation();
}
