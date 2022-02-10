package com.sanjin.qqzone.dao.impl;

import com.sanjin.myssm.basedao.BaseDAO;
import com.sanjin.qqzone.dao.TopicDAO;
import com.sanjin.qqzone.pojo.Topic;
import com.sanjin.qqzone.pojo.UserBasic;

import java.util.List;

/**
 * @author sanjin
 * @date 2022/2/6 下午10:38
 * @description
 */
public class TopicDAOImpl extends BaseDAO<Topic> implements TopicDAO {
    @Override
    public List<Topic> getTopicList(UserBasic userBasic) {
        String sql = "select * from t_topic where author=?";
//        Object[] objects = executeComplexQuery("select * from t_topic where id=3");
//        System.out.println("objects = " + objects[3]);
//        new Topic().setTopicDate((Timestamp) objects[3]);
        return executeQuery(sql, userBasic.getId());
    }

    @Override
    public Topic getTopic(Integer id) {
        String sql = "select * from t_topic where id=?";
        return load(sql, id);
    }

    @Override
    public void delTopic(Topic topic) {
        String sql = "select * from t_topic where id=?";
        executeUpdate(sql, topic.getId());
    }

    @Override
    public void addTopic(Topic topic) {
        String sql = "insert into t_topic values(0,?,?,?,?)";
        executeUpdate(sql, topic.getTitle(), topic.getContent(), topic.getTopicDate(), topic.getAuthor());
    }
}
