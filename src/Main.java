public class Main {
    public static void main(String[] args) {

        for (int i = 0; i < 31; i++) {
            System.out.println(i);
        }
        for (int i = 31; i >= 0; i--) {
            System.out.println(i);
        }
        for (int i = 0; i <= 18; i = i + 3) {
            System.out.println(i);
        }
        for (int i = 10; i >= 0; i = i - 2) {
            System.out.println(i);
        }
        for (int row = 1; row <= 5; row++) {
            for (int col = row; col <= 5; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 1; j++) {
                System.out.println("*****");
            }
        }
        for (int i = 1; i <=2; i++) {
            System.out.println("******************");
        }
        for (int i = 1; i <=2; i++) {
            System.out.println("       ****       ");
        }
        for (int i = 1; i <=2; i++) {
            System.out.println("***    ****");
        }
        for (int i =1; i <=2; i++) {
            System.out.println("***********");
        }
    }
}