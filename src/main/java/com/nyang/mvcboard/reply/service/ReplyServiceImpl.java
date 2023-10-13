package com.nyang.mvcboard.reply.service;

import com.nyang.mvcboard.commons.paging.Criteria;
import com.nyang.mvcboard.reply.Persistence.ReplyDAO;
import com.nyang.mvcboard.reply.domain.ReplyVO;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;

@Service
public class ReplyServiceImpl implements ReplyService{

    private final ReplyDAO replyDAO;

    @Inject
    public ReplyServiceImpl(ReplyDAO replyDAO) {
        this.replyDAO = replyDAO;
    }

    @Override
    public List<ReplyVO> getReplies(Integer articleNo) throws Exception {
        return replyDAO.getReplies(articleNo);
    }

    @Override
    public void addReply(ReplyVO replyVO) throws Exception {
        replyDAO.addReply(replyVO);
    }

    @Override
    public void modifyReply(ReplyVO replyVO) throws Exception {
        replyDAO.modifyReply(replyVO);
    }

    @Override
    public void removeReply(Integer replyNo) throws Exception {
        replyDAO.removeReply(replyNo);
    }

    @Override
    public List<ReplyVO> getRepliesPaging(Integer articleNo, Criteria criteria) throws Exception {
        return replyDAO.listPaging(articleNo, criteria);
    }

    @Override
    public int countReplies(Integer articleNo) throws Exception {
        return replyDAO.countReplies(articleNo);
    }

}

