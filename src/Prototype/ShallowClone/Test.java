package Prototype.ShallowClone;

import java.util.Date;

public class Test {
	public static void main(String[] args) throws Exception{
		Date date = new Date(1274397294739L);
		Sheep s1 = new Sheep("prototypeSheep",date);
		Sheep s2 = (Sheep) s1.clone();//clone a sheep
		System.out.println(s1);
		System.out.println(s1.getSname());
		System.out.println("Origin date£º"+s1.getBirthday());
		date.setTime(34732834827389L);//change the original date
		System.out.println("Changed date£º"+date.toString());
		 
		System.out.println("---------------------------------");
		System.out.println(s2);
		System.out.println(s2.getSname());
		System.out.println(s2.getBirthday());//use the changed date
	}

}
