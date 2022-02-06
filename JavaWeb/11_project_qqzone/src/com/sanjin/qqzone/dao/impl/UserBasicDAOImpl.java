package com.sanjin.qqzone.dao.impl;

import com.sanjin.myssm.basedao.BaseDAO;
import com.sanjin.qqzone.dao.UserBasicDAO;
import com.sanjin.qqzone.pojo.UserBasic;

import java.util.List;

/**
 * @author sanjin
 * @date 2022/2/6 下午10:16
 * @description
 */
public class UserBasicDAOImpl extends BaseDAO<UserBasic> implements UserBasicDAO {
    @Override
    public UserBasic getUserBasic(String loginId, String pwd) {
        String sql = "select * from t_user_basic where loginid=? and pwd=?";
        return load(sql, loginId, pwd);
    }

    @Override
    public List<UserBasic> getUserBasicList(UserBasic userBasic) {
        String sql = "select * from t_user_basic " +
                "where id in (select fid from t_friend where uid=?)";
        return executeQuery(sql, userBasic.getId());
    }

    @Override
    public UserBasic getUserBasicById(Integer id) {
        String sql = "select * from t_user_basic where id=?";
        return load(sql, id);
    }
}
