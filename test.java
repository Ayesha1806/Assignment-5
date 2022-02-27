package Assigment5;

public class test {
	//Write a method that overloads the talk method by taking in a name and printing “Hello” with that name.

	
	    public static void talk()
	    {
	          System.out.println("Hello");
	    }
	    
	    public static void talk(String name) {
	    	System.out.print(name);
	    	
	    }
	    
	    public static void main(String[] args)
	    {
	    	talk();
	    	talk("Ayesha");
	    }


	

}
