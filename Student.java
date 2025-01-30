import java.util.*;

public class Student{

	private ArrayList<String> st= new ArrayList<>();
	private Scanner sc = new Scanner(System.in);


public void addStudent(){

	System.out.println("Enter Name: ");
	String Name = sc.nextLine();
	System.out.println("Enter Roll No: ");
	String Roll_No = sc.nextLine();
	st.add("Name: "+ Name + "\nRoll No: "+ Roll_No);
	System.out.println("----------Student Added Successfully----------");
}

public void Delete(){
	if (st.isEmpty()){
			System.out.println("No Student to Display.....");
		}
	else{
		System.out.println("Student Deleted Successfully....");
		String n = sc.nextLine();
		/*for(String s: st){
			if(s == n){
			st.remove(n);
			System.out.println("Student Deleted Successfully....");
}*/
}
}

public void display() {
	if (st.isEmpty()){
		System.out.println("No Student to Display.....");
		}
	else{
		for(String s: st){
			System.out.println("---------------------------");
			System.out.println(s);
			System.out.println("...........................");
	}
	}
}

public static void main(String[] args){
	Student students = new Student();
while(true) {
	System.out.println("press 1 to Add New Student");
	System.out.println("press 2 to view All Student");
	System.out.println("press 3 to Delete Student");
	System.out.println("press 4 to Exit");
	int choice = students.sc.nextInt();
	students.sc.nextLine();

switch (choice) {
	case 1:
		students.addStudent();
		break;
	case 2:
		students.display();
	break;
	case 3:
		students.Delete();
		break;
	case 4:
		System.out.println("----------Exiting from the Program----------");
		students.sc.close();
	return;
	default:
		System.out.println("---------------------------\n");
		System.out.println("----------Invalid Choice---------- \n---------Please Try Again---------\n");
		System.out.println("...........................");
}
}
}
}