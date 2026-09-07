package programs.constructors;

public class Copyconstructors1 {
 String director;
 String banner;
 String hero;
 String heroine;
 double buget;
	
	
	
	
	 Copyconstructors1(String director, String banner) {
	
	this.director = director;
	this.banner = banner;
	
}
	 Copyconstructors1(Copyconstructors1 d,String hero,String heroine,double buget){
		 this.director = d.director;
		 this.banner = d.banner;
		 this.hero = hero;
		 this.heroine = heroine;
		 this.buget = buget;
	 }


	public static void main(String[] args) {
		
	Copyconstructors1 d = new Copyconstructors1("atlee","sunpictures");
d.show();
Copyconstructors1 d1 = new Copyconstructors1(d, "allu arjun"," depp", 60000000);
d1.show();
	}
	void show() {
		System.out.println("director : "+director);
		System.out.println("banner : " + banner);
		System.out.println("hero : " + hero);
		System.out.println("heroine : "+heroine);
		System.out.println("buget : " + buget);
	}

}
