import java.util.Scanner;

public class LucruObiecte {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);


        String unNume= keyboard.nextLine();


        // Obiectul Person
        Person[] people = new Person[4];
        Person p;
        p = new Person();

        p.nota = 10;
        p.nume = "Alexandra";
        people[0] = p;

        Person p1;
        p1 = new Person();

        p1.nota = 7;
        p1.nume = "Ionica";
        people[1] = p1;

        Person p2;
        p2 = new Person();

        p2.nota = 5;
        p2.nume = "Gogo";
        people[2] = p2;

        Person p3;
        p3 = new Person();

        p3.nota = 9;
        p3.nume = "Codrin";
        people[3] = p3;

        try {
            for (int i = 0; i < people.length; i++) {
                if (unNume.equalsIgnoreCase(people[i].nume)){
                    System.out.println(people[i].nota);
                    System.out.println(people[i].nume);
                    break;
                } else
                if (i == (people.length-1)){
                    System.out.println("Daznt egzist");
                }
            }
        } catch (NullPointerException e) {
            System.out.println("No ni ca a dat o eroare");
        }
    }
}
