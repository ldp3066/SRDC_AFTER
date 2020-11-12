package com.ruoyi.system.service;

import com.ruoyi.system.domain.StudyFile;
import java.util.List;

/**
 * 学习资料Service接口
 * 
 * @author ruoyi
 * @date 2020-09-30
 */
public interface IStudyFileService
{
    /**
     * 查询学习资料
     * 
     * @param id 学习资料ID
     * @return 学习资料
     */
    public StudyFile selectStudyFileById(Long id);

    /**
     * 查询学习资料列表
     * 
     * @param studyFile 学习资料
     * @return 学习资料集合
     */
    public List<StudyFile> selectStudyFileList(StudyFile studyFile);

    /**
     * 新增学习资料
     * 
     * @param studyFile 学习资料
     * @return 结果
     */
    public int insertStudyFile(StudyFile studyFile);

    /**
     * 修改学习资料
     * 
     * @param studyFile 学习资料
     * @return 结果
     */
    public int updateStudyFile(StudyFile studyFile);

    /**
     * 批量删除学习资料
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteStudyFileByIds(String ids);

    /**
     * 删除学习资料信息
     * 
     * @param id 学习资料ID
     * @return 结果
     */
    public int deleteStudyFileById(Long id);

    /**
     * @return
     * @author zmr
     */
    public List<StudyFile> selectTopPlay();

    /**
     * @return
     * @author zmr
     */
    public List<StudyFile> selectTopDown();
}
