import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {


        //1. Afisare matrice "dragut"
        int[][] v = {{3, 4, 7, 8}, {10, 12, 14, 20}, {2, 3, 3, 4}, {12, 3, 34, 4}};
        for (int i = 0; i < v.length; i++) {
            for (int j = 0; j < v[i].length; j++) {
                if (j < (v[i].length - 1)) {
                    System.out.print(v[i][j] + " ");
                } else {
                    System.out.println(v[i][j] + " ");
                }
            }
        }



 /*       //2.1. Afisare diagonala principala
        int[][] v = {{3, 4, 7, 8}, {10, 12, 14, 20}, {2, 3, 3, 4}, {12, 3, 34, 4}};
        for (int i = 0; i < v.length; i++) {
            for (int j = 0; j < v[i].length; j++) {
                if (i == j) {
                    System.out.println(v[i][j]);
                }
            }

        }*/

 /*       //2.2. Afisare diagonala secundara
        int[][] v = {{3, 4, 7, 8}, {10, 12, 14, 20}, {2, 3, 3, 4}, {12, 3, 34, 4}};
        for (int i = 0; i < v.length; i++) {
            for (int j = (v[i].length-1); j >= 0; j--) {
                if ((i + j) == (v.length - 1)) {
                    System.out.println(v[i][j]);
                }


            }

        } */

  /*      //3. Afisare elemente deasupra diagonalei principale
        int[][] v = {{3, 4, 7, 8}, {10, 12, 14, 20}, {2, 3, 3, 4}, {12, 3, 34, 4}};
        for (int i = 0; i < v.length; i++) {
            for (int j = 0; j < v[i].length; j++) {
                if (j == (i + 1)) {
                    System.out.println(v[i][j]);
                }
            }
        } */

 /*       //4. Afisare elemente de sub diagonala principala
        int[][] v = {{3, 4, 7, 8}, {10, 12, 14, 20}, {2, 3, 3, 4}, {12, 3, 34, 4}};
        for (int i = 0; i < v.length; i++) {
            for (int j = 0; j < v[i].length; j++) {
                if (j == (i -1)) {
                    System.out.println(v[i][j]);
                }
            }
        } */

    }
}
