package prog2;

public class Guest {
	
	private int guestID;
	private String name;
	private String vorname;
	private int zimmernummer;
	private int telefon;
	
	//hat zwei Adressen
	private Adresse privateAdresse;
	private Adresse businessAdresse;
	
	//Konstruktor
	
	public Guest(int guestID, String name, String vorname, int zimmernummer, int telefon) {
		
		this.guestID = guestID;
		this.name = name;
		this.vorname = vorname; 
		this.telefon = telefon;
		
	}
		
	
	//Methoden Getter und Setter
	
	public int getGuestID() {
		return guestID;
	}
	public void setGuestID(int guestID) {
		this.guestID = guestID;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getVorname() {
		return vorname;
	}
	public void setVorname(String vorname) {
		this.vorname = vorname;
	}
	public int getZimmernummer() {
		return zimmernummer;
	}
	public void setZimmernummer(int zimmernummer) {
		this.zimmernummer = zimmernummer;
	}
	public int getTelefon() {
		return telefon;
	}
	public void setTelefon(int telefon) {
		this.telefon = telefon;
	}

}
