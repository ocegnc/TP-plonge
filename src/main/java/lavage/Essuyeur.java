package lavage;

import java.util.Random;

class Essuyeur extends Thread {

	private final PileDAssiettes myStack;

	Essuyeur(PileDAssiettes s) {
		myStack = s;
	}

	public void run() {
		while (true) {
			try {
				// Prendre une assiette sur la pile
				Assiette assiette = myStack.pop();
				// L'essuyer
				System.out.print("Un essuyeur enlève " + assiette + " \n");
				sleep(500+new Random().nextInt(1501));
			} catch (InterruptedException ex) {
				break; // Sort du while, termine le Thread;
			}
		}
		//System.out.println("Essuyeur terminé");
	}
}