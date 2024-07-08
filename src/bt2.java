import java.util.Arrays;
import java.util.Scanner;

public class bt2 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        System.out.println("nhập số lượng phần tử");
        int n = Integer.parseInt(sc.nextLine());
        if(n == 0){
            throw new Exception("array is empty");
        }else {
            for (int i = 0; i < n; i++) {
                System.out.println("Nhập số thứ " + (i+1));
                arr[i] = Integer.parseInt(sc.nextLine());
            }

        }

        int max = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("số lớn nhất là: " +max);
    }
}
