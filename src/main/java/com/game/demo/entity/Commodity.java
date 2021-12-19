package com.game.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

import java.io.PipedReader;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * <p></p>
 *
 * @author: tzy
 * @date: 2021/12/19 13:13
 */
public class Commodity implements Serializable {

    private static final long serialVersionUID = 1854542103658L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String bg_img_url;

    private String jump;

    private String text;

    private Integer icon_type;

    private String golden;

    private String white;

    private BigDecimal price;

    private Integer game_id;

    private Double discount;

    private Integer typeId;

    public Commodity() {
    }

    public Commodity(Integer id, String bg_img_url, String jump, String text, Integer icon_type, String golden,
                     String white, BigDecimal price, Integer game_id, Double discount, Integer typeId) {
        this.id = id;
        this.bg_img_url = bg_img_url;
        this.jump = jump;
        this.text = text;
        this.icon_type = icon_type;
        this.golden = golden;
        this.white = white;
        this.price = price;
        this.game_id = game_id;
        this.discount = discount;
        this.typeId = typeId;
    }

    public String getBg_img_url() {
        return bg_img_url;
    }

    public void setBg_img_url(String bg_img_url) {
        this.bg_img_url = bg_img_url;
    }

    public String getJump() {
        return jump;
    }

    public void setJump(String jump) {
        this.jump = jump;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getIcon_type() {
        return icon_type;
    }

    public void setIcon_type(Integer icon_type) {
        this.icon_type = icon_type;
    }

    public String getGolden() {
        return golden;
    }

    public void setGolden(String golden) {
        this.golden = golden;
    }

    public String getWhite() {
        return white;
    }

    public void setWhite(String white) {
        this.white = white;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getGame_id() {
        return game_id;
    }

    public void setGame_id(Integer game_id) {
        this.game_id = game_id;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public Integer getType() {
        return typeId;
    }

    public void setType(Integer type) {
        this.typeId = type;
    }

    @Override
    public String toString() {
        return "Commodity{" +
                "bg_img_url='" + bg_img_url + '\'' +
                ", jump='" + jump + '\'' +
                ", text='" + text + '\'' +
                ", icon_type=" + icon_type +
                ", golden='" + golden + '\'' +
                ", white='" + white + '\'' +
                ", price=" + price +
                ", game_id=" + game_id +
                ", discount='" + discount + '\'' +
                ", type_id='" + typeId + '\'' +
                '}';
    }
}
