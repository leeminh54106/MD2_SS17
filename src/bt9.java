import java.util.Scanner;

public class bt9 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào vị trí số fibonaci cần tìm:");
        int number = Integer.parseInt(sc.nextLine());

        if(number < 0){
            throw new Exception("vị trí phải là số nguyên dương!");
        }
        int firstNumber = 0;
        int secondNumber = 1;
        if(number == 1 || number == 2) {
            System.out.println(number - 1);
            return;
        }
        int count = 2;
        while (count <= number) {
            int temp = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = temp;
            count++;
            if(count == number) {
                System.out.println(temp);
                break;
            }
        }
    }
}
