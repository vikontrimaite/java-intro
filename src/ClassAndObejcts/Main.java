package ClassAndObejcts;

public class Main {

    public static void main(String[] args) {

        // sukuriamas masyvas Mokinys[] ir iskart visi mokiniai vienoje vietoje
        Mokinys[] mokiniai = new Mokinys[] {
                new Mokinys("Ana", "Anaite", 4),
                new Mokinys("Jonas", "Jonaitis", 7),
                new Mokinys("Tomas", "Tomutis"),
                new Mokinys("Majus", "Majaitis", 8),
                new Mokinys("Kostas", "Jonaitis", 7)
        };

        System.out.println("Visu mokiniu sarasas:");
        print(mokiniai);

        // sulygiuoti mokinius pagal klase nuo maziausios iki didziausios, o jeigu klases sutampa - lygiuoja pagal varda
        // mokiniai.length - 1 reiskia, jog skaiciuoja iki paskutinio, nes pradeda skaiciuoti nuo 0
        for (int i = 0; i < mokiniai.length - 1; i++) {
            for (int j = i + 1; j < mokiniai.length; j++) {
                if (compare(mokiniai[i], mokiniai[j]) > 0) {
                    // sukeisti mokinius vietomis masyve, taigi pakeisti i mokini ir j mokiniu vietomis masyve
                    // temp reiskia temporary
                    Mokinys temp = mokiniai[i];
                    mokiniai[i] = mokiniai[j];
                    mokiniai[j] = temp;
                }
            }
        }

        // isspausdinami visi mokiniai (po main aprasytas metodas)
        System.out.println("\nMokiniu sarasas sulygiuotas pagal klase:");
        print(mokiniai);
    }

    // sukuriamas metodas (po main metodo!) isspausdinti visus mokinius (sukuriamas metodas, kad nereiketu vel spausdinant mokinius daryti copy paste
    static void print (Mokinys[] mokiniai) {
        for (Mokinys m : mokiniai) {
            System.out.println(m.getVardas() + " " + m.getPavarde() + " mokosi " + m.getKlase() + " klaseje.");
        }
    }

    static int compare (Mokinys m1, Mokinys m2) {
        if (m1.getKlase() < m2.getKlase()) return -1;
        if (m1.getKlase() > m2.getKlase()) return 1;
        // o jeigu klases lygios lygiuoti pagal varda
        return m1.getVardas().compareTo(m2.getVardas());
    }
}
