import java.util.Scanner;

public class Objectify {
    public static void main (String[] args){
        Scanner keyboard = new Scanner(System.in);
        int identifier;
        Biblioteca b = new Biblioteca();
        Joc j = new Joc();

        j.setNumeJoc("Dota");
        j.setPret(189);
        j.setDate("17/11/2001");
        j.setTipDeJoc("RPG");

        for (int i = 0; i <= 5; i++){
            b.addGame(j);
            System.out.println(b.jocuri[i].getTipDeJoc() + i);

        }
        Joc j1 = new Joc();
        j1.setNumeJoc("Diablo 2");
        j1.setPret(189);
        j1.setDate("23/12/1999");
        j1.setTipDeJoc("RTF");
        b.jocuri[6]=j;
        b.jocuri[8]=j;
        b.addGame(j1);





        Biblioteca c = new Biblioteca();
        c.addGame(j);
    }
}
