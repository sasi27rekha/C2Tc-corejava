package assignment;
import java.util.Scanner;
public class ManDetails2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
System.out.println("enter your name");
String name=s.nextLine();
System.out.println("enter your rollno");
int rollno=s.nextInt();
s.nextLine();
System.out.println("enter your grade");
String grade=s.nextLine();
System.out.println("enter your percentage");
int percentage =s.nextInt();

System.out.println( name);
System.out.println( rollno);
System.out.println(grade);
System.out.println( percentage);
	}	

}
