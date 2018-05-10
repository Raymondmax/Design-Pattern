package FactoryMethod.StaticFactory;

public class FactoryTest {
	public static void main(String[] args) {
		Sender sender = SendFactory.produceMail();
		sender.send();
	}
}
