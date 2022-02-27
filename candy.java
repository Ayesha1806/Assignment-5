package Assigment5;

public class candy {
	 public String taste()
	    {
	        return "tastes sweet!";
	    }
	 class Chocolate extends candy
		{
		 public String taste()
		    {
		        return  "tastes chocolately";
		    }
		}

	    public static void main(String[] args)
	    {
	        candy c1 = new candy();
	        System.out.println(c1.taste());
	        candy c2 = c1.new Chocolate();
	        System.out.println(c2.taste());
	    }
	}
	 
	

	
