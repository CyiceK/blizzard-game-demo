package com.game.demo.service;

import com.game.demo.dto.CommodityAboutInfo;
import com.game.demo.dto.HomeInfo;

/**
 * <p></p>
 *
 * @author: tzy
 * @date: 2021/12/19 13:11
 */
public interface IGameInfoService {
    public HomeInfo getHomeInfo();
    public CommodityAboutInfo getCommodityInfo(Integer commodityId);
}
