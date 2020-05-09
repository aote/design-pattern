package com.aote.factory.absFactory.order;


import com.aote.factory.absFactory.LDCheesePizza;
import com.aote.factory.absFactory.LDPepperPizza;
import com.aote.factory.absFactory.Pizza;

public class LDFactory implements AbsFactory {

	@Override
	public Pizza createPizza(String orderType) {
		System.out.println("~ʹ�õ��ǳ��󹤳�ģʽ~");
		Pizza pizza = null;
		if (orderType.equals("cheese")) {
			pizza = new LDCheesePizza();
		} else if (orderType.equals("pepper")) {
			pizza = new LDPepperPizza();
		}
		return pizza;
	}

}
