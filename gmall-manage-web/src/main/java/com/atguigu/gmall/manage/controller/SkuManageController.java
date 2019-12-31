package com.atguigu.gmall.manage.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.atguigu.gmall.bean.SpuImage;
import com.atguigu.gmall.bean.SpuSaleAttr;
import com.atguigu.gmall.service.ManageService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class SkuManageController {

    @Reference
    private ManageService manageService;
    //http://localhost:8082/attrInfoList?catalog3Id=61
    @RequestMapping("spuImageList")
    //根据spuImage
    public List<SpuImage> spuImageList(String spuId, SpuImage spuImage){
        return manageService.spuImageList(spuImage);
    }

    @RequestMapping("spuSaleAttrList")
    public List<SpuSaleAttr> getSpuSaleAttrList(String spuId){
        return manageService.getSpuSaleAttrList(spuId);
    }

}
