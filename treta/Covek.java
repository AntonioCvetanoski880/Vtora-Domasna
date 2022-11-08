package treta;

public class Covek {
	private String ime;
	private String prezime;
	private int maticenBroj;

	public static class Rabota {
	public static void main(String[] args) {
    Covek object1 = new Covek();
    object1.ime="Riste";
    object1.prezime="Risteski";
    object1.maticenBroj= 071099944002L;
    
    System.out.println("Imeto na covekot e: "+ object1.ime);
    System.out.println("Prezimeto na covekot e: "+ object1.prezime);
    System.out.println("Maticniot broj e: "+ object1.maticenBroj);
		

	}

}
}
