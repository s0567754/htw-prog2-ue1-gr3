package prog2;

public class Adresse {
	
	//Attribute
	//Instanzvariable
	
	private String strasse;
	private String hausNr;
	private int postleitzahl;
	
	//Konstruktor
	//Konstruktor befüllen 
	
	
	public Adresse(String strasse, String hausNr, int postleitzahl) {
		this.strasse = strasse;
		this.hausNr = hausNr;
		this.postleitzahl = postleitzahl;
		
	}
	


	//Methode Getter und Setter
	
	public String getStrasse() {
		return strasse;
	}
	public void setStrasse(String strasse) {
		this.strasse = strasse;
	}

	public int getPostleitzahl() {
		return postleitzahl;
	}

	public void setPostleitzahl(int postleitzahl) {
		this.postleitzahl = postleitzahl;
	}
	
	public String getHausNr() {
		return hausNr;
	}
	public void setHausNr(String hausNr) {
		this.hausNr = hausNr;
	}

	

	
	

}
