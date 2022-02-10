package com.sanjin.qqzone.dao.impl;

import com.sanjin.myssm.basedao.BaseDAO;
import com.sanjin.qqzone.dao.HostReplyDAO;
import com.sanjin.qqzone.pojo.HostReply;

/**
 * @author sanjin
 * @date 2022/2/9 下午5:28
 * @description
 */
public class HostReplyDAOImpl extends BaseDAO<HostReply> implements HostReplyDAO {
    @Override
    public HostReply getHostReplyByReplyId(Integer id) {
        String sql = "select * from t_host_reply where reply=?";
        HostReply hostReply = load(sql, id);
        return hostReply;
    }
}
