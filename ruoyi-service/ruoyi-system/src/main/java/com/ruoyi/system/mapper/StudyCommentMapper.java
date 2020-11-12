package com.ruoyi.system.mapper;

import com.ruoyi.system.domain.StudyComment;
import java.util.List;

/**
 * 学习资料评论Mapper接口
 * 
 * @author ruoyi
 * @date 2020-09-30
 */
public interface StudyCommentMapper 
{
    /**
     * 查询学习资料评论
     * 
     * @param id 学习资料评论ID
     * @return 学习资料评论
     */
    public StudyComment selectStudyCommentById(Long id);

    /**
     * 查询学习资料评论列表
     * 
     * @param studyComment 学习资料评论
     * @return 学习资料评论集合
     */
    public List<StudyComment> selectStudyCommentList(StudyComment studyComment);

    /**
     * 新增学习资料评论
     * 
     * @param studyComment 学习资料评论
     * @return 结果
     */
    public int insertStudyComment(StudyComment studyComment);

    /**
     * 修改学习资料评论
     * 
     * @param studyComment 学习资料评论
     * @return 结果
     */
    public int updateStudyComment(StudyComment studyComment);

    /**
     * 删除学习资料评论
     * 
     * @param id 学习资料评论ID
     * @return 结果
     */
    public int deleteStudyCommentById(Long id);

    /**
     * 批量删除学习资料评论
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteStudyCommentByIds(String[] ids);
}
