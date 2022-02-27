package Assigment5;
import java.util.Scanner;

public class empolyeId {
	String name;
	int id;
	//int[] array=new int[4];
	
	public static String getEmpName(String n) {
		return n;
		
	}
	public static int getEmpId(int i) {
		return i;
	}

	public static void main(String[] args, Object n) {
		// TODO Auto-generated method stub
		empolyeId[] arr=new empolyeId[4];
		Scanner s=new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
		System.out.println("enter the empolye name : " );
	    String	name=s.nextLine();
	    System.out.println("the the employe name : ");
	    int id=s.nextInt();
	    empolyeId obj=new empolyeId();
	   String s1= obj.getEmpName(name);
	  int id1= obj.getEmpId(id);
		System.out.println("employe names are : " +s1);
		System.out.println("employe id are : " +id1);

		}
	}

}
