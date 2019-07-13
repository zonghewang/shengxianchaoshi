package cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.edu.ccit.JavaEEsx.zh04.sxcsglxt.model.User;

@Controller
@RequestMapping("/admin")
public class LoginController {

	private static final Logger logger =org.apache.log4j.Logger.getLogger(LoginController.class);
	
	@RequestMapping("/login")
	public String login(User user,Model model,HttpServletRequest request) {

		//System.out.println(request.getParameter("methord"));
		if(request.getParameter("methord")!=null&&request.getParameter("methord").equals("loginout")) {
//			System.out.println(request.getParameter("methord"));
			// 当前Subject  
			Subject currentUser = SecurityUtils.getSubject();
			//登出
			currentUser.logout();
		}else if(request.getParameter("methord")!=null&&request.getParameter("methord").equals("unauthorized")) {
//			System.out.println(request.getParameter("methord"));
			
			Subject currentUser = SecurityUtils.getSubject();
			//登出
			currentUser.logout();
			model.addAttribute("tips", "您没有相关权限，请联系管理员为您添加权限后再试。");
		}else {
			if (user != null&&user.getUserName()!=null) {

				System.out.println(user.getUserName());
				// 当前Subject  
				Subject currentUser = SecurityUtils.getSubject();
//				String md5Pwd = new Md5Hash(request.getParameter("password"), salt).toString();
				
				// 传递token给shiro的realm
				UsernamePasswordToken token = new UsernamePasswordToken(user.getUserName(),user.getUserPassword());
				try {
					currentUser.login(token);
					return "redirect:/admin/index";

				} catch (AuthenticationException e) {// 登录失败
					logger.debug(e.getMessage(),e);
					model.addAttribute("tips", "用户名或密码错误,请重试。");
				}
			}
		}
		return "admin/login";
	}
}
