package Access;

public class Vidurkis {

    public static void main(String[] args) {

        int[] trimestras = {8, 9, 10, 8};
        int suma = 0;
        double vidurkis;

        for (int skaicius : trimestras) {
            suma += skaicius;

        }
        vidurkis = (double) suma / trimestras.length;
        System.out.println(vidurkis);
    }
}
