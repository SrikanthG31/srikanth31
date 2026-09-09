package programs.LogicalStatements;

import java.util.Scanner;

public class AgeLs {



	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your age : ");
		 int age =sc.nextInt();
		 
		 if(age>100 || age<0) {
			 System.err.println("enter vaild age");
		 }
		 else if(age>=60 ) {
			System.out.println("your are a oldman");
			
		}else if(age>=35){
			System.out.println("your are middle aged man");
		}else if(age>=20) {
			System.out.println("your are youth");
		}
sc.close();
	}

 

}
