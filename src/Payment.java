/**
 * 
 */

/**
 * @author Ridhi Infotech
 *
 */
public class Payment {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//create a person object
		Person person = new Person();
		person.setFirstName("Victor");
		person.setLastName("Smith");
		person.setHourlyRate(20);
		
		System.out.println(person.toString());
		
		System.out.println(person.getPayment(40));

	}

}

