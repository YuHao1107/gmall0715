package com.atguigu.gmall.manage.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.atguigu.gmall.bean.BaseSaleAttr;
import com.atguigu.gmall.bean.SpuImage;
import com.atguigu.gmall.bean.SpuInfo;
import com.atguigu.gmall.service.ManageService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class SpuManageController {

    @Reference
    private ManageService manageService;


    @RequestMapping("spuList")
    public List<SpuInfo> getSpuInfoList(String catalong3Id) {
        return manageService.getSpuInfoList(catalong3Id);
    }

    @RequestMapping("baseSaleAttrList")
    public List<BaseSaleAttr> getBaseSaleAttrList() {

        return manageService.getBaseSaleAttrList();

    }
    @RequestMapping("saveSpuInfo")
    public void saveSpuInfo(@RequestBody SpuInfo spuInfo){
        manageService.saveSpuInfo(spuInfo);

    }



}