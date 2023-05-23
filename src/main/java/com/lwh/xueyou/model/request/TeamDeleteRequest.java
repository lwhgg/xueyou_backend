package com.lwh.xueyou.model.request;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户退出队伍请求体
 *
 * @author lwh
 */
@Data
public class TeamDeleteRequest implements Serializable {

    private static final long serialVersionUID = -5361485664069022071L;

    /**
     * id
     */
    private Long teamId;
}
