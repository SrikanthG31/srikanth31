package programs.constructors;

public class Minato {
    String nickname;
    int hokagenumber;
    {
    	System.out.println("instance called");
    }
    Minato() {
	System.out.println("no arg of parent ");
}
       Minato(String nickname, int hokagenumber) {
		
		this.nickname = nickname;
		this.hokagenumber = hokagenumber;
	}

	public static void main(String[] args) {
		Minato m = new Minato();
		Minato we = new Minato("yellow flash",4);
       
	}
	

}
class Naruto extends Minato{
	{
		System.out.println("instance block");
	}
	Naruto(){
		
	}

public static void main(String[] args) {
	System.out.println("main method started");
	Naruto a = new Naruto();	
	a.show();}

void show() {
	System.out.println("NickName : "+nickname);
	System.out.println("hokagenumber :"+hokagenumber);
}

}
