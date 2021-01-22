package DaugybosLentele;

public class DaugybosLentele {
    public static void main(String[] args) {
        int a;
        int b;
        int sum;
        for (a = 1; a <= 10; ++a) {
            for (b = 1; b <= 10; ++b) {
                sum = a * b;
                System.out.println(a + " * " + b + " = " + sum);
            }
        }
        System.out.println();
    }
}
