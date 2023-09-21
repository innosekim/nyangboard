package com.nyang.mvcboard.reply.Persistence;

import com.nyang.mvcboard.reply.domain.ReplyVO;

import java.util.List;

public interface ReplyDAO {
    List<ReplyVO> list(Integer articleNo) throws Exception;

    void create(ReplyVO replyVO) throws Exception;

    void update(ReplyVO replyVO) throws Exception;

    void delete(Integer replyNo) throws Exception;
}
