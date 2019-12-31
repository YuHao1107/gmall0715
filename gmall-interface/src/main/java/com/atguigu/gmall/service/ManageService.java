package com.atguigu.gmall.service;

import com.atguigu.gmall.bean.*;

import java.util.List;

public interface ManageService {
    /**
     * 查询一级目录
     * @return
     */
    List<BaseCatalog1> getCatalog1();

    /**
     * 根据一级分类Id获取二级分类
     * @param catalogId1
     * @return
     */
    //List<BaseCatalog2> getCatalog2(String catalogId1,BaseCatalog2 baseCatalog2);
    List<BaseCatalog2> getCatalog2(String catalogId1);

    /**
     * 根据二级分类Id获取三级分类
     * @param catalog2Id
     * @return
     */
    List<BaseCatalog3> getCatalog3(String catalog2Id);

    /**
     * 根据三级分类Id获取属性列表
     * @param
     * @return
     */
    List<BaseAttrInfo> getAttrInfoList(BaseAttrInfo baseAttrInfo);

    /**
     * 添加属性和属性值操作
     * @param baseAttrInfo
     */
    void saveAttrInfo(BaseAttrInfo baseAttrInfo);

    /**
     * 回显数据
     * @param attrId
     * @return
     */
    List<BaseAttrValue> getAttrValueList(String attrId);


    /**
     * 通过attrId 查询baseAttrInfo
     * @param attrId
     * @return
     */
    BaseAttrInfo getBaseAttrInfo(String attrId);

    /**
     * spu列表查询
     * @param
     * @return
     */
    List<SpuInfo> getSpuInfoList(String catalog3Id);

    /**
     * 查询销售属性
     * @return
     */
    List<BaseSaleAttr> getBaseSaleAttrList();

    /**
     * 保存spuInfo
     * @param spuInfo
     */
    void saveSpuInfo(SpuInfo spuInfo);


    /**
     * 查询图片列表
     * @param
     * @return
     */
    List<SpuImage> spuImageList(SpuImage spuImage);

    /**
     * 根据三级分类id查询attrinfolist
     * @param catalog3Id
     * @return
     */
    List<BaseAttrInfo> getAttrInfoList(String catalog3Id);

    /**
     * 通过spuId查询销售属性&销售属性值
     * @param spuId
     * @return
     */
    List<SpuSaleAttr> getSpuSaleAttrList(String spuId);
}
