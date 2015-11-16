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
 * ��νModelDriven����˼��ֱ�Ӱ�ʵ���൱��ҳ�����ݵ��ռ�����ModelDriven����Ļ��ƾ���ValueStack��
 * ��ô��Ϊʲôuser�������ValueStack���أ�����ʲôʱ��ѹ��ValueStack���أ����ǣ�ModelDrivenInterceptor.
 * ModelDrivenInterceptor��ȱʡ������������һ���֣���һ�����󾭹�ModelDrivenInterceptor��ʱ��������������У�
 * ���жϵ�ǰҪ���õ�Action�����Ƿ�ʵ����ModelDriven�ӿڣ����ʵ��������ӿڣ������getModel()������
 * ���ѷ���ֵ�������Ƿ���user����ѹ��ValueStack��
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
	 * ʵ����ModelDriven�ӿڣ�getModel�������᷵���û�ע����� register.jsp�е��û���Ϣ��������ValueStack�С�
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
