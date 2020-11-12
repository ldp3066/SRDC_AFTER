package com.ruoyi.system.service;

import com.ruoyi.system.domain.StudyPlay;
import java.util.List;

/**
 * 播放记录Service接口
 * 
 * @author ruoyi
 * @date 2020-09-30
 */
public interface IStudyPlayService 
{
    /**
     * 查询播放记录
     * 
     * @param id 播放记录ID
     * @return 播放记录
     */
    public StudyPlay selectStudyPlayById(Long id);

    /**
     * 查询播放记录列表
     * 
     * @param studyPlay 播放记录
     * @return 播放记录集合
     */
    public List<StudyPlay> selectStudyPlayList(StudyPlay studyPlay);

    /**
     * 新增播放记录
     * 
     * @param studyPlay 播放记录
     * @return 结果
     */
    public int insertStudyPlay(StudyPlay studyPlay);

    /**
     * 修改播放记录
     * 
     * @param studyPlay 播放记录
     * @return 结果
     */
    public int updateStudyPlay(StudyPlay studyPlay);

    /**
     * 批量删除播放记录
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteStudyPlayByIds(String ids);

    /**
     * 删除播放记录信息
     * 
     * @param id 播放记录ID
     * @return 结果
     */
    public int deleteStudyPlayById(Long id);
}
