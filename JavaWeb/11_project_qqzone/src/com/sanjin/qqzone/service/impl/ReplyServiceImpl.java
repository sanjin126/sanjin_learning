package com.sanjin.qqzone.service.impl;

import com.sanjin.qqzone.dao.HostReplyDAO;
import com.sanjin.qqzone.dao.ReplyDAO;
import com.sanjin.qqzone.pojo.HostReply;
import com.sanjin.qqzone.pojo.Reply;
import com.sanjin.qqzone.pojo.Topic;
import com.sanjin.qqzone.service.ReplyService;

import java.util.List;

/**
 * @author sanjin
 * @date 2022/2/9 下午5:14
 * @description
 */
public class ReplyServiceImpl implements ReplyService {
    private ReplyDAO replyDAO;
    private HostReplyDAO hostReplyDAO;

    @Override
    public List<Reply> getReplyListByTopicId(Integer topicId) {
        List<Reply> replyList = replyDAO.getReplyList(new Topic(topicId));
        for (Reply reply : replyList) {
            HostReply hostReply = hostReplyDAO.getHostReplyByReplyId(reply.getId());
            reply.setHostReply(hostReply);
        }
        return replyList;
    }
}
