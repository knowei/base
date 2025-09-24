package com.knowei.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 用户书架表
 * </p>
 *
 * @author knowei
 * @since 2025-09-24
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("user_bookshelf")
public class UserBookshelf implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 小说ID
     */
    @TableField("noval_id")
    private Long novalId;

    /**
     * 用户ID
     */
    @TableField("user_id")
    private Long userId;

    /**
     * 最后阅读时间
     */
    @TableField("last_read_time")
    private LocalDateTime lastReadTime;

    /**
     * 是否置顶0-否1-是
     */
    @TableField("is_top")
    private Boolean isTop;

    /**
     * 是否更新0-否1-是
     */
    @TableField("is_notify")
    private Boolean isNotify;

    /**
     * 创建者
     */
    @TableField("create_by")
    private Long createBy;

    /**
     * 创建时间
     */
    @TableField("create_time")
    private LocalDateTime createTime;

    /**
     * 更新者
     */
    @TableField("update_by")
    private Long updateBy;

    /**
     * 更新时间
     */
    @TableField("update_time")
    private LocalDateTime updateTime;

}
