package com.sanjin.qqzone.service.impl;

import com.sanjin.qqzone.dao.UserBasicDAO;
import com.sanjin.qqzone.pojo.UserBasic;
import com.sanjin.qqzone.service.UserBasicService;

/**
 * @author sanjin
 * @date 2022/2/6 下午10:51
 * @description
 */
public class UserBasicServiceImpl implements UserBasicService {

    private UserBasicDAO dao = null;

    @Override
    public UserBasic login(String loginId, String pwd) {
        UserBasic userBasic = dao.getUserBasic(loginId, pwd);
        return userBasic;
    }
}
