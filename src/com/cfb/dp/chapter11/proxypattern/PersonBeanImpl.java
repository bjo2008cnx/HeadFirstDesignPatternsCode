package com.cfb.dp.chapter11.proxypattern;

public class PersonBeanImpl implements PersonBean {

	String name;
	String gender;
	String interests;
	
	// ������ս�����Ѿ����ֵ�����
	int rating;							// �ܷ�
	int ratingCount = 0;				// ��������
	
	@Override
	public String getName() {
		return name;	
	}

	@Override
	public String getGender() {
		return gender;
	}

	@Override
	public String interests() {
		return interests;
	}

	@Override
	public int getHotOrNotRating() {
		if (ratingCount == 0) {
			// û�˴��
			return 0;
		} else {
			return (rating/ratingCount);
		}
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public void setInterests(String interests) {
		this.interests = interests;
	}

	@Override
	public void setHotOrNotRating(int rating) {
		// ���ܷ�
		this.rating += rating;	
		// �Ӽ���
		ratingCount++;
	}

}
