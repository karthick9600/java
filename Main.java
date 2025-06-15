

/*import java.util.Comparator;


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

} */

package one;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Student> students = new TreeSet<>();
        students.add(new Student("Alice", 101, 20));
        students.add(new Student("Bob", 99, 21));
        students.add(new Student("Charlie", 150, 22));

        for (Student s : students) {
            System.out.println(s);
        }
    }
}

