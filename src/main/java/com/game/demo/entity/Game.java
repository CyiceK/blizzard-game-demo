package com.game.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import org.apache.ibatis.annotations.Select;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * <p></p>
 *
 * @author: tzy
 * @date: 2021/12/19 13:24
 */
public class Game implements Serializable {

    private static final long serialVersionUID = 1854093103658L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String bg;

    private String icon;

    private String name;

    private BigDecimal price;

    private Double discount;

    private String announcement;

    private String game_type;

    private String jump;

    public Game() {
    }

    public Game(Integer id, String bg, String icon, String name, BigDecimal price, Double discount, String announcement, String game_type, String jump) {
        this.id = id;
        this.bg = bg;
        this.icon = icon;
        this.name = name;
        this.price = price;
        this.discount = discount;
        this.announcement = announcement;
        this.game_type = game_type;
        this.jump = jump;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBg() {
        return bg;
    }

    public void setBg(String bg) {
        this.bg = bg;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public String getAnnouncement() {
        return announcement;
    }

    public void setAnnouncement(String announcement) {
        this.announcement = announcement;
    }

    public String getGame_type() {
        return game_type;
    }

    public void setGame_type(String game_type) {
        this.game_type = game_type;
    }

    public String getJump() {
        return jump;
    }

    public void setJump(String jump) {
        this.jump = jump;
    }

    @Override
    public String toString() {
        return "Game{" +
                "id=" + id +
                ", bg='" + bg + '\'' +
                ", icon='" + icon + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", discount=" + discount +
                ", announcement='" + announcement + '\'' +
                ", game_type='" + game_type + '\'' +
                ", jump='" + jump + '\'' +
                '}';
    }
}
