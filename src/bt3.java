import java.util.Arrays;
import java.util.Scanner;

public class bt3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số lượng phần tử:");
        int n = Integer.parseInt(sc.nextLine());
        String [] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine();
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            try {
                sum += Integer.parseInt(arr[i]);
            }catch (NumberFormatException e) {
                System.err.println(arr[i] + "khoong phai so nguyen");
            }
        }
        System.out.println("tong =" +sum);

    }
}
