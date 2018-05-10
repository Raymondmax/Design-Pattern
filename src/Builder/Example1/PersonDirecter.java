package Builder.Example1;

public class PersonDirecter {
	public Person constructPerson(PersonBuilder pb){
		pb.buildHead();
		pb.buildBody();
		pb.buildFoot();
		return pb.buildPerson();
	}
}
