package sanjin.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import sanjin.dao.UserDAO;
import sanjin.service.UserService;

/**
 * @author sanjin
 * @date 2022/2/13 下午4:38
 * @description
 */
@Service("userService")
public class UserServiceImpl implements UserService {


    @Autowired
    @Qualifier("userDAO")
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
