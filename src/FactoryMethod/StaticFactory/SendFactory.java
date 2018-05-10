package FactoryMethod.StaticFactory;

public class SendFactory {
	public static Sender produceMail(){
		return new MailSender();
	}
	public static Sender produceSms(){
		return new SmsSender();
	}
}
