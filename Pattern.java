public class Pattern {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=2*i+1; j++) {
                System.out.print(i+1);
            }
            System.out.println();
        }
    }
}
