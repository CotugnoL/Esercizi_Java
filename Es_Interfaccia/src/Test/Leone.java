package Test;

public class Leone implements PredatoreGrande{


	@Override
	public void mangia(PredaGrande x) {
		System.out.println("Il leone si è appena mangiato una preda grande,GNAM");
		
	}

	@Override
	public void mangia(PredaPiccola y) {
		System.out.println("Il leone si è appena mangiato una preda piccola,GNAM");
	}

	@Override
	public void caccia() {
		System.out.println("Il leone attacca");
		
	}

}
