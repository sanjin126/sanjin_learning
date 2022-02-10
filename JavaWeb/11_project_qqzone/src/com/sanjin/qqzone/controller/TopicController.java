package com.sanjin.qqzone.controller;

import com.sanjin.qqzone.pojo.Reply;
import com.sanjin.qqzone.pojo.Topic;
import com.sanjin.qqzone.service.ReplyService;
import com.sanjin.qqzone.service.TopicService;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author sanjin
 * @date 2022/2/9 下午5:03
 * @description
 */
public class TopicController {

    private TopicService topicService = null;
    private ReplyService replyService = null;

    public String topicDetail(Integer id, HttpSession session){
        Topic topic = topicService.getTopicById(id);
        List<Reply> replyList = replyService.getReplyListByTopicId(topic.getId());

        topic.setReplyList(replyList);

        session.setAttribute("topic", topic);
        return "frames/detail";

    }
}
