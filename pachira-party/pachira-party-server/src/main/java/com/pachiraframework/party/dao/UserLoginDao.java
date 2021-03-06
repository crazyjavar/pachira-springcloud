package com.pachiraframework.party.dao;

import org.springframework.stereotype.Repository;

import com.pachiraframework.dao.support.SqlCondition;
import com.pachiraframework.dao.support.SqlQueryCommand;
import com.pachiraframework.party.entity.UserLogin;

/**
 * 登录帐号相关的操作
 * @author KevinWang
 *
 */
@Repository
public class UserLoginDao extends AbstractPartyDao {
	/**
	 * 根据登录帐号查找用户信息
	 * @param loginId
	 * @return
	 */
	public UserLogin getByLoginId(String loginId) {
		SqlQueryCommand command = new SqlQueryCommand();
		command.addWhereSqlCondition(SqlCondition.and("login_id", "=", loginId));
		return this.findOneBySqlCommand(command);
	}
}
