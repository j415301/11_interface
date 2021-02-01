package com.inter.model.vo;

import com.inter.common.MakeBurger;

public class King extends Burger implements MakeBurger{
								 //implements: MakeBurger을 구현한다
	
	public King(String name, int price, int size) {
		super(name, price, size);
	}
	
	public void makeKingBurger() {
		System.out.println("버거킹 : "+super.getName()+"은 "+super.getPrice()
			+"입니다.");
	}
	
	@Override
	public void makeBurger() {
		makeKingBurger();
	}
	
	@Override
	public void infoBurger() {
		
	}

}
