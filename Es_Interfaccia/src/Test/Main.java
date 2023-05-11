package Test;

public class Main {
	public static void main(String[] args) {
		Leone leone = new Leone();
		Gazella gazella = new Gazella();
		Pesce pesceg = new Pesce();
		Pesce pescep = new Pesce();
		
		gazella.allerta();
		leone.caccia();
		gazella.scappa();
		leone.mangia(gazella);
		System.out.println("---- Nel mentre nel mare ----");
		pescep.allerta();
		pesceg.caccia();
		pescep.scappa();
		pesceg.mangia(pescep);
		System.out.println("---- Il leone ha ancora fame ----");
		leone.caccia();
		leone.mangia(pesceg);
		
		
	}
	
}
