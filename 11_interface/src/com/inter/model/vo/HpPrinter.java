package com.inter.model.vo;

import com.inter.common.PrintDriver;

public class HpPrinter implements PrintDriver{
	
	public void printHp() {
		System.out.println("Hp������ �μ���");
	}
	
	@Override
	public void print() {
		printHp();
	}
	
	@Override
	public void scan() {
		
	}

}
