package com.inter.common;

public interface MakeBurger {
	//���� �����ϴ� ����� �����ϴ� �������̽�
	
	//��������� ������ �Ұ�����
	//private int count;//�Ұ���
	public static final int COUNT = 100;//����� ����
	String TITLE = "���� �����";
	//�ݸ� title�� ��� ����� ���̵� �� ��! ��? ������ �ִ� public static final�� �����
	//�������̽��� ��ü ������ �Ұ�����
	
	//�������̽� ���ο��� �߻�żҵ常 ���� ����
//	public void makeBurger() {
//		System.out.println("���� ����� �� ����");
//	}//error
	public abstract void makeBurger()/*{System.out.println("���� �ǳ�?")}*/;
	//error: abstract mathod�� body ���� �Ұ�
	
	void infoBurger();
	//public abstract ���������� ���� �ݵ�� ���ԵǱ� ������ �ڵ����� �ٿ��ֹǷ� �����ص� ��

}
