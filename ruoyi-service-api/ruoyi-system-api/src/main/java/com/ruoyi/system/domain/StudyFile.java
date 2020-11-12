package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

import lombok.experimental.Accessors;

/**
 * 学习资料对象 study_file
 * 
 * @author ruoyi
 * @date 2020-09-30
 */
@Accessors(chain = true)
public class StudyFile extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long              id;

    /** 标题 */
    @Excel(name = "标题")
    private String            title;

    /** 类型 1:文件，2:类型 */
    @Excel(name = "类型 1:文件，2:类型")
    private Integer           type;

    /** URL地址 */
    @Excel(name = "URL地址")
    private String            url;

    /** 上传人ID */
    @Excel(name = "上传人ID")
    private Long              createId;

    /** 播放量 */
    @Excel(name = "播放量")
    private Integer           playNum;

    /** 下载量 */
    @Excel(name = "下载量")
    private Integer           downNum;

    private String            userName;

    private String            avatar;

    public void setId(Long id)
    {
        this.id = id;
    }

    public Long getId()
    {
        return id;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getTitle()
    {
        return title;
    }

    public void setType(Integer type)
    {
        this.type = type;
    }

    public Integer getType()
    {
        return type;
    }

    public void setUrl(String url)
    {
        this.url = url;
    }

    public String getUrl()
    {
        return url;
    }

    public void setCreateId(Long createId)
    {
        this.createId = createId;
    }

    public Long getCreateId()
    {
        return createId;
    }

    public void setPlayNum(Integer playNum)
    {
        this.playNum = playNum;
    }

    public Integer getPlayNum()
    {
        return playNum;
    }

    public void setDownNum(Integer downNum)
    {
        this.downNum = downNum;
    }

    public Integer getDownNum()
    {
        return downNum;
    }

    public String getUserName()
    {
        return userName;
    }

    public void setUserName(String userName)
    {
        this.userName = userName;
    }

    public String getAvatar()
    {
        return avatar;
    }

    public void setAvatar(String avatar)
    {
        this.avatar = avatar;
    }

    @Override
    public String toString()
    {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).append("id", getId())
                .append("title", getTitle()).append("type", getType()).append("url", getUrl())
                .append("createTime", getCreateTime()).append("updateTime", getUpdateTime())
                .append("createId", getCreateId()).append("createBy", getCreateBy()).append("playNum", getPlayNum())
                .append("downNum", getDownNum()).toString();
    }
}
