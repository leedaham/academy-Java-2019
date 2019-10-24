package p379;

import p378.ImplementationC;
import p378.InterfaceA;
import p378.InterfaceB;
import p378.InterfaceC;

public class Example {
	public static void main(String[] args) {
		ImplementationC impl = new ImplementationC();
		
		InterfaceA ia = impl;
		ia.methodA();			//InterfaceA 변수는 methodA()만 호출 가능
		System.out.println();
		
		InterfaceB ib = impl;
		ib.methodB();			//InterfaceB 변수는 methodB()만 호출 가능
		System.out.println();
		
		InterfaceC ic = impl;
		ic.methodA();			//InterfaceC 변수는 methodA(),B(),C() 모두 호출 가능
		ic.methodB();
		ic.methodC();
	}
}
