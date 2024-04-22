package assignment;

public class student3 { 
	public static void main(String[] args) {
		student1 student =new student1();
	student2 commission =new student2();
	student.Student();
		commission.AcceptDetails_Employee("sasi","53 sk nagar",97925423,90000);
		double commisionAmount =commission.CalculateCommission();
		System.out.println("Commission amount:$"+commisionAmount);
		
	}

}
