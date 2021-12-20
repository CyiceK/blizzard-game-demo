package com.game.demo.service.impl;

import com.game.demo.dto.GameListIcon;
import com.game.demo.dto.GameSmallShow;
import com.game.demo.dto.HomeInfo;
import com.game.demo.entity.Commodity;
import com.game.demo.entity.Rotation;
import com.game.demo.mapper.CommodityMapper;
import com.game.demo.mapper.GameMapper;
import com.game.demo.mapper.RotationMapper;
import com.game.demo.service.IGameInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * <p></p>
 *
 * @author: tzy
 * @date: 2021/12/19 14:05
 */

@Service
public class GameInfoServiceImpl implements IGameInfoService {

    @Resource
    private RotationMapper rotationMapper;

    @Resource
    private GameMapper gameMapper;

    @Resource
    private CommodityMapper commodityMapper;

    @Override
    public HomeInfo getHomeInfo() {
        HomeInfo homeInfo = new HomeInfo();

        //TODO 获取轮播图数据
        homeInfo.setCarousel(rotationMapper.getRotation());

        //TODO 获取游戏列表数据
        //final List<Map<String, Object>> maps = gameMapper.GetListGame();
        List<GameListIcon> gameListIcons = new ArrayList<>();
        for (Map<String, Object> i : gameMapper.GetListGame()){
            GameListIcon gameListIcon = new GameListIcon((String)i.get("name"), (String)i.get("icon"), ((Long)i.get("id")).intValue(), (String)i.get("jump"));
            gameListIcons.add(gameListIcon);
        }
        homeInfo.setListIcon(gameListIcons);

        //TODO 获取其他数据
        ArrayList<GameSmallShow> gameSmallShows = new ArrayList<>();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);
        arrayList.add(7);
        arrayList.add(8);
        arrayList.add(9);
        arrayList.add(10);
        for (Integer i : arrayList){
            Commodity allInfoById = commodityMapper.getAllInfoById(i);
            gameSmallShows.add(new GameSmallShow(allInfoById.getBg_img_url(), allInfoById.getJump(), allInfoById.getText(),
                    allInfoById.getIcon_type(), allInfoById.getGolden(), allInfoById.getWhite(), allInfoById.getPrice(),
                    allInfoById.getDiscount(), allInfoById.getPrice().multiply(BigDecimal.valueOf(allInfoById.getDiscount()))));
        }
        homeInfo.setRecommend(gameSmallShows);
        homeInfo.setFeatured(gameSmallShows);
        homeInfo.setNow(gameSmallShows);
        homeInfo.setPopular(gameSmallShows);
        


        return homeInfo;
    }
}
