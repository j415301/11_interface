package com.inter.common;

import java.io.Serializable;

//�������̽����� ��� ����
//�������̽� ����� ���߻�� ����
public interface PrintDriver extends MakeBurger, Serializable,Runnable{
	
	void print();
	void scan();
	
	//�̷��� interface�� default�� �� interface�� ��ӹް� �ִ� ��� Ŭ������
	//�ڵ����� Override���ִ� ����� ����
	//�������� ������� �߰� �޼ҵ带 �����ϴ� ���
	default public void test() {
		System.out.println("�ȳ��ϼ���");
	}

}
