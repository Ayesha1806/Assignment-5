package Assigment5;

import Assigment5.sports;

public class sports {
	String getName(){
        return "Generic Sports";
    }
  
    void getNumberOfTeamMembers(){
        System.out.println( "Each team has n players in " + getName() );
    }

}
class Soccer extends sports{
    @Override
    String getName(){
        return "Soccer Class";
    }
    
	@Override
    void getNumberOfTeamMembers(){
        System.out.println( "Each team has 11 players in " + getName() );
    }

	public static void main(String[] args) {

		
        sports c1 = new sports();
        Soccer c2 = new Soccer();
        System.out.println(c1.getName());
        c1.getNumberOfTeamMembers();
        System.out.println(c2.getName());
        c2.getNumberOfTeamMembers();
	}

}
    

                    


