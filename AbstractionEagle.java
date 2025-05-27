package project6789;
abstract class Bird{
	abstract void eat();
	abstract void fly();
	
	
}
abstract class Eagle extends Bird{
	void fly() {
		System.out.println("Eagle flies greate height");
	}
}
class SerpenEagle extends Eagle{
	void eat() {
		System.out.println("hunts over mountain and eats");
	}
}
class GoldenEagle extends Eagle{
	void eat() {
		System.out.println("golden eagle  hunts over ocean and eats");
	}
}

public class AbstractionEagle {

	public static void main(String[] args) {
		SerpenEagle se=new SerpenEagle();
		GoldenEagle  ge=new GoldenEagle();
		se.eat();
		se.fly();
		ge.fly();
		ge.eat();
	}

}
