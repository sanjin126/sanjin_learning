package com.sanjin.qqzone.service.impl;

import com.sanjin.qqzone.dao.HostReplyDAO;
import com.sanjin.qqzone.pojo.HostReply;
import com.sanjin.qqzone.pojo.Reply;
import com.sanjin.qqzone.service.HostReplyService;

/**
 * @author sanjin
 * @date 2022/2/9 下午5:26
 * @description
 */
public class HostReplyServiceImpl implements HostReplyService {
    private HostReplyDAO dao;


    @Override
    public HostReply getHostReplyByReplyId(Reply reply) {
        HostReply hostReply = dao.getHostReplyByReplyId(reply.getId());
        return hostReply;
    }
}
