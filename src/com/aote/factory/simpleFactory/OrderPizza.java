package com.aote.factory.simpleFactory;

import com.aote.factory.simpleFactory.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * ʹ�õ���
 */
public class OrderPizza {

	//����һ���򵥹�������
	SimpleFactory simpleFactory;
	Pizza pizza = null;
	
	//������
	public OrderPizza(SimpleFactory simpleFactory) {
		setFactory(simpleFactory);
	}
	
	public void setFactory(SimpleFactory simpleFactory) {
		String orderType = ""; //�û������
		
		this.simpleFactory = simpleFactory; //���ü򵥹�������
		
		do {
			orderType = getType(); 
			pizza = this.simpleFactory.createPizza(orderType);
			
			//���pizza
			if(pizza != null) { //�����ɹ�
				pizza.prepare();
				pizza.bake();
				pizza.cut();
				pizza.box();
			} else {
				System.out.println(" ��������ʧ�� ");
				break;
			}
		}while(true);
	}
	
	// дһ�����������Ի�ȡ�ͻ�ϣ����������������
	private String getType() {
		try {
			BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("input pizza ����:");
			String str = strin.readLine();
			return str;
		} catch (IOException e) {
			e.printStackTrace();
			return "";
		}
	}

}
