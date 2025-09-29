package test_fonctionnel;

import personage.Gaulois;

public class TestGaulois {
	public static void main(String[] args) {
		Gaulois gaulois = new Gaulois("Asterix", 8);
		Gaulois gaulois1 = new Gaulois("Obelix", 16);

		gaulois.parler("Bonjour Obélix.");
		gaulois1.parler("Bonjour Astérix. Ca te dirais d'aller chasser des sangliers ?");
		gaulois.parler("Oui très bonne idée.");

	}

}
