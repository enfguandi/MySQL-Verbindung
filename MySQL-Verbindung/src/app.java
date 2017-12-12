
public class app {

	public static void main(String[] args) {
		
		System.out.println("Willkommen bei der MySQL Trianingsapp :)");
		
		zugangsdaten zd = new zugangsdaten();
		ctm connection = new ctm();
		
		eingabe.eingabeDaten(zd);
		connection.ConnectToMysql(zd.getServer(), zd.getPort(), zd.getDatabase(), zd.getUser(), zd.getPass());
		
		
			
	}

}
