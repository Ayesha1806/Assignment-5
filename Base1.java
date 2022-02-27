package Assigment5;

public class Base1 {
	class Base {
	    public Base() {
	        System.out.print("Base ");
	    }

	    public Base(String s) {
	        System.out.print("Base: " + s);
	    }
	}

	class Derived extends Base {
	    public Derived(String s) {
	        super(); // Stmt-1
	        super(s); // Stmt-2
	        System.out.print("Derived ");
	    }
	}

	class Test {
	    public static void main(String[] args) {
	        Base base = new Derived("Hello ");
	    }
	}


}                          e) Removing both Stmt-1 and Stmt-2 will make the program compilable and it will print the following: Base: Hello Derived.

