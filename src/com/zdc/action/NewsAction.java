package com.zdc.action;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.zdc.dto.NewsInfo;
import com.zdc.model.News;
import com.zdc.model.User;
import com.zdc.service.Release;

@Component("newsSubmit")
@Scope("prototype")
public class NewsAction extends ActionSupport implements ModelDriven<Object> {

	private static final long serialVersionUID = 8151960239812789250L;

	private Release ri;
	private NewsInfo info = new NewsInfo();
	private News news = new News();
	private User user;

	@Override
	public Object getModel() {
		return info;
	}

	@Override
	public String execute() throws Exception {
		info.setDate(getCurrentDate());

		news.setType(info.getType());
		news.setHead(info.getHead());
		news.setContent(info.getContent());
		news.setDate(info.getDate());
		news.setIssueUser(info.getIssueUser());
		if (news.getHead() != null && news.getHead().length() > 0 && news.getContent() != null
				&& news.getContent().length() > 0 && news.getIssueUser() != null && ri.isSuccess(news)) {
			ri.saveNews(news);
			return "success";
		}
		return "fail";
	}

	private String getCurrentDate() {
		return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
	}

	public Release getRi() {
		return ri;
	}

	@Resource(name = "release")
	public void setRi(Release ri) {
		this.ri = ri;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
