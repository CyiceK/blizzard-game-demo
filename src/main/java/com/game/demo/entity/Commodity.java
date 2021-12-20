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

    private String bgImgUrl;

    private String text;

    private Integer iconType;

    private String golden;

    private String white;

    private BigDecimal price;

    private Integer gameId;

    private Double discount;

    private Integer typeId;

    private String bigBgUrl;

    private String showIconUrl;

    public Commodity() {
    }

    public Commodity(Integer id, String bgImgUrl, String text, Integer iconType, String golden, String white,
                     BigDecimal price, Integer gameId, Double discount, Integer typeId, String bigBgUrl, String showIconUrl) {
        this.id = id;
        this.bgImgUrl = bgImgUrl;
        this.text = text;
        this.iconType = iconType;
        this.golden = golden;
        this.white = white;
        this.price = price;
        this.gameId = gameId;
        this.discount = discount;
        this.typeId = typeId;
        this.bigBgUrl = bigBgUrl;
        this.showIconUrl = showIconUrl;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBgImgUrl() {
        return bgImgUrl;
    }

    public void setBgImgUrl(String bgImgUrl) {
        this.bgImgUrl = bgImgUrl;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getIconType() {
        return iconType;
    }

    public void setIconType(Integer iconType) {
        this.iconType = iconType;
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

    public Integer getGameId() {
        return gameId;
    }

    public void setGameId(Integer gameId) {
        this.gameId = gameId;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public String getBigBgUrl() {
        return bigBgUrl;
    }

    public void setBigBgUrl(String bigBgUrl) {
        this.bigBgUrl = bigBgUrl;
    }

    public String getShowIconUrl() {
        return showIconUrl;
    }

    public void setShowIconUrl(String showIconUrl) {
        this.showIconUrl = showIconUrl;
    }

    @Override
    public String toString() {
        return "Commodity{" +
                "id=" + id +
                ", bgImgUrl='" + bgImgUrl + '\'' +
                ", text='" + text + '\'' +
                ", iconType=" + iconType +
                ", golden='" + golden + '\'' +
                ", white='" + white + '\'' +
                ", price=" + price +
                ", gameId=" + gameId +
                ", discount=" + discount +
                ", typeId=" + typeId +
                ", bigBgUrl='" + bigBgUrl + '\'' +
                ", showIconUrl='" + showIconUrl + '\'' +
                '}';
    }
}
