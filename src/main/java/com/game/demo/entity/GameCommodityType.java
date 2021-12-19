package com.game.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

import java.io.Serializable;

/**
 * <p></p>
 *
 * @author: tzy
 * @date: 2021/12/19 13:30
 */
public class GameCommodityType implements Serializable {

    private static final long serialVersionUID = 2754093103658L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String title;

    private Integer game_id;

    private String text;

    public GameCommodityType() {
    }

    public GameCommodityType(Integer id, String title, Integer game_id, String text) {
        this.id = id;
        this.title = title;
        this.game_id = game_id;
        this.text = text;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getGame_id() {
        return game_id;
    }

    public void setGame_id(Integer game_id) {
        this.game_id = game_id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "GameCommodityType{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", game_id=" + game_id +
                ", text='" + text + '\'' +
                '}';
    }
}
