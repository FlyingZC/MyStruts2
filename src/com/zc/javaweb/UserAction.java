package com.zc.javaweb;

import java.util.Map;

import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.SessionAware;

public class UserAction implements SessionAware,ApplicationAware{
	private String username;
	private Map<String, Object> session;
	private Map<String, Object> application;
	public void setUsername(String username){
		this.username=username;
	}
	
	public String getUsername(){
		return username;
	}
	
	public String execute(){
		//把用户信息存入Session域中
		//1.获取session.通过实现SessionAware.由于多个方法需要
	
		//2.获取登录信息
		//3.把用户信息存入Session中
		session.put("username",username);
		
		//在线人数+1
		//1.获取当前在线人数.从application中获取
		Integer count=(Integer) application.get("count");
		if(count==null){
			count=0;
		}
		//2.当前在线人数+1
		count++;
		application.put("count",count);
		return "LOGIN-SUCCESS";
	}
	public void setSession(Map<String, Object> session) {
		// TODO Auto-generated method stub
		this.session=session;
		
	}


	public Map<String, Object> getSession(){
		return session;
	}
	
	public void setApplication(Map<String, Object> application) {
		// TODO Auto-generated method stub
		this.application=application;
	}
	
	public Map<String, Object> getApplication(){
		return application;
	}
}
