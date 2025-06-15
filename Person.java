package one;

import java.util.Comparator;

public class Person {
	private String name;
	private int age;
	public Person(String name,int age) {
		this.name=name;
		this.age=age;
	}
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}

	public  class PersonAgeComparator  implements Comparator<Person>{
		public int compare(Person p1,Person p2) {
			//compare person based on their age
			return Integer.compare(p1.getAge(),p2.getAge());
			
		}
		

	}

}
