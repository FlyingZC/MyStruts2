package com.zc.javaweb;

import java.util.Map;

import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.ParameterAware;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;
//ApplicationAware用来对application范围内的参数进行设置
public class TestAwareAction implements ApplicationAware,SessionAware,RequestAware,ParameterAware {
	private Map<String,Object> application;
	
	public String execute(){
		application.put("myAppName", "myAppValue");
		return "SUCCESS";
	}

	public void setApplication(Map<String, Object> application) {
		// TODO Auto-generated method stub
		this.application=application;
	}

	public void setParameters(Map<String, String[]> arg0) {
		// TODO Auto-generated method stub
		
	}

	public void setRequest(Map<String, Object> arg0) {
		// TODO Auto-generated method stub
		
	}

	public void setSession(Map<String, Object> arg0) {
		// TODO Auto-generated method stub
		
	}

}
