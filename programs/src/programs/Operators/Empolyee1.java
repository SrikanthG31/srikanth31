package programs.Operators;

import java.util.Scanner;

public class Empolyee1 {
 
  
  static double addsum;
  static double subsum;
  int a;
   int b;
  
	public static void main(String[] args) {
		Empolyee1 r  = new Empolyee1();
		Scanner sc = new Scanner(System.in);
		System.out.println("a : ");
		r. a =sc.nextInt();
		System.out.println("b :");
		r.b =sc.nextInt();
       addsum= r.add();
       subsum = r.sub();
		System.out.println("add : " + addsum);
		System.out.println("sub : " + subsum);
		sc.close();
	}
	double add () {
		double sum = a + b;
		return sum;
	}
	double sub () {
		double sum = a - b;
		return sum;
	}

}
