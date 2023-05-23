package com.lwh.xueyou.common;

import lombok.Data;

import java.io.Serializable;

/**
 * 通用分页请求参数
 *
 * @author lwh
 */
@Data
public class PageRequest implements Serializable {

    private static final long serialVersionUID = -5572126466465943832L;

    /**
     * 页面条数
     */
    protected int pageSize = 10;

    /**
     * 当前是第几页
     */
    protected int pageNum = 1;
}
