package Test;

public class Pesce implements PredaPiccola, PredatorePiccolo {

	@Override
	public void caccia() {
		System.out.println("Il pesce grande attacca");
	}

	@Override
	public void scappa() {
		System.out.println("Il pesce piccolo scappa");
	}

	@Override
	public void mangia(PredaPiccola x) {
		System.out.println("Il pesce può mangiare questa preda, GNAM");
		
	}

	@Override
	public void allerta() {
		System.out.println("Il pesce si allerta");
	}
	
	

}
