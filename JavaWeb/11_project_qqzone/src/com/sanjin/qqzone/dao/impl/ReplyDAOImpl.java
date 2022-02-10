package com.sanjin.qqzone.dao.impl;

import com.sanjin.myssm.basedao.BaseDAO;
import com.sanjin.qqzone.dao.ReplyDAO;
import com.sanjin.qqzone.pojo.Reply;
import com.sanjin.qqzone.pojo.Topic;

import java.util.List;

/**
 * @author sanjin
 * @date 2022/2/9 下午5:17
 * @description
 */
public class ReplyDAOImpl extends BaseDAO<Reply> implements ReplyDAO {

    @Override
    public List<Reply> getReplyList(Topic topic) {
        String sql = "select * from t_reply where topic=?";
        List<Reply> replies = executeQuery(sql, topic.getId());
        return replies;
    }

    @Override
    public void addReply(Reply reply) {

    }

    @Override
    public void delReply(Integer id) {

    }
}
