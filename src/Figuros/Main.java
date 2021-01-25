package Figuros;

public class Main {
    public static void main(String[] args) {
        Apskritimas apskritimas = new Apskritimas();
        apskritimas.setR(10);
        apskritimas.setD(45);

        System.out.println("area = " + apskritimas.area());

        System.out.println(apskritimas);

        Apskritimas circle2 = new Apskritimas();
        circle2.setR(10);
        circle2.setD(90);

        System.out.println(apskritimas == circle2);
        System.out.println(apskritimas.equals(circle2));
    }
}

