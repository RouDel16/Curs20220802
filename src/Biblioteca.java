import java.util.Scanner;

public class Biblioteca {
Scanner keyboard = new Scanner(System.in);
    Joc[] jocuri = new Joc[20];
    String nume;





    void addGame(Joc j){

        jocuri[0]=j;
        for (int i = 0; i < jocuri.length; i++) {
            if (jocuri[i] == null) {
                jocuri[i] = j;
                break;
            }
        }
    }

    void remove(String numeJoc){
        String gameToRemove = keyboard.next();
        for (int i = 0; i < jocuri.length; i++) {
            if (jocuri[i].numeJoc == gameToRemove){
                remove(String.valueOf(jocuri[i]));
                break;

            };
        }
    }
}
