package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.StudyDownMapper;
import com.ruoyi.system.domain.StudyDown;
import com.ruoyi.system.service.IStudyDownService;
import com.ruoyi.common.core.text.Convert;

/**
 * 下载记录Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-09-30
 */
@Service
public class StudyDownServiceImpl implements IStudyDownService 
{
    @Autowired
    private StudyDownMapper studyDownMapper;

    /**
     * 查询下载记录
     * 
     * @param id 下载记录ID
     * @return 下载记录
     */
    @Override
    public StudyDown selectStudyDownById(Long id)
    {
        return studyDownMapper.selectStudyDownById(id);
    }

    /**
     * 查询下载记录列表
     * 
     * @param studyDown 下载记录
     * @return 下载记录
     */
    @Override
    public List<StudyDown> selectStudyDownList(StudyDown studyDown)
    {
        return studyDownMapper.selectStudyDownList(studyDown);
    }

    /**
     * 新增下载记录
     * 
     * @param studyDown 下载记录
     * @return 结果
     */
    @Override
    public int insertStudyDown(StudyDown studyDown)
    {
        studyDown.setCreateTime(DateUtils.getNowDate());
        return studyDownMapper.insertStudyDown(studyDown);
    }

    /**
     * 修改下载记录
     * 
     * @param studyDown 下载记录
     * @return 结果
     */
    @Override
    public int updateStudyDown(StudyDown studyDown)
    {
        studyDown.setCreateTime(DateUtils.getNowDate());
        return studyDownMapper.updateStudyDown(studyDown);
    }

    /**
     * 删除下载记录对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteStudyDownByIds(String ids)
    {
        return studyDownMapper.deleteStudyDownByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除下载记录信息
     * 
     * @param id 下载记录ID
     * @return 结果
     */
    public int deleteStudyDownById(Long id)
    {
        return studyDownMapper.deleteStudyDownById(id);
    }
}
