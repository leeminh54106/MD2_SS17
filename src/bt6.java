import java.util.Scanner;

public class bt6 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số a:");
        int num1 = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập số b:");
        int num2 = Integer.parseInt(sc.nextLine());
        if(num2 == 0){
            throw new Exception("khác 0");
        }else {
            int num3 = num1 / num2;
            System.out.println(num3);
        }

    }
}
