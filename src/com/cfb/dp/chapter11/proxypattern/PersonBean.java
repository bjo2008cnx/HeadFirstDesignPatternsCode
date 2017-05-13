package com.cfb.dp.chapter11.proxypattern;

public interface PersonBean {

	// 基本信息
	String getName();
	String getGender();
	String interests();
	
	// 别人的评分
	int getHotOrNotRating();
	
	// 相应的set方法
	void setName(String name);
    void setGender(String gender);
    void setInterests(String interests);
    
    void setHotOrNotRating(int rating); 
 
}
