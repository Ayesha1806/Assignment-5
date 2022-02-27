package Assigment5;

public class Animal {
	String talk;
	String eat;
	String drink;
	public static void getTalk() {
		System.out.println("Animal can talk with there language");
	}
	public static void getEat() {
		System.out.println("different animals can eat different things");
	}
	public static void getDrunk() {
		System.out.println("Animals can drink water");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a=new Animal();
		a.getTalk();
		a.getEat();
		a.getDrunk();

	}

}
