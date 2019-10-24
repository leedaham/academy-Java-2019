package p379;

import p378.ImplementationC;
import p378.InterfaceA;
import p378.InterfaceB;
import p378.InterfaceC;

public class Example {
	public static void main(String[] args) {
		ImplementationC impl = new ImplementationC();
		
		InterfaceA ia = impl;
		ia.methodA();			//InterfaceA ������ methodA()�� ȣ�� ����
		System.out.println();
		
		InterfaceB ib = impl;
		ib.methodB();			//InterfaceB ������ methodB()�� ȣ�� ����
		System.out.println();
		
		InterfaceC ic = impl;
		ic.methodA();			//InterfaceC ������ methodA(),B(),C() ��� ȣ�� ����
		ic.methodB();
		ic.methodC();
	}
}
