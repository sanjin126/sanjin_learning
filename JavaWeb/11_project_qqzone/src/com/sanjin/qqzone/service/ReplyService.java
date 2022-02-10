package com.sanjin.qqzone.service;

import com.sanjin.qqzone.pojo.Reply;

import java.util.List;

/**
 * @author sanjin
 * @date 2022/2/9 下午5:12
 * @description
 */
public interface ReplyService {
    List<Reply> getReplyListByTopicId(Integer topicId);
}
