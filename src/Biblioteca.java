import java.util.Objects;
import java.util.Scanner;

public class Biblioteca {
    Scanner keyboard = new Scanner(System.in);
    Joc[] jocuri = new Joc[20];
    String nume;


    void addGame(Joc j) {
        boolean full = false;

        if (j.getTipDeJoc() == null) {
            System.out.println("Game does not meet minimum standard requirements to be posted.");
            j.setNumeJoc("DeleteThis");
            removeWrong("DeleteThis");
        } else {
            for (int i = 0; i < jocuri.length; i++) {
                if (jocuri[i] == null) {
                    jocuri[i] = j;
                    break;
                }
            }
            if (jocuri[jocuri.length - 1] != null) {
                System.out.println("Game library exceeds capacity. Building new library...");
                full = true;
            }

            if (full) {
                Joc[] temp = new Joc[jocuri.length * 2];
                jocuri = temp;
            }

        }
    }

    void removeWrong(String gTR) {
        for (int i = 0; i < jocuri.length; i++) {
            if ((jocuri[i].getNumeJoc()).equals(gTR)) {
                jocuri[i] = null;


                for (int j = 0; j < jocuri.length; j++) {
                    if (jocuri[j] == null) {
                        jocuri[j] = jocuri[j + 1];
                    }
                }

                break;

            }
        }
    }

    void removeGame(String enterName) {
        for (int i = 0; i < jocuri.length; i++) {
            if ((jocuri[i].getNumeJoc()).equals(enterName)) {
                jocuri[i] = null;


                for (int j = 0; j < jocuri.length; j++) {
                    if (jocuri[j] == null) {
                        jocuri[j] = jocuri[j + 1];
                    }
                }

                break;

            }
        }
    }
}
