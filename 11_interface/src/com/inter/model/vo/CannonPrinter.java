package com.inter.model.vo;

import com.inter.common.PrintDriverObj;
import com.inter.common.PrintDriver;

public class CannonPrinter extends PrintDriverObj implements PrintDriver/*, 
															MakeBurger*/{
	                       //�߻� Ŭ������ ���ϻ�Ӹ� ���� //interface�� ���� ��� ����
	//������, ��, ��ɵ��� ���������� �ʿ��ϸ� �߻�Ŭ����
	//��ɸ� �ʿ��ϸ� �������̽�
	
	@Override
	public void print() {
		System.out.println("Cannon����Ʈ �μ���!");
	}
	
	@Override
	public void scan() {
		
	}
	
	

}
