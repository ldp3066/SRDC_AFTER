package com.ruoyi.system.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.google.common.collect.Maps;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.R;
import com.ruoyi.system.domain.StudyFile;
import com.ruoyi.system.service.IStudyFileService;

/**
 * 学习资料 提供者
 * 
 * @author ruoyi
 * @date 2020-09-30
 */
@RestController
@RequestMapping("study/file")
public class StudyFileController extends BaseController
{
    @Autowired
    private IStudyFileService studyFileService;

    /**
     * 查询${tableComment}
     */
    @GetMapping("get/{id}")
    public StudyFile get(@PathVariable("id") Long id)
    {
        return studyFileService.selectStudyFileById(id);
    }

    @GetMapping("statistic")
    public R statistic()
    {
        PageHelper.startPage(1, 10);
        List<StudyFile> topPlay = studyFileService.selectTopPlay();
        PageHelper.startPage(1, 10);
        List<StudyFile> topDown = studyFileService.selectTopDown();
        PageHelper.startPage(1, 10, "create_time desc");
        List<StudyFile> topNew = studyFileService.selectStudyFileList(null);
        Map<String, Object> map = Maps.newHashMap();
        map.put("topPlay", topPlay);
        map.put("topDown", topDown);
        map.put("topNew", topNew);
        map.put("totalVedio", new PageInfo<>(topPlay).getTotal());
        map.put("totalFile", new PageInfo<>(topDown).getTotal());
        return R.data(map);
    }

    /**
     * 查询学习资料列表
     */
    @GetMapping("list")
    public R list(StudyFile studyFile)
    {
        startPage();
        return result(studyFileService.selectStudyFileList(studyFile));
    }

    /**
     * 新增保存学习资料
     */
    @PostMapping("save")
    public R addSave(@RequestBody StudyFile studyFile)
    {
        studyFile.setCreateId(getCurrentUserId());
        return toAjax(studyFileService.insertStudyFile(studyFile));
    }

    /**
     * 修改保存学习资料
     */
    @PostMapping("update")
    public R editSave(@RequestBody StudyFile studyFile)
    {
        return toAjax(studyFileService.updateStudyFile(studyFile));
    }

    /**
     * 删除${tableComment}
     */
    @PostMapping("remove")
    public R remove(String ids)
    {
        return toAjax(studyFileService.deleteStudyFileByIds(ids));
    }
}
