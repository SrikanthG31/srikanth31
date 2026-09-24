package programs.LogicalStatements;

import java.util.Scanner;

public class Electricity {

	public static void main(String[] args) {
	Scanner sc = new  Scanner(System.in);
	System.out.println(" Enter type of your connection : ");
     String connection = sc.next();
      switch (connection) {
	case"domestic" -> {
		System.out.println(" Enter how many units  : ");
    int  units = sc.nextInt();
    int totalbill = 0;
    int totaldbill;
    int ratesperunit;
    
		if(units<=300) {
			ratesperunit =2;
			totaldbill = units*ratesperunit;
		
		}else {
			ratesperunit = 3;
			totaldbill = units*ratesperunit;
			
		}
		totalbill = totalbill + totaldbill;
		System.out.println("connection : " + connection);
		System.out.println("compumated " + units);
		System.out.println("ratesper unts" + ratesperunit);
		
		System.out.println("totalbill : "+ totalbill);
	}
	case"commercial" -> {
		System.out.println(" Enter how many units  : ");
    int  units = sc.nextInt();
    int totalbill = 0;
    int totalcbill;
    int ratesperunit;
		if(units<=300) {
			ratesperunit = 6;
			totalcbill = units*ratesperunit;
		
		}else {
			ratesperunit =8;
			totalcbill = units*ratesperunit;
			
		}
		totalbill = totalbill + totalcbill;
	
		System.out.println("connection : " + connection);
		System.out.println("compumated : " + units);
		System.out.println("ratesper unts : " + ratesperunit);
		
		System.out.println("totalbill : "+ totalbill);
	}
	
	default ->{
		System.out.println("could  u choose one of them ");
	}}

	
	
     
     
     
     
      }
     
     
     
     
     
     
     
     
	}
	
      
