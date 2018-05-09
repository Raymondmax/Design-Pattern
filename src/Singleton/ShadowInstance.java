package Singleton;

import java.util.Vector;

public class ShadowInstance {
	private static ShadowInstance instance = null;
	private Vector properties = null;
	
	public Vector getProperties(){
		return properties;
	}
	private ShadowInstance(){
	}
	
	private static synchronized void syncInit(){
		if(instance == null){
			instance = new ShadowInstance();
		}
	}
	public static ShadowInstance getInstance(){
		if(instance ==  null){
			syncInit();
		}
		return instance;
	}
	public void updateProperties(){
		ShadowInstance shadow = new ShadowInstance();
		properties = shadow.getProperties();
	}
}
