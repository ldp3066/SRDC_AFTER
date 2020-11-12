package com.ruoyi.system.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.R;
import com.ruoyi.system.domain.StudyDown;
import com.ruoyi.system.domain.StudyFile;
import com.ruoyi.system.service.IStudyDownService;
import com.ruoyi.system.service.IStudyFileService;

/**
 * 下载记录 提供者
 * 
 * @author ruoyi
 * @date 2020-09-30
 */
@RestController
@RequestMapping("study/down")
public class StudyDownController extends BaseController
{
    @Autowired
    private IStudyDownService studyDownService;

    @Autowired
    private IStudyFileService studyFileService;

    /**
     * 查询${tableComment}
     */
    @GetMapping("get/{id}")
    public StudyDown get(@PathVariable("id") Long id)
    {
        return studyDownService.selectStudyDownById(id);
    }

    /**
     * 查询下载记录列表
     */
    @GetMapping("list")
    public R list(StudyDown studyDown)
    {
        startPage();
        studyDown.setUserId(getCurrentUserId());
        return result(studyDownService.selectStudyDownList(studyDown));
    }

    /**
     * 新增保存下载记录
     */
    @PostMapping("save")
    public R addSave(@RequestBody StudyDown studyDown)
    {
        StudyFile studyFile = new StudyFile();
        studyFile.setId(studyDown.getFileId());
        studyFile.setDownNum(1);
        studyFileService.updateStudyFile(studyFile);
        List<StudyDown> downs = studyDownService.selectStudyDownList(studyDown);
        if (null != downs && downs.size() > 0)
        {
            return toAjax(studyDownService.updateStudyDown(downs.get(0)));
        }
        return toAjax(studyDownService.insertStudyDown(studyDown));
    }

    /**
     * 修改保存下载记录
     */
    @PostMapping("update")
    public R editSave(@RequestBody StudyDown studyDown)
    {
        return toAjax(studyDownService.updateStudyDown(studyDown));
    }

    /**
     * 删除${tableComment}
     */
    @PostMapping("remove")
    public R remove(String ids)
    {
        return toAjax(studyDownService.deleteStudyDownByIds(ids));
    }
}
