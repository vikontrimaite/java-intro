package ClassAndObejcts;

public class Zmogus {
    private String vardas;
    private String pavarde;
    private boolean hasShoes;

    public Zmogus(String vardas, String pavarde) {
        setVardas(vardas);
        setPavarde(pavarde);
    }

    public String getVardas() {
        return vardas;
    }

    public void setVardas(String vardas) {
        this.vardas = vardas;
    }

    public String getPavarde() {
        return pavarde;
    }

    public void setPavarde(String pavarde) {
        this.pavarde = pavarde;
    }

    // su boolean type get'eris prasideda is, o ne get
    public boolean isHasShoes() {
        return hasShoes;
    }

    public void setHasShoes(boolean hasShoes) {
        this.hasShoes = hasShoes;
    }

    public static void main(String[] args) {
        Zmogus zmogus1 = new Zmogus("John", "Doe");
        Zmogus zmogus2 = new Zmogus("Maria", "White");
        Zmogus zmogus3 = new Zmogus("Jane", "Blue");

        System.out.println("Pirmo zmogaus vardas yra " + zmogus1.getVardas() + ", o pavarde - " + zmogus1.getPavarde());
        System.out.println("Antro zmogaus vardas yra " + zmogus2.getVardas() + ", o pavarde - " + zmogus2.getPavarde());
        System.out.println("Trecio zmogaus vardas yra " + zmogus3.getVardas() + ", o pavarde - " + zmogus3.getPavarde());


    }
}
