package com.sanjin.qqzone.service;

import com.sanjin.qqzone.pojo.UserBasic;

/**
 * @author sanjin
 * @date 2022/2/6 下午10:50
 * @description
 */
public interface UserBasicService {

    UserBasic login(String loginId, String pwd);
}
