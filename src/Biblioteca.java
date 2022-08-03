import java.util.Scanner;

public class Biblioteca {
    Scanner keyboard = new Scanner(System.in);
    Joc[] jocuri = new Joc[20];
    String nume;


    void addGame(Joc j) {
        String full = "False";
        for (int i = 0; i < jocuri.length; i++) {
            if (jocuri[i] == null) {
                jocuri[i] = j;
                break;
            } else if (jocuri[i] != null && jocuri[i] == jocuri[jocuri.length - 1]) {
                System.out.println("Game library exceeds capacity. Building new library...");
                full = "True";
            }
        }
        if (full.equals("True")) {
            Joc[] temp = new Joc[jocuri.length * 2];
            jocuri = temp;
        }

    }


    void remove(String gameToRemove) {
        gameToRemove = keyboard.next();
        for (int i = 0; i < jocuri.length; i++) {
            if (jocuri[i].getNumeJoc().equals(gameToRemove)) {
                jocuri[i] = null;
                try {
                    for (int j = 0; j < jocuri.length; j++) {
                        if (jocuri[j] == null) {
                            jocuri[j] = jocuri[j + 1];
                        }
                    }
                } catch (NullPointerException e) {
                    System.out.println("Index has multiple empty spaces. NPE caught.");
                }
                break;

            }
        }
    }
}
