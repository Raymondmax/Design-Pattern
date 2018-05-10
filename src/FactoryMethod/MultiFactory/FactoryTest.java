package FactoryMethod.MultiFactory;

public class FactoryTest {
	public static void main(String[] args) {
		SendFactory sendFactory = new SendFactory();
		Sender sender = sendFactory.produceMail();
		sender.send();
	}
}
