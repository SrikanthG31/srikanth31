package programs.constructors;

public class contructor1 {

static int count =0;
contructor1(){
	
	count ++;
}
	public static void main(String[] args) {
	contructor1 s1 = new contructor1();
	contructor1 s2 = new contructor1();
	contructor1 s3 = new contructor1();
	contructor1 s4 = new contructor1();
	System.out.println("count : "  + count);

	}

}
