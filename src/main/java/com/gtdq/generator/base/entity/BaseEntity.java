package com.gtdq.generator.base.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 基类实体类
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BaseEntity {

    /**
     * 开始页
     */
    private Integer offset;

    /**
     * 条数
     */
    private Integer limit;

    /**
     * 排序类型
     */
    private String sortType;

    /**
     * 排序字段名称
     */
    private String orderName;

    /**
     * 查询数据结果
     */
    private Object rows;

    /**
     * 总条数
     */
    private Integer total;

}
