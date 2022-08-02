public class Testing11 {
    public static void main(String[] args) {
 /*       Scanner keyboard = new Scanner(System.in);
        int j = 11;
        int target = 63;
        int[] values = new int[] {1, 4, 9, 16, 25, 36, 49, 63, 64, 81};
        for (int i=0; i<values.length; i++) {
            if (values[i] == target) {
                System.out.println("Value was found. Index value is " + i + ".");
                j = i;
                break;
            }
        }
        if (j==11){System.out.println("Value has not been found.");}*/

        char[] MyString = {'a', 'n', 'a'};
        char[] Nume = new char[MyString.length];

        for (int i = 0; i < Nume.length; i++) {
            Nume[i] = Character.toUpperCase(MyString[i]);
        }
        System.out.println(Nume);



    }

}







