package com.game.demo.dto;

import com.game.demo.entity.Rotation;

import java.util.List;

/**
 * <p>主页信息实体类</p>
 *
 * @author: tzy
 * @date: 2021/12/19 13:42
 */
public class HomeInfo {

    private List<Rotation> carousel;

    private List<GameListIcon> listIcon;

    private List<GameSmallShow> recommend;

    private List<GameSmallShow> Featured;

    private List<GameSmallShow> now;

    private List<GameSmallShow> popular;

    public List<Rotation> getCarousel() {
        return carousel;
    }

    public void setCarousel(List<Rotation> carousel) {
        this.carousel = carousel;
    }

    public List<GameListIcon> getListIcon() {
        return listIcon;
    }

    public void setListIcon(List<GameListIcon> listIcon) {
        this.listIcon = listIcon;
    }

    public List<GameSmallShow> getRecommend() {
        return recommend;
    }

    public void setRecommend(List<GameSmallShow> recommend) {
        this.recommend = recommend;
    }

    public List<GameSmallShow> getFeatured() {
        return Featured;
    }

    public void setFeatured(List<GameSmallShow> featured) {
        Featured = featured;
    }

    public List<GameSmallShow> getNow() {
        return now;
    }

    public void setNow(List<GameSmallShow> now) {
        this.now = now;
    }

    public List<GameSmallShow> getPopular() {
        return popular;
    }

    public void setPopular(List<GameSmallShow> popular) {
        this.popular = popular;
    }

    @Override
    public String toString() {
        return "HomeInfo{" +
                "carousel=" + carousel +
                ", listIcon=" + listIcon +
                ", recommend=" + recommend +
                ", Featured=" + Featured +
                ", now=" + now +
                ", popular=" + popular +
                '}';
    }
}
