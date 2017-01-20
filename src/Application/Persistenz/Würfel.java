package Application.Persistenz;

import java.util.Random;

public class Würfel {
	private int zahl;

	public void ermittleNeuenWert() {
		zahl = new Random().nextInt(6) + 1;
	}

	public int getZahl() {
		return zahl;
	}
}
