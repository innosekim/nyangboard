package com.nyang.mvcboard.reply.Persistence;

import com.nyang.mvcboard.commons.paging.Criteria;
import com.nyang.mvcboard.reply.domain.ReplyVO;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import javax.inject.Inject;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class ReplyDAOImpl implements ReplyDAO{
    private static String NAMESPACE = "com.nyang.mvcboard.mappers.reply.replyMapper";


    private final SqlSession sqlSession;

    @Inject
    public ReplyDAOImpl(SqlSession sqlSession) {
        this.sqlSession = sqlSession;
    }

    @Override
    public List<ReplyVO> getReplies(Integer articleNo) throws Exception {
        return sqlSession.selectList(NAMESPACE + ".getReplies", articleNo);
    }

    @Override
    public void addReply(ReplyVO replyVO) throws Exception {
        sqlSession.insert(NAMESPACE + ".addReply", replyVO);
    }

    @Override
    public void modifyReply(ReplyVO replyVO) throws Exception {
        sqlSession.update(NAMESPACE + ".modifyReply", replyVO);
    }

    @Override
    public void removeReply(Integer replyNo) throws Exception {
        sqlSession.delete(NAMESPACE + ".removeReply", replyNo);
    }

    @Override
    public List<ReplyVO> listPaging(Integer articleNo, Criteria criteria) throws Exception {

        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("articleNo", articleNo);
        paramMap.put("criteria", criteria);

        return sqlSession.selectList(NAMESPACE + ".listPaging", paramMap);
    }

    @Override
    public int countReplies(Integer articleNo) throws Exception {
        return sqlSession.selectOne(NAMESPACE + ".countReplies", articleNo);
    }

}
