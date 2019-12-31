package com.atguigu.gmall.manage.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.atguigu.gmall.bean.*;
import com.atguigu.gmall.service.ManageService;
import org.springframework.web.bind.annotation.*;

import javax.swing.*;
import java.util.List;

@RestController
@CrossOrigin
public class ManageController {

    @Reference
    private ManageService manageService;

    //localhost:8082/getCatalog1
    @RequestMapping("getCatalog1")
    public List<BaseCatalog1> getCatalog1(){
        return manageService.getCatalog1();
    }


    //localhost:8082/getCatalog2?catalog1Id=2
    @RequestMapping("getCatalog2")
    public List<BaseCatalog2> getCatalog2(String catalog1Id,BaseCatalog2 baseCatalog2){
        // select * from basecatalog2 where catalog1Id = ?
        return manageService.getCatalog2(catalog1Id);
    }

    @RequestMapping("getCatalog3")
    public List<BaseCatalog3> getCatalog3(String catalog2Id,BaseCatalog3 baseCatalog3){
        // select * from basecatalog3 where catalog2Id = ?
        return manageService.getCatalog3(catalog2Id);
    }

    @RequestMapping("getBaseSaleAttrList")
    public List<BaseSaleAttr> getBaseSaleAttrList(){
        return manageService.getBaseSaleAttrList();
    }


    @RequestMapping("attrInfoList")
    public List<BaseAttrInfo> getAttrInfoList(String catalog3Id,BaseAttrInfo baseAttrInfo){
        //return manageService.getAttrInfoList(baseAttrInfo);
        return manageService.getAttrInfoList(catalog3Id);
    }

    //需要接受前台数据
    //@requestBody接收json串转化为Object对象
    @RequestMapping("saveAttrInfo")
    public void saveAttrInfo(@RequestBody BaseAttrInfo baseAttrInfo){
        manageService.saveAttrInfo(baseAttrInfo);
    }
    //http://localhost:8082/getAttrValueList?attrId=?
    @RequestMapping("getAttrValueList")
    public List<BaseAttrValue> getAttrValueList(String attrId){
        return manageService.getAttrValueList(attrId);
    }


}
