package com.sanjin.dao;

import com.sanjin.domain.User;

import java.util.List;

/**
 * @author sanjin
 * @date 2022/2/17 下午9:26
 * @description
 */
public interface UserMapper {
    List<User> findAll();

    List<User> findById(int id);

    List<User> findByCondition(User user);

    List<User> findByIds(List<Integer> users);

    void save(User user);
}
