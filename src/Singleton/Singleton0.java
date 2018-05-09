package Singleton;

public class Singleton0 {
	/*hold the private and static instance,aims to achieve delay load.*/
	//private static Singleton instance = new Singleton(); //hungryMan
	private static Singleton0 instance = null; //lazyMan
	/*private construct method,avoid being instantiated¡£*/
	private Singleton0(){
	}
	/*static factory method,create instance.*/
	/*public static Singleton0 getInstance(){
		return instance;
	}*/
	public static Singleton0 getInstance(){
		if(instance == null){
			synchronized (instance) {//it need to be locked before creating an object for the first time,after that it no need to do so.
				if(instance ==  null){
					instance =  new Singleton0();
				}
			}
		}
		return instance;
	}
	
	/*if the object is used to serialized,it will assure the serialized object consistent with the former.*/
	public Object readResolve(){
		return instance;
	}
}
