import java.util.Arrays;

public class Teme {
    public static void main(String[] args) {
        // Tema cu verificare caractere vectori
        char[] vectorA = {'a', 'b', 'c'};
        char[] vectorB = {'a', 'b', 'd'};
        char[] vectorC = {'a', 'b', 'c'};
        boolean a = Arrays.equals(vectorA, vectorB);
        boolean b = Arrays.equals(vectorA, vectorC);

        if (a) {
            System.out.println("Vectorii 1 si 2 sunt egali.");
        } else {
            System.out.println("Vectorii 1 si 2 nu sunt egali.");
        }

        if (b) {
            System.out.println("Vectorii 1 si 3 sunt egali.");
        } else {
            System.out.println("Vectorii 1 si 3 nu sunt egali.");
        }
    }
}
