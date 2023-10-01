class Fruit{
	static int fruitcounter;
	public Fruit() {
		fruitcounter++;
	}
}
class Apples extends Fruit{
	static int applecounter;
	public Apples() {
		applecounter++;
	}
}
class Mangoes extends Fruit{
	static int mangoescounter;
	public Mangoes() {
		mangoescounter++;
	}
}
public class Q2 {
	public static void main(String[] args) {
		Apples a1=new Apples();
		Apples a2=new Apples();
		Apples a3=new Apples();
		Apples a4=new Apples();
		Mangoes m1=new Mangoes();
		Mangoes m2=new Mangoes();
		Mangoes m3=new Mangoes();
		Mangoes m4=new Mangoes();
		
		System.out.println("Number of Fruits are : "+Fruit.fruitcounter+"\nNumber of Apples are : "+Apples.applecounter+"\nNumber of Mangoes are : "+Mangoes.mangoescounter);
	}
}
