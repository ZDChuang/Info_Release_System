package com.zdc.action;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.zdc.dto.NewsInfo;
import com.zdc.model.News;
import com.zdc.service.Release;

@Component("index")
@Scope("prototype")
public class IndexAction extends ActionSupport implements ModelDriven<Object> {

	private static final long serialVersionUID = -9052675275440721686L;
	private NewsInfo info = new NewsInfo();
	private Release ri;
	private News newss = new News();
	private List<News> news;
	private List<News> hotNews = new ArrayList<News>();
	private List<News> confNews = new ArrayList<News>();
	private List<News> regulNews = new ArrayList<News>();
	private List<News> fileNews = new ArrayList<News>();

	@Override
	public Object getModel() {
		return info;
	}

	public String list() {
		news = ri.list();
		for (int i = news.size() - 1; i >= 0; i--) {
			String type = news.get(i).getType();
			if (type.equals("热点新闻")) {
				hotNews.add(news.get(i));
			} else if (type.equals("规章制度")) {
				regulNews.add(news.get(i));
			} else if (type.equals("会议纪要")) {
				confNews.add(news.get(i));
			} else
				fileNews.add(news.get(i));
		}
		return "success";
	}


	public String delete(){
		ri.deleteNews(info.getId());
		return "delete";
	}
	
	public String update(){
		newss.setId(info.getId());
		newss.setHead(info.getHead());
		newss.setContent(info.getContent());
		newss.setIssueUser(info.getIssueUser());
		newss.setType(info.getType());
		ri.updateNews(newss);
		return "update";
	}

	public List<News> getNews() {
		return news;
	}

	public void setNews(List<News> news) {
		this.news = news;
	}

	public Release getRi() {
		return ri;
	}

	@Resource(name = "release")
	public void setRi(Release ri) {
		this.ri = ri;
	}

	public List<News> getHotNews() {
		return hotNews;
	}

	public void setHotNews(List<News> hotNews) {
		this.hotNews = hotNews;
	}

	public List<News> getConfNews() {
		return confNews;
	}

	public void setConfNews(List<News> confNews) {
		this.confNews = confNews;
	}

	public List<News> getRegulNews() {
		return regulNews;
	}

	public void setRegulNews(List<News> regulNews) {
		this.regulNews = regulNews;
	}

	public List<News> getFileNews() {
		return fileNews;
	}

	public void setFileNews(List<News> fileNews) {
		this.fileNews = fileNews;
	}

	public News getNewss() {
		return newss;
	}

	public void setNewss(News newss) {
		this.newss = newss;
	}

}
