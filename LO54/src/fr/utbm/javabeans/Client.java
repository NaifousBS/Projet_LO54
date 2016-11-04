/**
 * 
 */
package fr.utbm.javabeans;

/**
 * @author Souf
 *
 */
public class Client {

	// Nom client
	private String nom;
	
	// Prénom client
	private String prenom;
	
	// Adresse client
	private String adresse;
	
	// Téléphone client
	private int telephone;
	
	// Email client
	private String email;
	
	/**
	 * Constructeur par défaut
	 */
	public Client() {
	}

	/**
	 * @param nom
	 * @param prenom
	 * @param adresse
	 * @param telephone
	 * @param email
	 */
	public Client(String nom, String prenom, String adresse, int telephone, String email) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.telephone = telephone;
		this.email = email;
	}



	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}



	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}



	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}



	/**
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}



	/**
	 * @return the adresse
	 */
	public String getAdresse() {
		return adresse;
	}



	/**
	 * @param adresse the adresse to set
	 */
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}



	/**
	 * @return the telephone
	 */
	public int getTelephone() {
		return telephone;
	}



	/**
	 * @param telephone the telephone to set
	 */
	public void setTelephone(int telephone) {
		this.telephone = telephone;
	}



	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}



	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
}
