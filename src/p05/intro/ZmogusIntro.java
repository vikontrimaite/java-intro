package p05.intro;

import java.time.LocalDate;

public class ZmogusIntro {
    public static void main(String[] args) {
        // p05.intro.Zmogus:
            // int id
            // String firstName;
            // String lastName;
            // LocalDate birthday;

//        int[] id = {1, 2, 3};
//        String[] firstName = {"Dave", "Pet", "John"};
//        String[] lastName = {"Smith", "Brown", "White"};
//        LocalDate[] birthday = {null, null, null};

        Zmogus[] zmones = {null, null, null};
        System.out.println(zmones.length);

        Zmogus z1 = new Zmogus();
        z1.id = 1;
        z1.firstName = "John";
        z1.lastName = "Doe";
        z1.birthday = LocalDate.of(2000, 1, 20);
        zmones[0] = z1;

        Zmogus z2 = new Zmogus();
        z2.id = 1;
        z2.firstName = "Maria";
        z2.lastName = "Smith";
        z2.birthday = LocalDate.of(1654, 12, 6);
        zmones[1] = z2;

//        p05.intro.Zmogus z3 = new p05.intro.Zmogus();
//        z3.id = 1;
//        z3.firstName = "Dave";
//        z3.lastName = "Car";
//        z3.birthday = LocalDate.of(1977, 11, 6);
//        zmones[2] = z3;

        for (Zmogus z : zmones) {
            if (z != null) {
                System.out.println(z.firstName + " " + z.lastName + " gime " + z.birthday);
            } else {
                System.out.println("Nera info apie zmogu");
            }

        }
    }

}

class Zmogus {
    int id;
    String firstName;
    String lastName;
    LocalDate birthday;

}