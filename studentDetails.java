package Assigment5;

public class studentDetails {
	public String name;
	public int rollNumber;
	public long mobileNumber;
	public static String getName(String name) {
		return name;
		
	}
	public static int getRollNum(int roll) {
		return roll;
	}
	public static long getMobileNum(long num) {
		return num;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		studentDetails obj=new studentDetails();
		String name=obj.getName("sam");
		int num=obj.getRollNum(01);
		long mobile=obj.getMobileNum(98754321l);
		System.out.println("Details of sam : " +name +" "+num+" "+mobile);
		String name1=obj.getName("john");
		int num1=obj.getRollNum(02);
		long mobile1=obj.getMobileNum(881612871l);
		System.out.println("Details of john : " +name1 +" "+num1+" "+mobile1);



		

	}

}
