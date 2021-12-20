package com.game.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.game.demo.entity.Commodity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Map;

/**
 * <p></p>
 *
 * @author: tzy
 * @date: 2021/12/19 13:23
 */

@Mapper
public interface CommodityMapper extends BaseMapper<Commodity> {

    @Select("SELECT * FROM commodity WHERE ID = #{id, jdbcType=INTEGER}")
    public Commodity getAllInfoById(@Param("id") Integer id);

    @Select("SELECT id,text,white,price,discount,big_bg_url FROM commodity WHERE ID = #{id, jdbcType=INTEGER}")
    public Commodity GetCommodity(@Param("id") Integer id);
}
