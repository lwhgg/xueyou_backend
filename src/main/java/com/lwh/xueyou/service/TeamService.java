package com.lwh.xueyou.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lwh.xueyou.model.domain.Team;
import com.lwh.xueyou.model.domain.User;
import com.lwh.xueyou.model.dto.TeamQuery;
import com.lwh.xueyou.model.request.TeamDeleteRequest;
import com.lwh.xueyou.model.request.TeamJoinRequest;
import com.lwh.xueyou.model.request.TeamQuitRequest;
import com.lwh.xueyou.model.request.TeamUpdateRequest;
import com.lwh.xueyou.model.vo.TeamUserVO;

import java.util.List;

public interface TeamService extends IService<Team> {

    /**
     * 创建队伍
     *
     * @param team
     * @param loginUser
     * @return
     */
    long addTeam(Team team, User loginUser);

    /**
     * 搜索队伍
     *
     * @param teamQuery
     * @return
     */
    List<TeamUserVO> listTeams(TeamQuery teamQuery, Boolean isAdmin);

    /**
     * 修改队伍
     *
     * @param teamUpdateRequest
     * @return
     */
    boolean updateTeam(TeamUpdateRequest teamUpdateRequest, User loginUser);

    /**
     * 加入队伍
     *
     * @param teamJoinRequest
     * @return
     */
    boolean joinTeam(TeamJoinRequest teamJoinRequest, User loginUser);

    /**
     * 退出队伍
     *
     * @param teamQuitRequest
     * @param loginUser
     * @return
     */
    boolean quitTeam(TeamQuitRequest teamQuitRequest, User loginUser);

    /**
     * 删除（解散队伍）
     *
     * @param teamDeleteRequest
     * @param loginUser
     * @return
     */
    boolean deleteTeam(TeamDeleteRequest teamDeleteRequest, User loginUser);
}
