package intro;

public class Masyvai {

    public static void main(String[] args) {
        int x = 100;
        int y = x;

        x = 200;
        System.out.println(y); // prints 100

        int[] m = {1, 2, 3};
        int [] m2 = m;

        m[0] = 10;
        System.out.println(m2[0]); //prints 10

        String s = "Jonas";
        String s2 = s;
        // String - nemutuojantis duomenu tipas

        System.out.println("s == s2 ? " + (s == s2)); // true

        s += "!";

        System.out.println("s == s2 ? " + (s == s2)); // false
        System.out.println("s == (s2 + '!') ? " + (s == (s2 + '!'))); // false
        System.out.println("(s.equals(s2 + '!') ? " + (s.equals(s2 + '!'))); // true
        // Java'oje su .equals, o ne == ar === tikrinama, ar reiksme atitinka

        System.out.println("s = " + s); // prints Jonas!
        System.out.println("s = " + s2); // prints Jonas
    }
}
