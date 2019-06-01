package com.example.demo.model;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 文章表
 * </p>
 *
 * @author huzhiting123
 * @since 2019-06-01
 */
@TableName("cms_article")
public class Article implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 栏目id
     */
    @TableField("cat_id")
    private Long catId;
    /**
     * 文章编码
     */
    private String code;
    /**
     * 文章标题
     */
    private String title;
    /**
     * 子标题
     */
    @TableField("child_title")
    private String childTitle;
    /**
     * 扩展标题
     */
    @TableField("expend_title")
    private String expendTitle;
    /**
     * 关键字
     */
    private String keywords;
    /**
     * 描述
     */
    private String description;
    /**
     * 作者
     */
    private String author;
    /**
     * 外部链接
     */
    @TableField("ext_link")
    private String extLink;
    /**
     * 内容
     */
    private String content;
    /**
     * 站点编码
     */
    private String site;
    /**
     * 状态：0-启用；1-禁用
     */
    private Integer status;
    /**
     * 显示顺序
     */
    private Long index;
    /**
     * 访问量
     */
    private Long visits;
    /**
     * 发布时间
     */
    @TableField("publish_time")
    private Date publishTime;
    /**
     * 下架时间
     */
    @TableField("offline_time")
    private Date offlineTime;
    /**
     * 创建时间
     */
    @TableField("create_time")
    private Date createTime;
    /**
     * 修改时间
     */
    @TableField("update_time")
    private Date updateTime;
    /**
     * 是否删除
     */
    @TableField("is_deleted")
    private Integer isDeleted;
    /**
     * 创建人
     */
    @TableField("create_by")
    private Long createBy;
    /**
     * 更新人
     */
    @TableField("update_by")
    private Long updateBy;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCatId() {
        return catId;
    }

    public void setCatId(Long catId) {
        this.catId = catId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getChildTitle() {
        return childTitle;
    }

    public void setChildTitle(String childTitle) {
        this.childTitle = childTitle;
    }

    public String getExpendTitle() {
        return expendTitle;
    }

    public void setExpendTitle(String expendTitle) {
        this.expendTitle = expendTitle;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getExtLink() {
        return extLink;
    }

    public void setExtLink(String extLink) {
        this.extLink = extLink;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Long getIndex() {
        return index;
    }

    public void setIndex(Long index) {
        this.index = index;
    }

    public Long getVisits() {
        return visits;
    }

    public void setVisits(Long visits) {
        this.visits = visits;
    }

    public Date getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(Date publishTime) {
        this.publishTime = publishTime;
    }

    public Date getOfflineTime() {
        return offlineTime;
    }

    public void setOfflineTime(Date offlineTime) {
        this.offlineTime = offlineTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }

    public Long getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Long createBy) {
        this.createBy = createBy;
    }

    public Long getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(Long updateBy) {
        this.updateBy = updateBy;
    }

    @Override
    public String toString() {
        return "Article{" +
        "id=" + id +
        ", catId=" + catId +
        ", code=" + code +
        ", title=" + title +
        ", childTitle=" + childTitle +
        ", expendTitle=" + expendTitle +
        ", keywords=" + keywords +
        ", description=" + description +
        ", author=" + author +
        ", extLink=" + extLink +
        ", content=" + content +
        ", site=" + site +
        ", status=" + status +
        ", index=" + index +
        ", visits=" + visits +
        ", publishTime=" + publishTime +
        ", offlineTime=" + offlineTime +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        ", isDeleted=" + isDeleted +
        ", createBy=" + createBy +
        ", updateBy=" + updateBy +
        "}";
    }
}
