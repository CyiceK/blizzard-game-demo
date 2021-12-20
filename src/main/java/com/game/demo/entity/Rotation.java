package com.game.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

import java.io.Serializable;

/**
 * <p></p>
 *
 * @author: tzy
 * @date: 2021/12/19 13:33
 */
public class Rotation implements Serializable {

    private static final long serialVersionUID = 2754093103658L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String gameName;

    private String bgImgUrl;

    private String icon;

    private String announcement;

    private String jump;

    public Rotation() {
    }

    public Rotation(Integer id, String gameName, String bgImgUrl, String icon, String announcement, String jump) {
        this.id = id;
        this.gameName = gameName;
        this.bgImgUrl = bgImgUrl;
        this.icon = icon;
        this.announcement = announcement;
        this.jump = jump;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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
        return "Rotation{" +
                "id=" + id +
                ", gameName='" + gameName + '\'' +
                ", bgImgUrl='" + bgImgUrl + '\'' +
                ", icon='" + icon + '\'' +
                ", announcement='" + announcement + '\'' +
                ", jump='" + jump + '\'' +
                '}';
    }
}
