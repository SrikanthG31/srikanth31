package programs.constructors;

public class Empolyee1 {
  double sum;
  
	public static void main(String[] args) {
		Empolyee1 r  = new Empolyee1();
		double sum = r.add(5.5F, 9);
System.out.println("sum : "+ sum);
	}
	double add (float a,double b) {
		double sum = a + b;
		return sum;
	}

}
