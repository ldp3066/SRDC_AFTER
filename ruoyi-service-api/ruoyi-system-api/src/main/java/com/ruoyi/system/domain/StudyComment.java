package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 学习资料评论对象 study_comment
 * 
 * @author ruoyi
 * @date 2020-09-30
 */
public class StudyComment extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long              id;

    /** 资料id */
    @Excel(name = "资料id")
    private Long              studyId;

    private Long              createId;

    /** 评论内容 */
    @Excel(name = "评论内容")
    private String            content;

    private String            avatar;

    private String            nick;

    public void setId(Long id)
    {
        this.id = id;
    }

    public Long getId()
    {
        return id;
    }

    public void setStudyId(Long studyId)
    {
        this.studyId = studyId;
    }

    public Long getStudyId()
    {
        return studyId;
    }

    public void setContent(String content)
    {
        this.content = content;
    }

    public String getContent()
    {
        return content;
    }

    public Long getCreateId()
    {
        return createId;
    }

    public void setCreateId(Long createId)
    {
        this.createId = createId;
    }

    public String getAvatar()
    {
        return avatar;
    }

    public void setAvatar(String avatar)
    {
        this.avatar = avatar;
    }

    public String getNick()
    {
        return nick;
    }

    public void setNick(String nick)
    {
        this.nick = nick;
    }

    @Override
    public String toString()
    {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("id", getId())
                .append("studyId", getStudyId()).append("content", getContent()).append("createTime", getCreateTime())
                .toString();
    }
}
