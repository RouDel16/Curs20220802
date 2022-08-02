import java.util.Scanner;
public class Testing {
    public static void main (String[] args){
        Scanner keyboard = new Scanner(System.in);
        int style = keyboard.nextInt();
        int bribe = keyboard.nextInt();
        if (! ((style>=8) && (bribe>=5)) ){
            System.out.println("Lowlife.");
        } else {
            System.out.println("Mais good.");
        }

    }
}
