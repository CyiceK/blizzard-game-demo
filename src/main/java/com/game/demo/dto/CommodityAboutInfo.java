package com.game.demo.dto;

import java.math.BigDecimal;

/**
 * <p>商品详情页</p>
 *
 * @author: tzy
 * @date: 2021/12/20 15:53
 */

public class CommodityAboutInfo {

    private String bg;

    private String icon;

    private String white;

    private String text;

    private BigDecimal oldPrice;

    private Double discount;

    private BigDecimal newPrice;

    public CommodityAboutInfo() {
    }

    public CommodityAboutInfo(String bg, String icon, String white, String text, BigDecimal oldPrice, Double discount, BigDecimal newPrice) {
        this.bg = bg;
        this.icon = icon;
        this.white = white;
        this.text = text;
        this.oldPrice = oldPrice;
        this.discount = discount;
        this.newPrice = newPrice;
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

    public String getWhite() {
        return white;
    }

    public void setWhite(String white) {
        this.white = white;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
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

    @Override
    public String toString() {
        return "CommodityAboutInfo{" +
                "bg='" + bg + '\'' +
                ", icon='" + icon + '\'' +
                ", white='" + white + '\'' +
                ", text='" + text + '\'' +
                ", oldPrice=" + oldPrice +
                ", discount=" + discount +
                ", newPrice=" + newPrice +
                '}';
    }
}
