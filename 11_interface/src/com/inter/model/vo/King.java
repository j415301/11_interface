package com.inter.model.vo;

import com.inter.common.MakeBurger;

public class King extends Burger implements MakeBurger{
								 //implements: MakeBurger�� �����Ѵ�
	
	public King(String name, int price, int size) {
		super(name, price, size);
	}
	
	public void makeKingBurger() {
		System.out.println("����ŷ : "+super.getName()+"�� "+super.getPrice()
			+"�Դϴ�.");
	}
	
	@Override
	public void makeBurger() {
		makeKingBurger();
	}
	
	@Override
	public void infoBurger() {
		
	}

}
