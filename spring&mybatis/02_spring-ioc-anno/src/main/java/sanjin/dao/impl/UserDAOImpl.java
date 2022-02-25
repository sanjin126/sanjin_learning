package sanjin.dao.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import sanjin.dao.UserDAO;
import sanjin.domain.User;

import java.util.List;
import java.util.Map;
import java.util.Properties;

/**
 * @author sanjin
 * @date 2022/2/13 下午3:40
 * @description
 */
@Component("userDAO")
public class UserDAOImpl implements UserDAO {
    @Value("${jdbc.driver}")
    private List<String> msg;
    private Map<String, User> userMap;
    private Properties properties;

    public void setMsg(List<String> msg) {
        this.msg = msg;
    }

    public void setUserMap(Map<String, User> userMap) {
        this.userMap = userMap;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public UserDAOImpl() {
        System.out.println("userDAOImpl 创建");
    }

    public void init(){
        System.out.println("userDAOImpl init");
    }

    public void destroy(){
        System.out.println("userDAOImpl destroy");
    }

    @Override
    public void save() {
        System.out.println(msg.size());
        System.out.println(msg);
        System.out.println(userMap);
        System.out.println(properties);
        System.out.println("save user!");
    }
}
