package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.StudyCommentMapper;
import com.ruoyi.system.domain.StudyComment;
import com.ruoyi.system.service.IStudyCommentService;
import com.ruoyi.common.core.text.Convert;

/**
 * 学习资料评论Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-09-30
 */
@Service
public class StudyCommentServiceImpl implements IStudyCommentService 
{
    @Autowired
    private StudyCommentMapper studyCommentMapper;

    /**
     * 查询学习资料评论
     * 
     * @param id 学习资料评论ID
     * @return 学习资料评论
     */
    @Override
    public StudyComment selectStudyCommentById(Long id)
    {
        return studyCommentMapper.selectStudyCommentById(id);
    }

    /**
     * 查询学习资料评论列表
     * 
     * @param studyComment 学习资料评论
     * @return 学习资料评论
     */
    @Override
    public List<StudyComment> selectStudyCommentList(StudyComment studyComment)
    {
        return studyCommentMapper.selectStudyCommentList(studyComment);
    }

    /**
     * 新增学习资料评论
     * 
     * @param studyComment 学习资料评论
     * @return 结果
     */
    @Override
    public int insertStudyComment(StudyComment studyComment)
    {
        studyComment.setCreateTime(DateUtils.getNowDate());
        return studyCommentMapper.insertStudyComment(studyComment);
    }

    /**
     * 修改学习资料评论
     * 
     * @param studyComment 学习资料评论
     * @return 结果
     */
    @Override
    public int updateStudyComment(StudyComment studyComment)
    {
        studyComment.setUpdateTime(DateUtils.getNowDate());
        return studyCommentMapper.updateStudyComment(studyComment);
    }

    /**
     * 删除学习资料评论对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteStudyCommentByIds(String ids)
    {
        return studyCommentMapper.deleteStudyCommentByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除学习资料评论信息
     * 
     * @param id 学习资料评论ID
     * @return 结果
     */
    public int deleteStudyCommentById(Long id)
    {
        return studyCommentMapper.deleteStudyCommentById(id);
    }
}
