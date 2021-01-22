package p05.intro;

public class Mokinys {
    String vardas;
    String pavarde;
    int klase;

    Mokinys(String vardas, String pavarde, int klase) {
        this.vardas = vardas;
        this.pavarde = pavarde;
        this.klase = klase;
    }

    public static void main(String[] args) {

        Mokinys mokinys1 = new Mokinys("Ana", "Kukaite", 4);
        Mokinys mokinys2 = new Mokinys("John", "Doe", 5);
        Mokinys mokinys3 = new Mokinys("Pet", "West", 6);
        Mokinys mokinys4 = new Mokinys("Jane", "Doe", 7);
        Mokinys mokinys5 = new Mokinys("Tom", "White", 8);

        System.out.println(mokinys2.vardas);
    }
}
