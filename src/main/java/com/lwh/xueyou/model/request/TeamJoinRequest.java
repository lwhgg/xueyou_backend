package com.lwh.xueyou.model.request;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户加入队伍请求体
 *
 * @author lwh
 */
@Data
public class TeamJoinRequest implements Serializable {

    private static final long serialVersionUID = -4119927805716823949L;

    /**
     * id
     */
    private Long teamId;

    /**
     * 密码
     */
    private String password;
}
