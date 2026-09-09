package programs.LogicalStatements;

import java.util.Scanner;

public class SwitchPOC {

	private static final double totalvegbill = 0;

	public static void main(String[] args) {
	System.out.println("Welcome to v cube restaurant!!! : ");
	Scanner sc= new Scanner(System.in);

	double totalprice =0;
	String yn = "";

	do{
		System.out.println("enter a category :  ");
		String dishes = sc.next();

		switch (dishes) {
		
		case "veg"->{
			String vyn = "";
			double totalvegbill =0 ;
			do{		
				System.out.println("enter your veg dishes");
				String veg = sc.next();
				
				switch (veg) {
				case "starters" ->{
					
				System.out.println("gobi manchurian");
				double stprice = 120;
				totalvegbill =totalvegbill + stprice;
				}
		        case "butterpaneer" -> {
		            System.out.println("Butter Paneer");
		            double bpprice = 220;
		            totalvegbill =totalvegbill + bpprice;

		        }

		        case "paneerbiryani" -> {
		            System.out.println("Paneer Biryani");
		            double pbprice = 250;
		            totalvegbill =totalvegbill + pbprice;

		        }

		        case "kajubiryani" -> {
		            System.out.println("Kaju Biryani");
		            double kbprice = 280;
		            totalvegbill =totalvegbill + kbprice;

		        }

		        case "paneertikka" -> {
		            System.out.println("Paneer Tikka");
		            double ptprice = 200;
		            totalvegbill =totalvegbill + ptprice;

		        }
		        case "alooparatha" -> {
		            System.out.println("Aloo Paratha");
		            double apprice = 120;
		            totalvegbill =totalvegbill + apprice;

		        }

		        case "roti" -> {
		            System.out.println("Roti");
		            double rotiPrice = 40;
		            totalvegbill =totalvegbill + rotiPrice;

		        }
		  default -> System.out.println("entered item is not there ");

				}
				System.out.println("do u want to continue click y for yes or n for no ");
				vyn = sc.next();

		}while(vyn.equalsIgnoreCase("y"));
			
			System.out.println("totalbill for veg food : "+totalvegbill);
			totalprice = totalprice + totalvegbill;
		}
		case "nonveg"-> {

		  
			 String nvyn = "";
				double totalnonvegbill =0;	
		  
		        do {
		        	System.out.println("Enter your non veg dish:");
		    	    String nonveg = sc.next();
		        	switch (nonveg) {
		       
		       
		    	  case "chickenbiryani" -> {
			            System.out.println("Chicken Biryani");
			            double cbprice = 250;
			            totalnonvegbill = totalnonvegbill + cbprice;
			        }

			        case "muttonbiryani" -> {
			            System.out.println("Mutton Biryani");
			            double mbprice = 350;
			            totalnonvegbill = totalnonvegbill + mbprice;
			        }

			        case "chickentikka" -> {
			            System.out.println("Chicken Tikka");
			            double ctprice = 220;
			            totalnonvegbill = totalnonvegbill + ctprice;
			        }

			        case "chicken65" -> {
			            System.out.println("Chicken 65");
			            double c65price = 200;
			            totalnonvegbill = totalnonvegbill + c65price;
			        }

			        case "chickenlollipop" -> {
			            System.out.println("Chicken Lollipop");
			            double clprice = 230;
			            totalnonvegbill = totalnonvegbill + clprice;
			        }

			        case "muttoncurry" -> {
			            System.out.println("Mutton Curry");
			            double mcprice = 300;
			            totalnonvegbill = totalnonvegbill + mcprice;
			        }

			        case "fishfry" -> {
			            System.out.println("Fish Fry");
			            double ffprice = 180;
			            totalnonvegbill = totalnonvegbill + ffprice;
			            
			        }

			        default -> {
			            System.out.println("Invalid non veg dish");
			        }

		       		}
		        	System.out.println("do u want to continue click y for yes or n for no ");
					nvyn = sc.next();
		    }while(nvyn.equalsIgnoreCase("y"));
		        System.out.println("total nonveg bill : " +totalnonvegbill);
		    	totalprice = totalprice + totalnonvegbill;
		}
		case "deserts"->{
			String dyn = "";
			double totaldesertsbill =0;
			do {

			    System.out.println("Enter your dessert:");
			    String dessert = sc.next();

			    switch (dessert) {

			        case "gulabjamun" -> {
			            System.out.println("Gulab Jamun");
			            double gjprice = 100;
			            totaldesertsbill = totaldesertsbill + gjprice;
			        }

			        case "icecream" -> {
			            System.out.println("Ice Cream");
			            double icprice = 120;
			            totaldesertsbill = totaldesertsbill + icprice;
			        }

			        case "brownie" -> {
			            System.out.println("Brownie");
			            double bprice = 150;
			            totaldesertsbill = totaldesertsbill + bprice;
			        }

			        case "rasmalai" -> {
			            System.out.println("Rasmalai");
			            double rprice = 130;
			            totaldesertsbill = totaldesertsbill + rprice;
			        }

			        case "kheer" -> {
			            System.out.println("Kheer");
			            double kprice = 100;
			            totaldesertsbill = totaldesertsbill + kprice;
			        }

			        default -> {
			            System.out.println("Invalid dessert");
			        }
			    }

			    System.out.println("Do you want to continue? (y/n)");
			    dyn = sc.next();

			} while (dyn.equalsIgnoreCase("y"));

			System.out.println("Total dessert bill : " + totaldesertsbill);
			totalprice = totalprice + totaldesertsbill;
			}
			case "cooldrinks"->{
				String cyn ="";
				double totalcooldrinkbill=0;
				do {

				    System.out.println("Enter your cool drink:");
				    String cooldrink = sc.next();

				    switch (cooldrink) {

				        case "coke" -> {
				            System.out.println("Coke");
				            double cokeprice = 60;
				            totalcooldrinkbill = totalcooldrinkbill + cokeprice;
				        }

				        case "pepsi" -> {
				            System.out.println("Pepsi");
				            double pepsiprice = 60;
				            totalcooldrinkbill = totalcooldrinkbill + pepsiprice;
				        }

				        case "sprite" -> {
				            System.out.println("Sprite");
				            double spriteprice = 60;
				            totalcooldrinkbill = totalcooldrinkbill + spriteprice;
				        }

				        case "fanta" -> {
				            System.out.println("Fanta");
				            double fantaprice = 60;
				            totalcooldrinkbill = totalcooldrinkbill + fantaprice;
				        }

				        case "maaza" -> {
				            System.out.println("Maaza");
				            double maazaprice = 70;
				            totalcooldrinkbill = totalcooldrinkbill + maazaprice;
				        }

				        default -> {
				            System.out.println("Invalid cool drink");
				        }
				    }

				    System.out.println("Do you want to continue? (y/n)");
				    cyn = sc.next();

				} while (cyn.equalsIgnoreCase("y"));

				System.out.println("Total cool drink bill : " + totalcooldrinkbill);
				totalprice = totalprice + totalcooldrinkbill;
				
				
			}
			 default -> 
		            System.out.println("Invalid category plz enter vaild categroy !1");
		        
			
			}
		
		
	
			 
		 System.out.println("Do you want to continue with category ? (y/n)");	
			yn = sc.next();
	}while(yn.equalsIgnoreCase("y"));
	 
	 System.out.println("total price : " +totalprice);
	 System.out.println("have a nice day!!!! visit again!!");
	
	}

}
