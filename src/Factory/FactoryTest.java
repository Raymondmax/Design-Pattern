package Factory;

public class FactoryTest {
	public static void main(String[] args) {
	/*	SendFactory sendFactory = new SendFactory();*/
/*		Sender sender = sendFactory.produce("sms");*/
		Sender sender = SendFactory.produceMail();
		sender.send();
	}
}
