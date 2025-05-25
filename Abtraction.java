package project6789;
abstract  class Plane{
	abstract void takeOff();
	abstract void fly();
	abstract void land();
	
}
class CargoPlane extends Plane{
	void takeOff() {
		System.out.println("cargoplane is take Off");
	}
		void fly() {
			System.out.println("cargoPlane is fly for low Height");
		}
			void land() {
				System.out.println("cargoPlane in landing");
			
		
	}
	
}
class PassengerPlane extends Plane{
	void takeOff() {
		System.out.println("Passenger is take Off");
	}
		void fly() {
			System.out.println("PassengerPlane is fly for  Medium Height");
		}
			void land() {
				System.out.println("cargoPlane in landing");
			
		
	}
	
	
}
class FighterPlane extends Plane{
	
	void takeOff() {
		System.out.println("Fighter Plane is take Off");
	}
		void fly() {
			System.out.println("FighterPlane is fly for  Greater Height");
		}
			void land() {
				System.out.println("Fighter Plane in landing");
			
		
	}
	
	
}
class Airport{
	static void permit(Plane ref) {
		ref.takeOff();
		ref.fly();
		ref.land();
	}
}


public class Abtraction {
	

	public static void main(String[] args) {
CargoPlane cp=new CargoPlane();
PassengerPlane pp=new PassengerPlane();
FighterPlane fp=new FighterPlane();
 Airport.permit(cp);
 Airport.permit(fp);
Airport.permit(pp);
	}

}
