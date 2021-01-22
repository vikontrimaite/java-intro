package intro;

public class ForLoop {
    public static void main(String[] args) {

        // suskaiciuoti visus skaicius nuo 1 iki 100
        int suma = 0;
        for (int i = 1; i <= 100; ++i) {
            suma += i;
        }
        System.out.println("1+2+...100 = " + suma);

        // galima for uzrasyti ir be kazkurios dalies for cikla
        for(;;) {
            double x = Math.random();
            System.out.println(x);

            if (x > 0.9) break; // salyga, kada iseinama is ciklo
        }
    }
}
