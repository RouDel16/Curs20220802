import java.util.Scanner;


public class TemeTest {

        public static void main(String[] args) {
// "Robotul" de concatenare

            String s = concatenare();
            System.out.println(s);
        }

        public static String concatenare() {
            Scanner keyboard = new Scanner(System.in);
            String T1 = keyboard.nextLine();
            String T2 = keyboard.nextLine();
            String T_Concat = T1+T2;
            return T_Concat;
        }
    }




