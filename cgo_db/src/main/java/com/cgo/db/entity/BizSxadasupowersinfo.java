package com.cgo.db.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author Mht
 * @since 2019-11-18
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("biz_SxAdasUpOwersInfo")
public class BizSxadasupowersinfo extends Model<BizSxadasupowersinfo> {

    private static final long serialVersionUID=1L;

    /**
     * 业户ID
     */
    private String id;

    /**
     * 业户上报状态 1：上报 2:注销
     */
    @TableField("ReportState")
    private Integer ReportState;

    @TableId(value = "sId", type = IdType.AUTO)
    private Integer sId;

    @TableField("ReprotTime")
    private LocalDateTime ReprotTime;


    @Override
    protected Serializable pkVal() {
        return this.sId;
    }

}
