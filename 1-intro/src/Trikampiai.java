public class Trikampiai {
    public static void main(String[] args) {
        System.out.println("Trikampiai");

        // [][[ resikia masyvas masyve
        int[][] trikampiai = {{ 3, 4, 5}, {2, 10, 8}, {5, 6, 5}, {5, 5, 5}};

        for (int i = 0; i < trikampiai.length; i++) {
           int[] trikampis = trikampiai[i];

            System.out.print("Trikampio krastines: " + trikampis[0] + ", " + trikampis[1] + ", " + trikampis[ 2]);

            // tikriname, ar galime padaryti trikampi
            if (trikampis[0] < trikampis[1] + trikampis[2] && trikampis[1] < trikampis[0] + trikampis[2] && trikampis[2] < trikampis[0] + trikampis[1]) {
                System.out.print(". Trikampis galimas.");

                // taigi, jeigu galimas trikampis, reikia issiaiskinti, koks jis yra: lygiasonis, lygiakrastis, ivairiakrastis
               if (trikampis[0] == trikampis[1] && trikampis[1] == trikampis[2]) {
                   System.out.println(" Lygiakrastis.");
               } else if (trikampis[0] == trikampis[1] || trikampis[1] == trikampis[2] || trikampis[0] == trikampis[2]) {
                   System.out.println(" Lygiasonis.");
               } else {
                   System.out.println(" Ivairiakrastis.");
               }

            } else {
                System.out.println(". Trikampis negalimas.");
            }

            // paskaiciuojame plota
            double plotas = (trikampis[0] + trikampis[1] + trikampis[2]) / 2.0;
            System.out.print(", pusperimetris = " + plotas);
            double plotis = Math.sqrt(plotas * (plotas - trikampis[0]) * (plotas - trikampis[1]) * (plotas - trikampis[2]));
            plotis = Math.round(plotis * 1000.0) / 1000.0;
            System.out.println(", plotas = " + plotis);
        }
    }
}
