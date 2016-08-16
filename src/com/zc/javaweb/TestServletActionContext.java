package com.zc.javaweb;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

public class TestServletActionContext {
	public String execute(){
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpSession session = request.getSession();
		//application
		ServletContext servletContext = ServletActionContext.getServletContext();
		return "SUCCESS";
	}
}
