package com.sanjin.qqzone.service;

import com.sanjin.qqzone.pojo.HostReply;
import com.sanjin.qqzone.pojo.Reply;

/**
 * @author sanjin
 * @date 2022/2/9 下午5:24
 * @description
 */
public interface HostReplyService {
    HostReply getHostReplyByReplyId(Reply reply);
}
