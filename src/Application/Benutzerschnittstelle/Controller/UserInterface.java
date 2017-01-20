package Application.Benutzerschnittstelle.Controller;

import Application.Anwendung.Model.Model;
import Application.Benutzerschnittstelle.Controller.UCController.UCControllerInit;
import Application.Benutzerschnittstelle.Controller.UCController.UCControllerSpielzugDurchführen;
import Application.Benutzerschnittstelle.View.View;

public class UserInterface {

	private Model model = new Model();
	private View view = new View(model);
	private UCControllerInit ucControllerInit = new UCControllerInit(model, view);
	private UCControllerSpielzugDurchführen ucControllerSpielzugDurchführen = new UCControllerSpielzugDurchführen(model, view);
	private UIZustand uiZustand = UIZustand.INIT;
	//private UCControllerWissensfrage ucControllerWissensfrage = new UCControllerWissensfrage(model, view);
	//private UCControllerGewinnerkührung ucControllerGewinnerkührung = new UCControllerGewinnerkührung(model, view);

	public static void main(String[] args) {
		UserInterface ui = new UserInterface();
		ui.spielschleife();
	}

	private void spielschleife() {

		ucControllerInit.initialisieren();

		while (true) {

			ucControllerSpielzugDurchführen.würfeln();
			ucControllerSpielzugDurchführen.ziehen();


		}
	}


	enum UIZustand {
		INIT,
		WÜRFELN,
		ZIEHEN
	}
}