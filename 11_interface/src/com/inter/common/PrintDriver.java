package com.inter.common;

import java.io.Serializable;

//인터페이스끼리 상속 가능
//인터페이스 상속은 다중상속 가능
public interface PrintDriver extends MakeBurger, Serializable,Runnable{
	
	void print();
	void scan();
	
	//이렇게 interface의 default는 이 interface를 상속받고 있는 모든 클래스에
	//자동으로 Override해주는 기능이 있음
	//예외적인 방식으로 추가 메소드를 구현하는 방식
	default public void test() {
		System.out.println("안녕하세요");
	}

}
