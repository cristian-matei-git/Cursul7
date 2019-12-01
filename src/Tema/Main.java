package Tema;

public class Main {

	public static void main(String[] args) {
		
		Vehicle car = new OnRoad("FDL8KMFSDLKM6", 2, "Sporty", 4, 2);
		car.goTo(12.3, 45.2);
		car.addFuel(28.12);
		car.printInfo();
		
		System.out.println();
		
		Vehicle ship = new OnWater("F8GFDG86D87GGD", 20, "Wavess", 2, 2000.0);
		ship.goTo(11.8, 4.33);
		ship.addFuel(148.05);
		ship.printInfo();
		
		System.out.println();
		
		Vehicle airplaneOne = new OnAir("GJR96GDF98DF9ND", 120, "Bluesky", 4, true);
		airplaneOne.goTo(41.3, 120.88);
		airplaneOne.addFuel(3000.5);
		airplaneOne.printInfo();
		
		System.out.println();
		
		OnAir airplaneTwo = new OnAir("BC325987DFKJS34", 20, "Localsky", 2, false);
		airplaneTwo.goTo(41.3, 120.88);
		airplaneTwo.addFuel(3000.5);
		airplaneTwo.printInfo();
	}

}
