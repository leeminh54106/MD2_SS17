import java.util.Scanner;

public class bt7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số a: ");
        int number1 = inputnumber(sc);
        System.out.println("Nhập số b: ");
        int number2 = inputnumber(sc);

        if (number1 > number2) {
            System.out.println("max = " + number1);
        } else if (number1 < number2) {
            System.out.println("max = " + number2);
        }
    }

    public static int inputnumber(Scanner sc) {
        do {
            try {
                return Integer.parseInt(sc.next());
            } catch (NumberFormatException e) {
                System.err.println("phải là số nguyên!");
            }
        } while (true);
    }
}
