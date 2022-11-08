package Cetvrta;

public class Avtomobil {
	private String marka;
	private String model;
	private int kmp;

	public static class Rabota {

	public static void main(String[] args) {
    Avtomobil object1=new Avtomobil();
	object1.marka = "Nissan";
	object1.model = "GTR";
	object1.kmp = 4534;
	
	System.out.println(object1.marka+" "+object1.model+" "+object1.kmp);
	Avtomobil object2 = new Avtomobil("Bugatti","Chiron",3333);
	System.out.println(object2.marka+" "+object2.model+" "+object2.kmp);

		

	}

}
}