package Assigment5;

public class Dog {
	public void Speak() {
        System.out.println("woof!");

	}
	class Beagle extends Dog{
		public  void Speak() {
	        System.out.println("arf arf");

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d=new Dog();
		d.Speak();
		Dog b=d.new Beagle();
		b.Speak();

	}

}

