package programs.LogicalStatements;

public class Printnumbers {

	public static void main(String[] args) {
	printnumbers(1);

	}

static void printnumbers(int n) {
		if(n<=100) {
			System.out.println(n);
		  printnumbers(n +1);
		}
		
	}

}
