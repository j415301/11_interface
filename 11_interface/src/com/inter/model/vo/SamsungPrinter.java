package com.inter.model.vo;

import com.inter.common.PrintDriver;

public class SamsungPrinter  implements PrintDriver{
	
	public void samPrint() {
		System.out.println("SAMSUNG프린터 인쇄중");
	}
	
	@Override
	public void print() {
		samPrint();
	}
	
	@Override
	public void scan() {
		
	}

}
