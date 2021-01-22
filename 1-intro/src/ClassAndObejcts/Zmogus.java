package ClassAndObejcts;

public class Zmogus {
    String vardas;
    String pavarde;

    Zmogus(String vardas, String pavarde) {
        this.vardas = vardas;
        this.pavarde = pavarde;
    }

    public static void main(String[] args) {
        Zmogus zmogus1 = new Zmogus("John", "Doe");
        Zmogus zmogus2 = new Zmogus("Maria", "White");
        Zmogus zmogus3 = new Zmogus("Jane", "Blue");

        System.out.println("Pirmo zmogaus vardas yra " + zmogus1.vardas + ", o pavarde - " + zmogus1.pavarde);
        System.out.println("Antro zmogaus vardas yra " + zmogus2.vardas + ", o pavarde - " + zmogus2.pavarde);
        System.out.println("Trecio zmogaus vardas yra " + zmogus3.vardas + ", o pavarde - " + zmogus3.pavarde);
    }
}
