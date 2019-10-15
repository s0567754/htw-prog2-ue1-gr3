package prog2;

public class Hotel {
	
	//Attribute
	
	private String hotelname;
	private int telefonnummer;
	private int sterne;
	
	private Guest [] guests = new Guest [1000];
	
	

	//Konstruktor
	
	public Hotel() {
		
	}
	
	//Methode Getter und Setter

	public String getHotelname() {
		return hotelname;
	}
	public void setHotelname(String hotelname) {
		this.hotelname = hotelname;
	}
	public int getTelefonnummer() {
		return telefonnummer;
	}
	public void setTelefonnummer(int telefonnummer) {
		this.telefonnummer = telefonnummer;
	}
	
	public int getSterne() {
		return sterne;
	}
	public void setSterne(int sterne) {
		this.sterne = sterne;
	}
}

