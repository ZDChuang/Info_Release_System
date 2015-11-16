package com.zdc.action;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.zdc.dto.UserInfo;
import com.zdc.model.User;
import com.zdc.service.UserService;

/*
 * 所谓ModelDriven，意思是直接把实体类当成页面数据的收集对象。ModelDriven背后的机制就是ValueStack。
 * 那么，为什么user对象会在ValueStack中呢？它是什么时候被压入ValueStack的呢？答案是：ModelDrivenInterceptor.
 * ModelDrivenInterceptor是缺省的拦截器链的一部分，当一个请求经过ModelDrivenInterceptor的时候，在这个拦截器中，
 * 会判断当前要调用的Action对象是否实现了ModelDriven接口，如果实现了这个接口，则调用getModel()方法，
 * 并把返回值（本例是返回user对象）压入ValueStack。
 */
@Component("userRegister")
@Scope("prototype")
public class UserRegisterAction extends ActionSupport implements ModelDriven<Object> {
	
	private static final long serialVersionUID = 1L;
	private UserInfo info = new UserInfo();
	private UserService us;

	@Override
	public String execute() throws Exception {
		User u = new User();
		u.setName(info.getName());
		u.setPassword(info.getPassword());
		if(us.exists(u))
			return "fail";
		us.add(u);
		return "success";
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.opensymphony.xwork2.ModelDriven#getModel()
	 * 实现了ModelDriven接口，getModel方法将会返回用户注册界面 register.jsp中的用户信息，保存在ValueStack中。
	 */
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
