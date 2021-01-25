package Access.Turnyras;

public class Turnyras {
    public static void main(String[] args) {
        Mokinys[] mokiniai = new Mokinys[] {
                new Mokinys("Jonas"),
                new Mokinys("Marytė"),
                new Mokinys("Ona"),
                new Mokinys("Juozas"),
                new Mokinys("Ilona"),
                new Mokinys("Marius"),
                new Mokinys("Petras")
        };

        for (Mokinys mokinys : mokiniai) {
            if (mokiniai.length >= 2) {
                break;
            }
            System.out.println(mokinys);
        }

    }
}
