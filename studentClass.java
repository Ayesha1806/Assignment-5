package Assigment5;
public class studentClass {

	public String name;
	public int id;
	public static String getName(String name ) {
		return name;
	}
	public static int getId(int id) {
		return id;
	}
	



	
public static void main(String[] args) {
	// TODO Auto-generated method stub
	studentClass obj=new studentClass();
	String name=obj.getName("john");
	int roll_no=obj.getId(02);
	System.out.println("student name is :" +name);
	System.out.println("student id is :" +roll_no);


}
}