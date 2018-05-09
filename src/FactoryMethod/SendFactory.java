package FactoryMethod;

public class SendFactory {
	/*public Sender produce(String type){
		if("mail".equals(type)){
			return new MailSender();
		}else if("sms".equals(type)){
			return new SmsSender();
		}else{
			System.out.println("��������ȷ������");
			return null;
		}
	}*/
	/*public Sender produceMail(){
		return new MailSender();
	}
	public Sender produceSms(){
		return new SmsSender();
	}*/
	public static Sender produceMail(){
		return new MailSender();
	}
	public static Sender produceSms(){
		return new SmsSender();
	}
}
