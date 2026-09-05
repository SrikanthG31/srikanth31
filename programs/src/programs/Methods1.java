package programs;
import java.util.Scanner;
public class Methods1 {

	public static void main(String[] args) {
		System.out.println("main statred");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("studentid : ");
		int id = sc.nextInt();
		
		System.out.println("studentname : ");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.println("enter your age :");
		int age = sc.nextInt();
		System.out.println("studentgrade : ");
		String  grades = sc.next();
		
		System.out.println("science marks");
		int  science = sc.nextInt();
	
		System.out.println("maths marks");
		int  maths = sc.nextInt();
		
		System.out.println("english marks");
	int English = sc.nextInt();
	System.out.println("student gender");
	char gender = sc.next().charAt(0);
	System.out.println("enter your moblie number");
	long mobile = sc.nextLong();
	System.out.println("address");
	sc.nextLine();
	String address = sc.nextLine();
	System.out.println("enter the email");
	String email = sc.next();
	

		getstudentid(id);
		getstudentname(name);
		getstudentgrade(grades);
		getstudentPassed(science, English, maths);
		getgenderStudent(gender);
		getstudentmarks(science, maths, English);
		getstudentpercentage(science, English, maths);
        getAverageMarks(science, English, maths);
        getstudentemail(email);
        getstudentaddress(address);
	}
	 static void getgenderStudent(char gen) {
		 System.out.println("student gender :"+ gen);
	 }
	static void getstudentid(int sid) {
		System.out.println("studentiddetails :");
		System.out.println("student id :" + sid );
	}
	static void getstudentname(String sname) {
	
		System.out.println("student Name : "+ sname);
		}
	static void getstudentgrade(String grades) {
		
		System.out.println("student grade : " + grades);
	}
	static void getstudentPassed(int science_marks,int english_marks,int maths_marks) {
		if(english_marks >=35 && science_marks>=35 && maths_marks >= 35) {
			System.out.println("student is passed");
		}else {
			System.out.println("student is failed");
		}}
		static void getstudentmarks(int science,int maths,int english) {
			
			System.out.println("student marks : " );
			System.out.println("science marks : "+science );
			System.out.println("maths marks : "+maths );
			System.out.println("english  marks : " + english );
			
		}
		static void getstudentpercentage(int science,int english,int maths) {
			
			double percentage = (science + maths+english)/3;
			System.out.println("percentage is "+percentage);}
		
		static void getAverageMarks(int science,int english,int maths) {
			double totalmarks = (science+ english+maths)/3.0;
			System.out.println("average Marks "+totalmarks);
		}
		static void getstudentemail(String email){
			System.out.println("email"+email);
	}
		static void getstudentaddress(String address) {
			System.out.println("address"+address);
		}

}
     
