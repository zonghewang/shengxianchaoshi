package cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.util;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.annotation.Resource;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.Menu;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.Role;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.User;
import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.service.IUserService;

/**
 * 编写自定义Realm
 *
 * @author dxyd
 */
public class SxcsShiroRealm extends AuthorizingRealm {


	@Resource
	IUserService userService;
	

	/*
	 * 授权
	 */
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		Set<String> roleNames = new HashSet<String>();
		Set<String> permissions = new HashSet<String>();
		User user = (User)principals.getPrimaryPrincipal();
		List<Role>roles = userService.getRole(user.getPkUid());
		for (Role role : roles) {
			roleNames.add(role.getRoleName());// 添加角色
		}
		List<Menu>menus = userService.getPermission(user.getPkUid());
		for (Menu menu : menus) {
			permissions.add(menu.getMenuName()); // 添加权限
		}
		
		SimpleAuthorizationInfo info = new SimpleAuthorizationInfo(roleNames);
		info.setStringPermissions(permissions);
		return info;
	}

	/*
	 * 登录验证
	 */
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authcToken)
			throws AuthenticationException {

		UsernamePasswordToken token = (UsernamePasswordToken) authcToken;
		User user = new User();
		user.setUserName(token.getUsername());
		user.setUserPassword(String.valueOf(token.getPassword()));

		if (userService.checkUser(user)) {
			user=userService.getUser(user);

			return new SimpleAuthenticationInfo(user, user.getUserPassword(), getName());

		} else {

			throw new AuthenticationException();

		}
	}

}
