package com.game.demo.dto;

/**
 * <p>游戏图标列表实体类</p>
 *
 * @author: tzy
 * @date: 2021/12/19 13:49
 */

public class GameListIcon {

    private String gameName;

    private String icon;

    private Integer type;

    private String jump;

    public GameListIcon() {
    }

    public GameListIcon(String gameName, String icon, Integer type, String jump) {
        this.gameName = gameName;
        this.icon = icon;
        this.type = type;
        this.jump = jump;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getJump() {
        return jump;
    }

    public void setJump(String jump) {
        this.jump = jump;
    }

    @Override
    public String toString() {
        return "GameListIcon{" +
                "gameName='" + gameName + '\'' +
                ", icon='" + icon + '\'' +
                ", type=" + type +
                ", jump='" + jump + '\'' +
                '}';
    }
}
