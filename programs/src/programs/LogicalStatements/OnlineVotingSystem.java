package programs.LogicalStatements;


import java.util.Scanner;

public class OnlineVotingSystem {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter your age : ");
		int age = sc.nextInt();
		
		
		
		if(age >= 18) {
			System.out.println("your are eligible BY YOUR AGE  ");
	
		 
			
		}else {
			System.out.println("your arenot eligible");
		
		
		}System.out.println("enter your gender M/F");
		char gender = sc.next().charAt(0);
			
			if(gender !='M'&&gender !='F')	{
				
			System.out.println("could enter plz gender correct ");
			
			}else {
				System.out.println("your are eligible foe voting select it down ");
			
			System.out.println("enter your voterIdNO");
			int voterIDNO =sc.nextInt();
			System.out.println("slect your among the options : ");
			System.out.println("1 is ram ");
			System.out.println("2 is sam ");
			System.out.println("3 is raja");
			System.out.println("4 is uma ");
			System.out.println("enter your vote  : ");
			int vote = sc.nextInt();
		  switch (vote) {
		case 1 -> {System.out.println("your vote is captured for ram");}
		case 2 -> {System.out.println("your vote is captured for sam");}
		case 3-> {System.out.println("your vote is captured for raja");}
		case 4 ->{System.out.println("your vote is captured for uma");}
		
		default ->System.out.println("thanks for voting for nota");

			
		 
		}
		
		
	
		
			
			
			
			
			
			
}
		
		
		
	}



		
	}
