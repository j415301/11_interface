package com.inter.controller;

import com.inter.common.PrintDriver;

public class PrinterController {
	
	//private HpPrinter print = new HpPrinter();
	//private LgPrinter print = new LgPrinter();
	//private SamsungPrinter print = new SamsungPrinter();
	private PrintDriver print;
	
	public PrinterController (PrintDriver print) {
		this.print = print;
	}
	
	public void print() {
		//����� �����ͱ⸦ �̿��� �μ��ϴ� ���
		print.print();
		print.test();
	}

}
