package controller;

public class SomaController {

	public SomaController() {
		super();
	}
	
	public int SomaNatural(int n) {
		//Condição de Parada
		if(n < 0) {
			return 0;
		}else {
			return n + SomaNatural(n - 1);
		}
	}

}
