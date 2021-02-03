package com.inter.model.vo;

import com.inter.common.PrintDriverObj;
import com.inter.common.PrintDriver;

public class CannonPrinter extends PrintDriverObj implements PrintDriver/*, 
															MakeBurger*/{
	                       //추상 클래스는 단일상속만 가능 //interface는 다중 상속 가능
	//데이터, 값, 기능들이 복합적으로 필요하면 추상클래스
	//기능만 필요하면 인터페이스
	
	@Override
	public void print() {
		System.out.println("Cannon프린트 인쇄중!");
	}
	
	@Override
	public void scan() {
		
	}
	
	

}
