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
		b[0] = new Shake("�ӽ������",8000,1);
		b[1] = new Mac("���",7000,1);
		b[2] = new King("����",8500,3);
		
		//�������̽��� Ÿ�� ����� ����
		MakeBurger maker = new King("����",8500,3);
		maker.makeBurger();
		
		//
		MakeBurger[] makes = new King[5];
		//new MakeBurger(): '��ü' ����
		//new MakeBurger[3]: ��ü�� ������ �� �ִ� '����' ����->new ����
		//makes �迭 �ȿ� �� �� �ִ� ��ü�� implements MakeBurger�� ��ü�鸸 ����
		makes[0] = new King("�Ұ�����",5000,1);//King ��ü���̱� ������ ���� ����
		makes[1] = new King("ġ�����",4500,1);
		makes[2] = new King("ġŲ����",4000,1);
		makes[3] = new King("����Ұ����",6000,1);
		makes[4] = new King("�Ұ��",5000,1);
		
		
		
		
		
		
		
		
		
		//�����ͱ�
		new PrinterController(new CannonPrinter()).print();
		
		PrintDriver pd = new CannonPrinter();
		PrintDriverObj po = new CannonPrinter();

	}

}

