package com.ruoyi.system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ruoyi.common.core.domain.R;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.system.domain.StudyComment;
import com.ruoyi.system.service.IStudyCommentService;

/**
 * 学习资料评论 提供者
 * 
 * @author ruoyi
 * @date 2020-09-30
 */
@RestController
@RequestMapping("study/comment")
public class StudyCommentController extends BaseController
{
	
	@Autowired
	private IStudyCommentService studyCommentService;
	
	/**
	 * 查询${tableComment}
	 */
	@GetMapping("get/{id}")
	public StudyComment get(@PathVariable("id") Long id)
	{
		return studyCommentService.selectStudyCommentById(id);
		
	}
	
	/**
	 * 查询学习资料评论列表
	 */
	@GetMapping("list")
	public R list(StudyComment studyComment)
	{
		startPage();
        return result(studyCommentService.selectStudyCommentList(studyComment));
	}
	
	
	/**
	 * 新增保存学习资料评论
	 */
	@PostMapping("save")
	public R addSave(@RequestBody StudyComment studyComment)
	{		
	    long userId=getCurrentUserId();
	    studyComment.setCreateId(userId);
		return toAjax(studyCommentService.insertStudyComment(studyComment));
	}

	/**
	 * 修改保存学习资料评论
	 */
	@PostMapping("update")
	public R editSave(@RequestBody StudyComment studyComment)
	{		
		return toAjax(studyCommentService.updateStudyComment(studyComment));
	}
	
	/**
	 * 删除${tableComment}
	 */
	@PostMapping("remove")
	public R remove(String ids)
	{		
		return toAjax(studyCommentService.deleteStudyCommentByIds(ids));
	}
	
}
