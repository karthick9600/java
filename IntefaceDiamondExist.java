package project6789;
interface Calculator1{
	void add();
	void sub();
}

interface Calculator2{
	void mul();
	void div();
}

class Mycalculator implements Calculator1,Calculator2{
	public void add(){
		int a=200;
		int b =100;
		System.out.println(a+b);
		
	}
	public void sub() {
		int a=200;
		int b=100;
		System.out.println(a-b);
	}
	public void  mul() {
		int  a=20;
		int b=10;
		
		System.out.println(a*b);
		
	}
	public void div() {
		int a=20;
		int b=10;
		System.out.println(a/b);
	}
	
}
public class IntefaceDiamondExist {

	public static void main(String[] args) {
		Mycalculator mc =new Mycalculator();
		mc.add();
		mc.sub();
		mc.mul();
		mc.div();
	

	}

}
