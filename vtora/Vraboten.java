package vtora;

public class Vraboten {
	private String ime;
	private int plata;
	private String prezime;
	

	public static void main(String[] args) {
		Vraboten object1 = new Vraboten();
		object1.ime = "Aleksandar";
		object1.prezime = "Spirovski";
		object1.plata = 15000;
		
		System.out.println("Imeto na vraboteniot e "+ object1.ime);
		System.out.println("Prezimeto na vraboteniot e "+ object1.prezime);
		System.out.println("Platata na vraboteniot e "+ object1.plata);
		
		

	}

}
