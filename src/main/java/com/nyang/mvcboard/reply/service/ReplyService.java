package com.nyang.mvcboard.reply.service;

import com.nyang.mvcboard.commons.paging.Criteria;
import com.nyang.mvcboard.reply.domain.ReplyVO;

import java.util.List;

public interface ReplyService {

    List<ReplyVO> getReplies(Integer articleNo) throws Exception;

    void addReply(ReplyVO replyVO) throws Exception;

    void modifyReply(ReplyVO replyVO) throws Exception;

    void removeReply(Integer replyNo) throws Exception;

    List<ReplyVO> getRepliesPaging(Integer articleNo, Criteria criteria) throws Exception;

    int countReplies(Integer articleNo) throws Exception;
}
