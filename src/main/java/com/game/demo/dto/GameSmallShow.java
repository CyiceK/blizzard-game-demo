package com.game.demo.dto;

import java.math.BigDecimal;

/**
 * <p>游戏的小窗展示</p>
 *
 * @author: tzy
 * @date: 2021/12/19 13:52
 */

public class GameSmallShow {

    private String bgImgUrl;

    private String jump;

    private String text;

    private Integer iconType;

    private String golden;

    private String white;

    private BigDecimal oldPrice;

    private Double discount;

    private BigDecimal newPrice;

    public GameSmallShow() {
    }

    public GameSmallShow(String bgImgUrl, String jump, String text, Integer iconType, String golden, String white, BigDecimal oldPrice, Double discount, BigDecimal newPrice) {
        this.bgImgUrl = bgImgUrl;
        this.jump = jump;
        this.text = text;
        this.iconType = iconType;
        this.golden = golden;
        this.white = white;
        this.oldPrice = oldPrice;
        this.discount = discount;
        this.newPrice = newPrice;
    }

    public String getBgImgUrl() {
        return bgImgUrl;
    }

    public void setBgImgUrl(String bgImgUrl) {
        this.bgImgUrl = bgImgUrl;
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

    public BigDecimal getOldPrice() {
        return oldPrice;
    }

    public void setOldPrice(BigDecimal oldPrice) {
        this.oldPrice = oldPrice;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public BigDecimal getNewPrice() {
        return newPrice;
    }

    public void setNewPrice(BigDecimal newPrice) {
        this.newPrice = newPrice;
    }
}
