package person;

public class Person {
	public Person(String name){
		this.name=name;
	}
	public Person(){
		System.out.println("Person() called");
	}
	public String name;
	protected int height;
	int age;
	private int weight;
}
