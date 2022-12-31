package br.com.cod3r.factory.apple;

import br.com.cod3r.factory.apple.factory.IPhoneXFactory;
import br.com.cod3r.factory.apple.model.IPhone;
import br.com.cod3r.factory.apple.factory.IPhone11Factory;

public class Client {
	
	public static void main(String[] args) {
		IPhone11Factory iPhone11Factory = new IPhone11Factory();
		IPhoneXFactory iPhoneXFactory = new IPhoneXFactory();

		System.out.println("### Ordering an iPhone 11");
		IPhone ip11 = iPhone11Factory.orderIPhone();
		System.out.println(ip11);
		System.out.println("\n\n### Ordering an iPhone X");
		IPhone ipX = iPhoneXFactory.orderIPhone();
		System.out.println(ipX);
	}
}
