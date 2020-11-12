package com.ruoyi.system.mapper;

import com.ruoyi.system.domain.StudyDown;
import java.util.List;

/**
 * 下载记录Mapper接口
 * 
 * @author ruoyi
 * @date 2020-09-30
 */
public interface StudyDownMapper 
{
    /**
     * 查询下载记录
     * 
     * @param id 下载记录ID
     * @return 下载记录
     */
    public StudyDown selectStudyDownById(Long id);

    /**
     * 查询下载记录列表
     * 
     * @param studyDown 下载记录
     * @return 下载记录集合
     */
    public List<StudyDown> selectStudyDownList(StudyDown studyDown);

    /**
     * 新增下载记录
     * 
     * @param studyDown 下载记录
     * @return 结果
     */
    public int insertStudyDown(StudyDown studyDown);

    /**
     * 修改下载记录
     * 
     * @param studyDown 下载记录
     * @return 结果
     */
    public int updateStudyDown(StudyDown studyDown);

    /**
     * 删除下载记录
     * 
     * @param id 下载记录ID
     * @return 结果
     */
    public int deleteStudyDownById(Long id);

    /**
     * 批量删除下载记录
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteStudyDownByIds(String[] ids);
}
