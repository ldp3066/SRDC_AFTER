package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.StudyPlayMapper;
import com.ruoyi.system.domain.StudyPlay;
import com.ruoyi.system.service.IStudyPlayService;
import com.ruoyi.common.core.text.Convert;

/**
 * 播放记录Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-09-30
 */
@Service
public class StudyPlayServiceImpl implements IStudyPlayService 
{
    @Autowired
    private StudyPlayMapper studyPlayMapper;

    /**
     * 查询播放记录
     * 
     * @param id 播放记录ID
     * @return 播放记录
     */
    @Override
    public StudyPlay selectStudyPlayById(Long id)
    {
        return studyPlayMapper.selectStudyPlayById(id);
    }

    /**
     * 查询播放记录列表
     * 
     * @param studyPlay 播放记录
     * @return 播放记录
     */
    @Override
    public List<StudyPlay> selectStudyPlayList(StudyPlay studyPlay)
    {
        return studyPlayMapper.selectStudyPlayList(studyPlay);
    }

    /**
     * 新增播放记录
     * 
     * @param studyPlay 播放记录
     * @return 结果
     */
    @Override
    public int insertStudyPlay(StudyPlay studyPlay)
    {
        studyPlay.setCreateTime(DateUtils.getNowDate());
        return studyPlayMapper.insertStudyPlay(studyPlay);
    }

    /**
     * 修改播放记录
     * 
     * @param studyPlay 播放记录
     * @return 结果
     */
    @Override
    public int updateStudyPlay(StudyPlay studyPlay)
    {
        studyPlay.setCreateTime(DateUtils.getNowDate());
        return studyPlayMapper.updateStudyPlay(studyPlay);
    }

    /**
     * 删除播放记录对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteStudyPlayByIds(String ids)
    {
        return studyPlayMapper.deleteStudyPlayByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除播放记录信息
     * 
     * @param id 播放记录ID
     * @return 结果
     */
    public int deleteStudyPlayById(Long id)
    {
        return studyPlayMapper.deleteStudyPlayById(id);
    }
}
