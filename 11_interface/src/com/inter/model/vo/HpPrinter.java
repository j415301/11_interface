package com.inter.model.vo;

import com.inter.common.PrintDriver;

public class HpPrinter implements PrintDriver{
	
	public void printHp() {
		System.out.println("Hp프린터 인쇄중");
	}
	
	@Override
	public void print() {
		printHp();
	}
	
	@Override
	public void scan() {
		
	}

}
