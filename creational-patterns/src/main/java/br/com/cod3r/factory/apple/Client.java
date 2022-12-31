package br.com.cod3r.factory.apple;

import br.com.cod3r.factory.apple.factory.IPhoneXFactory;
import br.com.cod3r.factory.apple.halfsimplefactory.IPhone11HalfSimpleFactory;
import br.com.cod3r.factory.apple.model.IPhone;
import br.com.cod3r.factory.apple.model.IPhoneLevel;
import br.com.cod3r.factory.apple.factory.IPhone11Factory;

public class Client {
	
	public static void main(String[] args) {
		IPhone11Factory iPhone11Factory = new IPhone11Factory();
		IPhoneXFactory iPhoneXFactory = new IPhoneXFactory();

		System.out.println("### Using a factory to each class");
		System.out.println("### Ordering an iPhone 11");
		IPhone ip11 = iPhone11Factory.orderIPhone();
		System.out.println(ip11);
		System.out.println("\n\n### Ordering an iPhone X");
		IPhone ipX = iPhoneXFactory.orderIPhone();
		System.out.println(ipX);

		IPhone11HalfSimpleFactory iPhone11HalfSimpleFactory = new IPhone11HalfSimpleFactory();

		System.out.println("\n\n\n### Using a half simple factory");
		System.out.println("### Ordering an iPhone 11");
		IPhone ipHS11 = iPhone11HalfSimpleFactory.orderIPhone(IPhoneLevel.SIMPLE);
		System.out.println(ipHS11);
		System.out.println("\n\n### Ordering an iPhone 11 pro");
		IPhone ipHS11P = iPhone11HalfSimpleFactory.orderIPhone(IPhoneLevel.HIGH_END);
		System.out.println(ipHS11P);
	}
}
