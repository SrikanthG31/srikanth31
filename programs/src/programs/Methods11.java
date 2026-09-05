package programs;

public class Methods11 {
	
	int add(int a ,int b) {
		int add = a*b;
		System.out.println("add : " + add );
		return   subtract(add, 2);
	}

	int subtract(int a,int b) {
		int subtract = a-b;
		System.out.println("subtract : "+ subtract);
		return multipy (subtract ,5) ;
		
		
	}
	static int multipy(int a ,int b) {
		int multipy = a*b;
		System.out.println("mulipy : " + multipy);
		return divison(multipy,7);
		
	}
	static int divison(int a,int b) {
		int divison = a/b;
		System.out.println("divison : "+ divison);
		return divison;
	}

	public static void main(String[] args) {
		Methods11 e = new Methods11();
		int finalresult = e.add(10, 20);
		
		System.out.println("finalresult "+finalresult);
		
		
         

	}
	
	

}
