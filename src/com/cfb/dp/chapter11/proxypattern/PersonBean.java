package com.cfb.dp.chapter11.proxypattern;

public interface PersonBean {

	// ������Ϣ
	String getName();
	String getGender();
	String interests();
	
	// ���˵�����
	int getHotOrNotRating();
	
	// ��Ӧ��set����
	void setName(String name);
    void setGender(String gender);
    void setInterests(String interests);
    
    void setHotOrNotRating(int rating); 
 
}
