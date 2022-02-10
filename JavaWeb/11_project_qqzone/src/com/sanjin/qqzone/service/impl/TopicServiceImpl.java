package com.sanjin.qqzone.service.impl;

import com.sanjin.qqzone.dao.TopicDAO;
import com.sanjin.qqzone.pojo.Topic;
import com.sanjin.qqzone.pojo.UserBasic;
import com.sanjin.qqzone.service.TopicService;

import java.util.List;

/**
 * @author sanjin
 * @date 2022/2/8 下午4:57
 * @description
 */
public class TopicServiceImpl implements TopicService {

    TopicDAO dao = null;

    @Override
    public List<Topic> getTopicList(UserBasic userBasic) {
        List<Topic> topicList = dao.getTopicList(userBasic);
        return topicList;
    }

    @Override
    public Topic getTopicById(Integer id) {
        return dao.getTopic(id);
    }
}
