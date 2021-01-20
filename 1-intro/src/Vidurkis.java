public class Vidurkis {
    public static void main(String[] args) {
        int[] a = {5, 6, 10, 15, 8, 4};
        int[] b = {8, 5, 3};

        int suma1= 0;
        for (int kintamasis : a) {
            // kintamasis is masyvo a (JS'e kintamasis of a)
            suma1 += kintamasis;
        }
        double vidurkis1 = (double) suma1 / a.length;
        // cia suma1 paverciame double tipu, kad butu galima skaiciuoti tinkamai
        // galima double paversti ir taip: 1.0 * suma1
        System.out.println("Masyvo a vidurkis yra: " + vidurkis1);

        int suma2 = 0;
        for (int kintamasis : b) {
            suma2 += kintamasis;
        }
        double vidurkis2 = (double) suma2 / b.length;
        System.out.println("Masyvo b vidurkis yra: " + vidurkis2);

        double vidurkiuSkirtumas = vidurkis1 - vidurkis2;
        System.out.println("Vidurkiu skirtumas yra: " + vidurkiuSkirtumas);
    }
}
