package programs;

import java.util.Scanner;

public class Methods7 {

     void main(String[] args) {
		  Scanner sc = new  Scanner(System.in);
	   System.out.println("main method started");
	   Methods7 e = new Methods7();
	  
	   
	   System.out.println("enter the side");
	   float side = sc.nextFloat();
	   float areaofsquare = e.areaSquare(side);
	   System.out.println("area of the square : "+areaofsquare);
	   
	   System.out.println("enter the height");
	   double height = sc.nextDouble();
	   System.out.println("enter the br");
	   double base = sc.nextDouble();
	   
	   
	   
	   double areaOfTriangle = areaTriangle(height, base);
	   System.out.println("arae of the triangle : " + areaOfTriangle);
	   
	   System.out.println("enter the length");
	   double length = sc.nextDouble();
	   System.out.println("enter the breath");
	   double breath = sc.nextDouble();
	   double areaOfRectangle = e.areaRectangle(length,breath);
	   System.out.println("arae of the triangle : " + areaOfRectangle);
	   System.out.println("enter the radius of the cricle :");
	   double radius =sc.nextDouble();
	   double criclearea = areaCricle(radius);
	   System.out.println("area of the cricle"+ criclearea);
	   System.out.println("priniciple");
	   double pinciple = sc.nextDouble();
	   System.out.println("rate");
	   double rate = sc.nextDouble();
	   System.out.println("time");
	   double time = sc.nextDouble();
	   double simpleinsert = simpleInsterst(pinciple, rate, time);
	   System.out.println("simpleinserst  : "+  simpleinsert);
	   
	   
	   
	    

	}
	 float areaSquare(float side) {
		float areasquare = side * side;
		return areasquare;
	}
	 double areaTriangle(double height,double base) {
		 double areatriangle = 0.5*base*height;
		 return areatriangle;
	 }
	 double areaRectangle(double length,double breath) {
		 double arearectangle = length*breath;
		 return arearectangle;
	 }
	 double areaCricle(double radius) {
		 double areacricle = Math.PI *radius*radius;
		 return areacricle;
	 }
     double simpleInsterst(double principle,double rate,double time) {
    	 double simpleinsterst = (principle+rate+time)/100;
    	 return simpleinsterst;
     }
	
}
