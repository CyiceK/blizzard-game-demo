package com.game.demo.controller;

import com.game.demo.dto.CommodityAboutInfo;
import com.game.demo.dto.HomeInfo;
import com.game.demo.service.IGameInfoService;
import com.game.demo.utils.api.CommonResult;
import io.swagger.annotations.ApiOperation;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * <p></p>
 *
 * @author: tzy
 * @date: 2021/12/19 15:11
 */

@RestController
@RequestMapping("/gameInfo")
public class GameInfoController {

    @Resource
    private IGameInfoService iGameInfoService;

    @RequestMapping(value = "/HomeInfo", method = RequestMethod.GET)
    @ApiOperation("获取主页数据")
    public CommonResult<HomeInfo> getHomeInfo(HttpServletRequest request){
        HomeInfo homeInfo = iGameInfoService.getHomeInfo();
        return CommonResult.success(homeInfo);
    }

    @RequestMapping(value = "/CommodityInfo", method = RequestMethod.GET)
    @ApiOperation("获取商品详情页数据")
    public CommonResult<CommodityAboutInfo> getCommodityInfo(HttpServletRequest request, final Integer commodityId){
        CommodityAboutInfo commodityInfo = iGameInfoService.getCommodityInfo(commodityId);
        return CommonResult.success(commodityInfo);
    }
}
