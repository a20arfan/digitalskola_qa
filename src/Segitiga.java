public class Segitiga {
    public static void main(String[] args) throws Exception {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < i; j++) {
                if (i <= 5) {
                    System.out.print("* ");
                } else if (i+j < 10) {
                    System.out.print("* ");
                }
            }
            System.out.println("");
        }
    }
}
