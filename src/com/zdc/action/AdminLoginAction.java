package com.zdc.action;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.zdc.dto.UserInfo;
import com.zdc.model.Administrator;
import com.zdc.model.User;
import com.zdc.service.AdminService;

@Component("adminLogin")
@Scope("prototype")
public class AdminLoginAction extends ActionSupport implements ModelDriven<Object> {

	private static final long serialVersionUID = 4849167859972805798L;
	private UserInfo info = new UserInfo();
	private AdminService as;
	private List<User> users;
	private User user = new User();

	@Override
	public Object getModel() {
		return info;
	}

	@Override
	public String execute() throws Exception {
		Administrator admin = new Administrator();
		admin.setName(info.getName());
		admin.setPassword(info.getPassword());
		if (as.isSuccess(admin))
			return "success";
		return "fail";
	}

	public String create() {
		user.setName(info.getName());
		user.setPassword(info.getPassword());
		user.setAuthority(info.getAuthority());
		as.create(user);
		return "create";
	}

	public String list() {
		users = as.list();
		return "list";
	}

	public String change() {
		as.change(info.getId());
		return "change";
	}

	public String delete() {
		as.delete(info.getId());
		return "delete";
	}

	public AdminService getAs() {
		return as;
	}

	@Resource(name = "adminService")
	public void setAs(AdminService as) {
		this.as = as;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

}
