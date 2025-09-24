package com.knowei.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

import java.time.LocalDateTime;
import java.io.Serializable;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 作者表
 * </p>
 *
 * @author knowei
 * @since 2025-09-24
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("author")
@Schema(description = "作者表")
public class Author implements Serializable {

    private static final long serialVersionUID = 1L;

    @Schema(description = "作者ID")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @Schema(description = "作者名称")
    private String name;

    @Schema(description = "创建者")
    private Long createBy;

    @Schema(description = "创建时间")
    private LocalDateTime createTime;

    @Schema(description = "更新者")
    private Long updateBy;

    @Schema(description = "更新时间")
    private LocalDateTime updateTime;

}
