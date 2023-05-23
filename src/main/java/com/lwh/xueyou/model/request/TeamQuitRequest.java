package com.lwh.xueyou.model.request;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户退出队伍请求体
 *
 * @author lwh
 */
@Data
public class TeamQuitRequest implements Serializable {

    private static final long serialVersionUID = 7751944955151543876L;

    /**
     * id
     */
    private Long teamId;
}
