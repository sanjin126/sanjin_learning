package com.sanjin.service.impl;

import com.sanjin.dao.UserDAO;
import com.sanjin.service.UserService;

/**
 * @author sanjin
 * @date 2022/2/13 下午4:38
 * @description
 */
public class UserServiceImpl implements UserService {



    private UserDAO userDAO;
    private  int type;

    public UserServiceImpl() {
    }

    public UserServiceImpl(UserDAO userDAO, int type) {
        this.userDAO = userDAO;
        this.type = type;
    }

    @Override
    public void save() {
        userDAO.save();
    }

//    public void setUserDAO(UserDAO userDAO) {
//        this.userDAO = userDAO;
//        System.out.println("UserServiceImpl.setUserDAO");
//    }
}
