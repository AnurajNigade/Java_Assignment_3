interface Mammals {
    default void output1() {
        System.out.println("I am a mammal.");
    }
}

interface MarineAnimals {
    default void output2() {
        System.out.println("I am a marine animal.");
    }
}

class BlueWhale implements Mammals,MarineAnimals{
    public void output3() {
        System.out.println("I belong to both the categories: Mammals as well as Marine Animals.");
    }
}


public class Q1 {
	public static void main(String[] args) {
		BlueWhale b1=new BlueWhale();
		b1.output1();
		b1.output2();
		b1.output3();
		
	}
}
