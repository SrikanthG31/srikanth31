package programs.LogicalStatements;

import java.util.Scanner;

public class CalaculatorSC {

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	String yn = "";
	do{System.out.println("enter the number1 : ");
	int a= sc.nextInt();
	
	System.out.println("enter the number2");
	int b= sc.nextInt();
	
	
	System.out.println("enter the symbol (+-*/%):");
	String symbol = sc.next();
	
	
double result =0;
	switch (symbol) {
	case "+" ->{ System.out.println("the values are for addition :");
	result = a+b;
	}
	case "-" ->{ System.out.println("the values are for subtraction :");
	result = a-b;
	}
	case "*" ->{ System.out.println("the values are for  mutlipacation :");
	result = a*b;
	}
	case "/" ->{ System.out.println("the values are  for division:");
	result = a/b;
	}
	case "%" ->{ System.out.println("the values are for modulus  :");
	result = a%b;
	}
   default ->
	throw new IllegalArgumentException("Unexpected value: " + symbol);
	}
	System.out.println("result : "+result  );
	System.out.println("are willing do moe in yes if press y  or no  if press n plz!");
	yn = sc.next();
	}while(yn.equalsIgnoreCase("y"));
}
	}

