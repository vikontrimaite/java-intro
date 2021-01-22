package intro;

public class MasyvasIrCiklas {
    public static void main(String[] args) {
        // kiek yra elementu, kurie prasideda raide 'A'
        String[] raidziuMasyvas = { "A", "A1", "B", "C", "A3" };
        int sk = 0;
        // for (int i = 0; i < s.length; i++) {
        //    String e = s[i];
        for (String element : raidziuMasyvas) {
            if (element.charAt(0) == 'A') sk++;
        }
        System.out.println("Viso zodziu prasidedanciu A raide yra " + sk);
    }

}
