package com.Project;
class Plane{
	 void takeOff(){
		 System.out.println("plane is take off");
	 }
	 void fly() {
		 System.out.println("plane is Flying");
	 }
	 void land() {
		 System.out.println("plane is land");
	 }
}
class PassengerPlane extends Plane{
	void fly() {
		System.out.println( "passenger plane is  Medium height fly");
	}
	void carryPassenger() {
		System.out.println("passenger plane is carry of passsenger");
	}
	
}
class CargoPlane extends Plane{
	void fly() {
		System.out.println("cargo plane is fly low height");
		
	}
	void cargoPlane() {
		System.out.println("cargo plane is carrying cargo");
		
	}
}
class FighterPlane extends Plane{
	void  fly() {
		System.out.println("fighter plane is great height flying");
	}
	void carryWeapons() {
		System.out.println("fighter plane is carrying weapons");
	}
}
public class  inheritance{
	
  public static void main(String[] args) {
	  PassengerPlane pp=new  PassengerPlane();
	  CargoPlane cp=new CargoPlane();
	  FighterPlane fp =new FighterPlane();
	   pp.takeOff();
	   pp.fly();
	   pp.land();
	   pp.carryPassenger();
	   System.out.println("pp is ok");
	   cp.takeOff();
	   cp.fly();
	   cp.land();
	   cp.cargoPlane();
	   System.out.println("cc is ok");
	   fp.takeOff();
	   fp.fly();
	   fp.land();
	   fp.carryWeapons();
	   System.out.println("fp is ok");
	   
	  
		

	}

}
