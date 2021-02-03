package com.inter.controller;

import com.inter.common.MakeBurger;

public class BurgerController implements MakeBurger{
	
	//private BurgerDao dao = new BurgerDao();
	private MakeBurger dao;
	
	public void burgerMaking() {
		dao.makeBurger();
	}
	
	@Override
	public void makeBurger() {
		burgerMaking();
	}
	
	@Override
	public void infoBurger() {
		
	};

}
