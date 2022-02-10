package com.sanjin.qqzone.service;

import com.sanjin.qqzone.pojo.Topic;
import com.sanjin.qqzone.pojo.UserBasic;

import java.util.List;

/**
 * @author sanjin
 * @date 2022/2/8 下午4:56
 * @description
 */
public interface TopicService {
    List<Topic> getTopicList(UserBasic userBasic);

    Topic getTopicById(Integer id);
}
