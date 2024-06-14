package provaIntermediaEs1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//dichiarazione variabili e metodi
		Scanner sc = new Scanner(System.in);
		ArrayList<String> buoniPropositi = new ArrayList<String>();
		buoniPropositi.add("Riuscire ad andare in palestra");
		buoniPropositi.add("Trovare lavoro come Java Developer");
		buoniPropositi.add("Smettere di fumare");
		buoniPropositi.add("Fare un viaggio in Madagascar");
		buoniPropositi.add("Sistemare il garage");
		int scelta;
		//inizio programma
		do {
			for (int i = 0; i < buoniPropositi.size(); i++) {//assegno indice a propositi
				System.out.println((i + 1)+") " + buoniPropositi.get(i));
			}
			System.out.println("Quale di questi propositi vuoi spuntare?");
			try {//verifica input scanner

				scelta = sc.nextInt() - 1;
				sc.nextLine();
				if (scelta <= buoniPropositi.size()) {//rimuovo dall'arraylist il proposito spuntato
					buoniPropositi.remove(scelta);

				} else
					System.err.println("Scelta non valida!");
			} catch (Exception e) {
				System.err.println("Scelta non valida!");
				sc.next();
			}
		} while (buoniPropositi.size() > 0);

		System.out.println("Bravo! Hai completato tutti i buoni propositi!!");
		sc.close();
	}

}
