package com.inter.model.vo;

import com.inter.common.PrintDriver;

public class LgPrinter  implements PrintDriver{
	
	public void lgPrint() {
		System.out.println("LG������ �μ���!");
	}
	
	@Override
	public void print() {
		lgPrint();
	}
	
	@Override
	public void scan() {
		
	}

}
