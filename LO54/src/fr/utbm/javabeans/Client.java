package fr.utbm.javabeans;

/**
 * The Class Client.
 */
public class Client {

	/** The id. */
	private int id;
	
	/** The lastname. */
	private String lastname;
	
	/** The firstname. */
	private String firstname;
	
	/** The address. */
	private String address;
	
	/** The phone. */
	private int phone;
	
	/** The email. */
	private String email;
	
	/** The course session id. */
	private int courseSessionId;
	
	/**
	 * Instantiates a new client.
	 */
	public Client() {
	}

	/**
	 * Instantiates a new client.
	 *
	 * @param id the id
	 * @param lastname the lastname
	 * @param firstname the firstname
	 * @param address the address
	 * @param phone the phone
	 * @param email the email
	 * @param courseSessionId the course session id
	 */
	public Client(int id, String lastname, String firstname, String address, int phone, String email,
			int courseSessionId) {
		super();
		this.id = id;
		this.lastname = lastname;
		this.firstname = firstname;
		this.address = address;
		this.phone = phone;
		this.email = email;
		this.courseSessionId = courseSessionId;
	}
	
	
}
