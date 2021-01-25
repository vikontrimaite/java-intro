package ClassAndObejcts;

public class Mokinys {
    private String vardas;
    private String pavarde;
    private int klase;

    // sukuriamas constructor, kuris gamins visus mokinius
    // su zodeliu public sis constructor tampa pasiekiamu ir Main class'eje ar bet kur kitur
    public Mokinys (String vardas, String pavarde) {
        setVardas(vardas);
        setPavarde(pavarde);
        // cia default klase duos 1, jeigu nebus nurodyta klase
        this.klase = 1;
    }

    // cia dar vienas constructor, kuris bus kvieciamas, jai naujam instance bus duodama daugiau parametru, t.y. gaus ir klases kintamaji
    public Mokinys(String vardas, String pavarde, int klase) {
        this(vardas, pavarde);
        setKlase(klase);
    }

    public String getVardas() {
        return vardas;
    }

    public void setVardas(String vardas) {
        // jeigu vardo nera arba jis per trumpas - klaida aprasyta cia
        if (vardas == null || vardas.length() <= 1) {
            throw new IllegalArgumentException("Vardo nera arba vardas yra per trumpas");
        }
        this.vardas = vardas;
    }

    public String getPavarde() {
        return pavarde;
    }

    public void setPavarde(String pavarde) {
        if (pavarde == null || pavarde.length() <= 2 ) {
            throw new IllegalArgumentException("Pavardes nera arba pavarde yra per trumpa");
        }
        this.pavarde = pavarde;
    }

    public int getKlase() {
        return klase;
    }

    public void setKlase(int klase) {
        this.klase = klase;
    }

}
