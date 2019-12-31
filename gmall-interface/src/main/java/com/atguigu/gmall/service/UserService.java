package com.atguigu.gmall.service;

import com.atguigu.gmall.bean.UserAddress;
import com.atguigu.gmall.bean.UserInfo;

import java.util.List;

public interface UserService {
    /**
     * 查询所有
     * @return
     */
    List<UserInfo> findAll();

    List<UserAddress> getUserAddressByUserId(String userId);
}
