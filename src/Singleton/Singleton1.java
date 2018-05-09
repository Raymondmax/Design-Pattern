package Singleton;

public class Singleton1 {
	
	private Singleton1(){
	}
	//use an inner class to maintain the singleton.
	private static class SingletonFactory{
		private static Singleton1 instance = new Singleton1();
	}
	
	private static Singleton1 getInstance(){
		return SingletonFactory.instance;
	}
	
	public Object readResolve() {  
        return getInstance();  
    }  
}
