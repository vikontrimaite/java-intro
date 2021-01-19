public class Ternary {
    public static void main(String[] args) {

        int a = 100;
        String rez = "a yra " + (a < 100 ? "mažiau" : "daugiau") + " už šimtą ";
        System.out.println(rez); // prints "a yra daugiau už šimtą"

        System.out.println(a % 2 == 0 ? "lyginis" : 0); // prints "lyginis"
    }
}
