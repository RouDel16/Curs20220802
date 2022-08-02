public class TestIncrements {
    public static void main(String[] args){
        int i = 0;
        while (i < 10){
            if (i % 2 == 0){                //Conditia din if verifica daca restul impartirii valorii lui i la 2 este 0 (daca este divizibil cu 2)
                System.out.println(i);      //Daca conditia este "TRUE" (este divizibil cu 2), atunci linia asta va afisa valoarea lui i
            }                               //Conditia "if" este prinsa in bucla "while" deci se va repeta la fiecare iteratie a buclei.
            i = i + 1;                      // Identificatorului "i" i se atribuie o noua valoare (i+1).
        }                                   // Se reia bucla.
    }
}
