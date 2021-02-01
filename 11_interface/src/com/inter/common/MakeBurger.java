package com.inter.common;

public interface MakeBurger {
	//버거 생성하는 기능을 강제하는 인터페이스
	
	//멤버변수는 선언이 불가능함
	//private int count;//불가능
	public static final int COUNT = 100;//상수만 가능
	String TITLE = "버거 만들기";
	//반면 title은 상수 선언부 없이도 잘 됨! 왜? 이전에 있는 public static final이 적용됨
	//인터페이스는 객체 생성이 불가능함
	
	//인터페이스 내부에는 추상매소드만 선언 가능
//	public void makeBurger() {
//		System.out.println("버거 만드는 거 구현");
//	}//error
	public abstract void makeBurger()/*{System.out.println("구현 되나?")}*/;
	//error: abstract mathod는 body 구현 불가
	
	void infoBurger();
	//public abstract 접근제한자 예약어가 반드시 포함되기 때문에 자동으로 붙여주므로 생략해도 됨

}
