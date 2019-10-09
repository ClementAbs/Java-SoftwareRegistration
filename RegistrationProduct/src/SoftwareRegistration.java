
public class SoftwareRegistration {
	
	/*		[Accesseurs]
	 * 		getters : acc�s � un attribtut (lecture)
	 * 		setters : modification d'un attribut (�criture)
	 */

	
	public SoftwareRegistration(int expiration) {
		
		
		
		if(mNumberOfRegistrations > 0) {
		
		this.mExpirationYear = expiration;
		mNumberOfRegistrations--;
		
		System.out.println("Logiciel valide (expiration en : "+this.mExpirationYear+")");
		System.out.println("Enregistrements restants : "+SoftwareRegistration.mNumberOfRegistrations);
		}
		
		else {
			
			System.out.println("Maximum de validation effectu�es !");
		}
	}
	
	
	
	public int getExpirationYear(){
		
		return this.mExpirationYear;
	}
	
	public static int getNumberOfRegistrations() {
		 
		return mNumberOfRegistrations;
	}
	
	
	
	private static int mNumberOfRegistrations = 2;
	private int mExpirationYear;

	
	
}
