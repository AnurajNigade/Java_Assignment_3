class Vehicle{
	double milage;
	double price;
	public Vehicle(double milage, double price) {
		super();
		this.milage = milage;
		this.price = price;
	}
	
}
class Car extends Vehicle{
	double OwnCost;
	int warranty;
	int seatCapacity;
	char fuelType;
	public Car(double milage, double price, double ownCost, int warranty, int seatCapacity, char fuelType) {
		super(milage, price);
		OwnCost = ownCost;
		this.warranty = warranty;
		this.seatCapacity = seatCapacity;
		this.fuelType = fuelType;
	}
	
}
class Bike extends Vehicle{
	int numCylinder;
	int numGear;
	String coolingType;
	String wheelType;
	int fueltankSize;
	public Bike(double milage, double price, int numCylinder, int numGear, String coolingType, String wheelType,
			int fueltankSize) {
		super(milage, price);
		this.numCylinder = numCylinder;
		this.numGear = numGear;
		this.coolingType = coolingType;
		this.wheelType = wheelType;
		this.fueltankSize = fueltankSize;
	}
	
	
}
class Audi extends Car{
	String modelType;

	public Audi(double milage, double price, double ownCost, int warranty, int seatCapacity, char fuelType,
			String modelType) {
		super(milage, price, ownCost, warranty, seatCapacity, fuelType);
		this.modelType = modelType;
	}

	@Override
	public String toString() {
		return "Audi [modelType=" + modelType + ", OwnCost=" + OwnCost + ", warranty=" + warranty + ", seatCapacity="
				+ seatCapacity + ", fuelType=" + fuelType + ", milage=" + milage + ", price=" + price +  "]";
	}
	
	
	
	
}
class Ford extends Car{
	String modelType;

	public Ford(double milage, double price, double ownCost, int warranty, int seatCapacity, char fuelType,
			String modelType) {
		super(milage, price, ownCost, warranty, seatCapacity, fuelType);
		this.modelType = modelType;
	}

	@Override
	public String toString() {
		return "Ford [modelType=" + modelType + ", OwnCost=" + OwnCost + ", warranty=" + warranty + ", seatCapacity="
				+ seatCapacity + ", fuelType=" + fuelType + ", milage=" + milage + ", price=" + price + "]";
	}
	
	
	
	
}
class Bajaj extends Bike{
	String makeType;

	public Bajaj(double milage, double price, int numCylinder, int numGear, String coolingType, String wheelType,
			int fueltankSize, String makeType) {
		super(milage, price, numCylinder, numGear, coolingType, wheelType, fueltankSize);
		this.makeType = makeType;
	}

	@Override
	public String toString() {
		return "Bajaj [makeType=" + makeType + ", numCylinder=" + numCylinder + ", numGear=" + numGear
				+ ", coolingType=" + coolingType + ", wheelType=" + wheelType + ", fueltankSize=" + fueltankSize
				+ ", milage=" + milage + ", price=" + price + "]";
	}
	
	
	
}
class TVS extends Bike{
	String makeType;

	public TVS(double milage, double price, int numCylinder, int numGear, String coolingType, String wheelType,
			int fueltankSize, String makeType) {
		super(milage, price, numCylinder, numGear, coolingType, wheelType, fueltankSize);
		this.makeType = makeType;
	}

	@Override
	public String toString() {
		return "TVS [makeType=" + makeType + ", numCylinder=" + numCylinder + ", numGear=" + numGear + ", coolingType="
				+ coolingType + ", wheelType=" + wheelType + ", fueltankSize=" + fueltankSize + ", milage=" + milage
				+ ", price=" + price + "]";
	}
	
	
	
}

public class Q4 {
	public static void main(String[] args) {
		Audi a1=new Audi(20, 2500000, 50000, 10, 5, 'P', "A1");
		Ford f1=new Ford(15, 50.2, 20000, 15, 2, 'P', "ECO_SPORT");
		
		System.out.println(a1.toString());
		System.out.println(f1.toString());
	}
}
