package com.inter.model.vo;

import com.inter.common.MakeBurger;

public class Mac extends Burger implements MakeBurger{
	
	public Mac(String name, int price, int size) {
		super(name, price, size);
	}
	
	public void makeMacBurger() {
		System.out.println("�Ƶ����� : "+super.getName()+"�� "+super.getPrice()
			+"�Դϴ�.");
	}
	
	@Override
	public void makeBurger() {
		makeMacBurger();
	}
	
	@Override
	public void infoBurger() {
		
	}

}
