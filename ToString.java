package com.Project;

class person{
	private String name;
	private int age;
	public void Person(String name,int age)
	{
	
		this.name=name;
		this.age=age;
		
	}
	@Override
	public String toString() {
		return"[name="+name+",age="+age+"]";
		
	}
}
public class ToString {

	public static void main(String[] args) {
	person p1=new person();
	System.out.println(p1);
	person p2=new person();
	System.out.println(p2);

	}

}
