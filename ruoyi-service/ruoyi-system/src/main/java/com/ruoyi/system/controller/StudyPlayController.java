package com.ruoyi.system.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ruoyi.common.core.domain.R;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.system.domain.StudyFile;
import com.ruoyi.system.domain.StudyPlay;
import com.ruoyi.system.service.IStudyFileService;
import com.ruoyi.system.service.IStudyPlayService;

/**
 * 播放记录 提供者
 * 
 * @author ruoyi
 * @date 2020-09-30
 */
@RestController
@RequestMapping("study/play")
public class StudyPlayController extends BaseController
{
    @Autowired
    private IStudyPlayService studyPlayService;
    
    @Autowired
    private IStudyFileService studyFileService;

    /**
     * 查询${tableComment}
     */
    @GetMapping("get/{id}")
    public StudyPlay get(@PathVariable("id") Long id)
    {
        return studyPlayService.selectStudyPlayById(id);
    }

    /**
     * 查询播放记录列表
     */
    @GetMapping("list")
    public R list(StudyPlay studyPlay)
    {
        startPage();
        studyPlay.setUserId(getCurrentUserId());
        return result(studyPlayService.selectStudyPlayList(studyPlay));
    }

    /**
     * 新增保存播放记录
     */
    @PostMapping("save")
    public R addSave(@RequestBody StudyPlay studyPlay)
    {
        StudyFile studyFile=new StudyFile();
        studyFile.setId(studyPlay.getFileId());
        studyFile.setPlayNum(1);
        studyFileService.updateStudyFile(studyFile);
        List<StudyPlay> plays = studyPlayService.selectStudyPlayList(studyPlay);
        if (null != plays && plays.size() > 0)
        {
            return toAjax(studyPlayService.updateStudyPlay(plays.get(0)));
        }
        return toAjax(studyPlayService.insertStudyPlay(studyPlay));
    }

    /**
     * 修改保存播放记录
     */
    @PostMapping("update")
    public R editSave(@RequestBody StudyPlay studyPlay)
    {
        return toAjax(studyPlayService.updateStudyPlay(studyPlay));
    }

    /**
     * 删除${tableComment}
     */
    @PostMapping("remove")
    public R remove(String ids)
    {
        return toAjax(studyPlayService.deleteStudyPlayByIds(ids));
    }
}
