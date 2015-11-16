package com.zdc.action;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.zdc.dto.UserInfo;
import com.zdc.model.User;
import com.zdc.service.UserService;

@Component("userLogin")
@Scope("prototype")
public class UserLoginAction extends ActionSupport implements ModelDriven<Object>{
	
	private static final long serialVersionUID = -7436712367161578287L;
	private UserInfo info = new UserInfo();
	private UserService us;
	
	@Override
	public String execute() throws Exception {
		User u = new User();
		u.setName(info.getName());
		u.setPassword(info.getPassword());
		if(us.isSuccess(u))
			return "success";
		return "fail";
	}

	@Override
	public Object getModel() {
		return info;
	}

	public UserService getUs() {
		return us;
	}

	@Resource(name="userService")
	public void setUs(UserService us) {
		this.us = us;
	}

}
