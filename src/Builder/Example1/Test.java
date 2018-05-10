package Builder.Example1;

public class Test {
	public static void main(String[] args) {
		PersonDirecter pd = new PersonDirecter();
		Person p = pd.constructPerson(new ManBuilder());
		System.out.println(p.getHead());
		System.out.println(p.getBody());
		System.out.println(p.getFoot());
	}
}
