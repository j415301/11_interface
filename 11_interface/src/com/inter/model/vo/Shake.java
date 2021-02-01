package com.inter.model.vo;

public class Shake extends Burger{
	
	public Shake(String name, int price, int size) {
		super(name, price, size);
	}
	
	public void makeShake() {
		System.out.println("ΩßΩß : "+super.getName()+"¿∫ "+super.getPrice()+
				"¿‘¥œ¥Ÿ.");
	}

}
