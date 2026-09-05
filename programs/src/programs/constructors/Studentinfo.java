package programs.constructors;

public class Studentinfo {
	int id;
	String name;
	String city = "hyderabad";
	
	Studentinfo(){
		id =100;
		name ="unknown";
    
     System.out.println("noargs type");
     
	}
	
	Studentinfo(int id ,String name){
		this.id = id;
		this.name = name;
		
	}
	
	
	public static void main(String[] args) {
	System.out.println("main method started");
	
	Studentinfo e = new Studentinfo();
	System.out.println("id :"+e.id);
	System.out.println("name : "+ e.name);
	System.out.println("city : "+ e.city);
	
	
	
	Studentinfo r = new Studentinfo();
	System.out.println("id :"+r.id);
	System.out.println("name : " + r.name);
	System.out.println("city : " + r.city);
	
	
	Studentinfo t = new Studentinfo(101,"sri");
	System.out.println("id : "+t.id);
	System.out.println("name : "+ t.name);
	
	
}}

