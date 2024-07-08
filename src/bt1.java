import java.util.Scanner;

public class bt1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhâp số a:");
        int number1 = inputNumber(sc);
        System.out.println("nhập số b:");
        int number2 = inputNumber(sc);
        System.out.println("Số a + b = " + (number1 + number2));
    }

    public static int inputNumber(Scanner sc) {
        do {
            try{
                return Integer.parseInt(sc.nextLine());
            }catch (NumberFormatException e){
                System.err.println("phải là số");
            }
        }while (true);
    }
}
