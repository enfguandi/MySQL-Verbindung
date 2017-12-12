import java.util.*;

public class eingabe {
	
	public static void eingabeDaten(zugangsdaten zd) {
		
		Scanner myScanner = new Scanner(System.in);
		String server;
		
		
		
		System.out.println("Bitte geben Sie ihre Serveradresse ein: ");
		zd.setServer(myScanner.nextLine());
		
		System.out.println("Bitte geben Sie ihren Port ein: ");
		zd.setPort(myScanner.nextLine());
		
		System.out.println("Bitte geben Sie ihre Datenbank ein: ");
		zd.setDatabase(myScanner.nextLine());
		
		System.out.println("Bitte geben Sie ihren Benutzer ein: ");
		zd.setUser(myScanner.nextLine());
		
		System.out.println("Bitte geben Sie das Passwort ein: ");
		zd.setPass(myScanner.nextLine());
		
	}
		
}
