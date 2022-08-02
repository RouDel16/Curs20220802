import java.util.Scanner;

public class Objectify {
    public static void main (String[] args){
        Scanner keyboard = new Scanner(System.in);

        Biblioteca b = new Biblioteca();
        Joc j = new Joc();

        j.numeJoc = "dota";
        j.pret = 299;
        j.date = "1223/33/33";
        j.tipDeJoc = "RPG";

        for (int i = 0; i < (b.jocuri.length-1) ; i++){
            b.addGame(j);
            System.out.println(b.jocuri[i].tipDeJoc + i);
        }

        Joc j1 = new Joc();
        j1.numeJoc = "Diablo 2";
        j1.pret = 189;
        j1.date = "2017/12/23";
        j1.tipDeJoc = "RTS";
        b.addGame(j1);


        System.out.println(b.jocuri[19].pret);
        b.remove(keyboard.next());
        System.out.println(b.jocuri[0].numeJoc);


        Biblioteca c = new Biblioteca();
        c.addGame(j);
    }
}
