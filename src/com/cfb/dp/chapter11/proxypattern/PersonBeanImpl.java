package com.cfb.dp.chapter11.proxypattern;

public class PersonBeanImpl implements PersonBean {

	String name;
	String gender;
	String interests;
	
	// 打分最终结果，已经评分的数量
	int rating;							// 总分
	int ratingCount = 0;				// 评分人数
	
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
			// 没人打分
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
		// 加总分
		this.rating += rating;	
		// 加计数
		ratingCount++;
	}

}
