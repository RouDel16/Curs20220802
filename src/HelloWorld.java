import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);


        int nume = 4 + 5;
        String altnume = "Ionut";

        boolean b = true;

        System.out.println(4+5);
        System.out.println(nume);
        //             0  1  2  3
        int [] note = {4, 10, 4 ,8};
        System.out.println(note[0]); //primul element
        System.out.println(note[3]);
        System.out.println(note[0] + note[3] );

        //  (3 +5 ) + 8 ===> rezultat -- tip

        if (b) {
            System.out.println("A intrat aici");

        }
        System.out.println("Introdu un numar");
        int myInt = keyboard.nextInt();
        System.out.println("Ai introdus numarul " + myInt);

    }

}

