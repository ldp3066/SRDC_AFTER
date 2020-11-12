package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 下载记录对象 study_down
 * 
 * @author ruoyi
 * @date 2020-09-30
 */
public class StudyDown extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long              id;

    /** 用户编号 */
    @Excel(name = "用户编号")
    private Long              userId;

    /** 文件编号 */
    @Excel(name = "文件编号")
    private Long              fileId;

    /** $column.columnComment */
    @Excel(name = "文件编号")
    private String            fileTitle;

    /** $column.columnComment */
    @Excel(name = "文件编号")
    private Integer           fileType;

    public void setId(Long id)
    {
        this.id = id;
    }

    public Long getId()
    {
        return id;
    }

    public void setUserId(Long userId)
    {
        this.userId = userId;
    }

    public Long getUserId()
    {
        return userId;
    }

    public void setFileId(Long fileId)
    {
        this.fileId = fileId;
    }

    public Long getFileId()
    {
        return fileId;
    }

    public void setFileTitle(String fileTitle)
    {
        this.fileTitle = fileTitle;
    }

    public String getFileTitle()
    {
        return fileTitle;
    }

    public void setFileType(Integer fileType)
    {
        this.fileType = fileType;
    }

    public Integer getFileType()
    {
        return fileType;
    }

    @Override
    public String toString()
    {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("id", getId())
                .append("userId", getUserId()).append("fileId", getFileId()).append("fileTitle", getFileTitle())
                .append("fileType", getFileType()).append("createTime", getCreateTime()).toString();
    }
}
