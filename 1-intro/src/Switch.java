public class Switch {
    public static void main(String[] args) {
//        int x = (int) Math.round(Math.random() * 10); // 0..10

        int x = 3;

        switch (x) {
            case 0:
                System.out.println("Nulis");
                break;

            case 1:
                System.out.println("Vienas");
                break;

            case 2:
                System.out.println("Du");
                break;

            default:
                System.out.println("?");
        }
    }
}
