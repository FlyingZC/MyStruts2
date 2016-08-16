package com.zc.javaweb.valuestack;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.util.ValueStack;

public class ProductAction {
	//将整个对象作为action的一个属性
	private Product product;

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	
	public String save(){
		product=new Product();
		product.setProductName("汽车");
		product.setProductPrice("100元");
		
		ValueStack valueStack = ActionContext.getContext().getValueStack();
		//把product对象压入值栈栈顶
		valueStack.push(product);
		
		return "success";
	}
	
}
