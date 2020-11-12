package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.StudyFileMapper;
import com.ruoyi.system.domain.StudyFile;
import com.ruoyi.system.service.IStudyFileService;
import com.ruoyi.common.core.text.Convert;

/**
 * 学习资料Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-09-30
 */
@Service
public class StudyFileServiceImpl implements IStudyFileService 
{
    @Autowired
    private StudyFileMapper studyFileMapper;

    /**
     * 查询学习资料
     * 
     * @param id 学习资料ID
     * @return 学习资料
     */
    @Override
    public StudyFile selectStudyFileById(Long id)
    {
        return studyFileMapper.selectStudyFileById(id);
    }

    /**
     * 查询学习资料列表
     * 
     * @param studyFile 学习资料
     * @return 学习资料
     */
    @Override
    public List<StudyFile> selectStudyFileList(StudyFile studyFile)
    {
        return studyFileMapper.selectStudyFileList(studyFile);
    }

    /**
     * 新增学习资料
     * 
     * @param studyFile 学习资料
     * @return 结果
     */
    @Override
    public int insertStudyFile(StudyFile studyFile)
    {
        studyFile.setCreateTime(DateUtils.getNowDate());
        return studyFileMapper.insertStudyFile(studyFile);
    }

    /**
     * 修改学习资料
     * 
     * @param studyFile 学习资料
     * @return 结果
     */
    @Override
    public int updateStudyFile(StudyFile studyFile)
    {
        studyFile.setUpdateTime(DateUtils.getNowDate());
        return studyFileMapper.updateStudyFile(studyFile);
    }

    /**
     * 删除学习资料对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteStudyFileByIds(String ids)
    {
        return studyFileMapper.deleteStudyFileByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除学习资料信息
     * 
     * @param id 学习资料ID
     * @return 结果
     */
    public int deleteStudyFileById(Long id)
    {
        return studyFileMapper.deleteStudyFileById(id);
    }

    /* (non-Javadoc)
     * @see com.ruoyi.system.service.IStudyFileService#selectTopPlay()
     */
    @Override
    public List<StudyFile> selectTopPlay()
    {
        return studyFileMapper.selectTopPlay();
    }

    /* (non-Javadoc)
     * @see com.ruoyi.system.service.IStudyFileService#selectDownPlay()
     */
    @Override
    public List<StudyFile> selectTopDown()
    {
        return studyFileMapper.selectTopDown();
    }
}
