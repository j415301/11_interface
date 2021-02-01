package com.inter.model.vo;

import com.inter.common.MakeBurger;

public class Mac extends Burger implements MakeBurger{
	
	public Mac(String name, int price, int size) {
		super(name, price, size);
	}
	
	public void makeMacBurger() {
		System.out.println("맥도날드 : "+super.getName()+"은 "+super.getPrice()
			+"입니다.");
	}
	
	@Override
	public void makeBurger() {
		makeMacBurger();
	}
	
	@Override
	public void infoBurger() {
		
	}

}
