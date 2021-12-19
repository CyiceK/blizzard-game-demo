package com.game.demo.dto;

/**
 * <p>轮播图中单个轮播图的实体类</p>
 *
 * @author: tzy
 * @date: 2021/12/19 13:44
 */

public class RotationInfo {

    private String gameName;

    private String bgImgUrl;

    private String icon;

    private String announcement;

    private String jump;

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public String getBgImgUrl() {
        return bgImgUrl;
    }

    public void setBgImgUrl(String bgImgUrl) {
        this.bgImgUrl = bgImgUrl;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getAnnouncement() {
        return announcement;
    }

    public void setAnnouncement(String announcement) {
        this.announcement = announcement;
    }

    public String getJump() {
        return jump;
    }

    public void setJump(String jump) {
        this.jump = jump;
    }

    @Override
    public String toString() {
        return "RotationInfo{" +
                "gameName='" + gameName + '\'' +
                ", bgImgUrl='" + bgImgUrl + '\'' +
                ", icon='" + icon + '\'' +
                ", announcement='" + announcement + '\'' +
                ", jump='" + jump + '\'' +
                '}';
    }
}
