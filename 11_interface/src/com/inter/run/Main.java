package com.inter.run;

import com.inter.common.MakeBurger;
import com.inter.common.PrintDriver;
import com.inter.common.PrintDriverObj;
import com.inter.controller.PrinterController;
import com.inter.model.vo.Burger;
import com.inter.model.vo.CannonPrinter;
import com.inter.model.vo.King;
import com.inter.model.vo.Mac;
import com.inter.model.vo.Shake;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Burger[] b = new Burger[4];
		b[0] = new Shake("머쉬룸버거",8000,1);
		b[1] = new Mac("빅맥",7000,1);
		b[2] = new King("와퍼",8500,3);
		
		//인터페이스도 타입 사용이 가능
		MakeBurger maker = new King("와퍼",8500,3);
		maker.makeBurger();
		
		//
		MakeBurger[] makes = new King[5];
		//new MakeBurger(): '객체' 생성
		//new MakeBurger[3]: 객체를 보관할 수 있는 '변수' 생성->new 가능
		//makes 배열 안에 들어갈 수 있는 객체는 implements MakeBurger한 객체들만 가능
		makes[0] = new King("불고기버거",5000,1);//King 객체들이기 때문에 생성 가능
		makes[1] = new King("치즈버거",4500,1);
		makes[2] = new King("치킨버거",4000,1);
		makes[3] = new King("더블불고기고기",6000,1);
		makes[4] = new King("불고기",5000,1);
		
		
		
		
		
		
		
		
		
		//프린터기
		new PrinterController(new CannonPrinter()).print();
		
		PrintDriver pd = new CannonPrinter();
		PrintDriverObj po = new CannonPrinter();

	}

}

