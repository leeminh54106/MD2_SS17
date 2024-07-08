import javax.crypto.spec.PSource;
import java.util.Scanner;

public class bt8 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số cần kểm tra:");
        int number = Integer.parseInt(sc.nextLine());
        try{
            isPrime(number);
            System.out.println(number +" là số nguyên tố");
        }catch (Exception e){
            throw new Exception(number +"không phải số nguyên  tố");
        }
    }
    public static boolean isPrime(int number) throws Exception {
        if(number < 2){
            throw new Exception(number + "Không phải số nguyên tố");
        }
        boolean isPrime = false;
        for(int i = 2; i <= Math.sqrt(number); i++){
            if(number % i == 0){
                isPrime = true;
                break;
            }
        }
        if(isPrime){
            throw new Exception(number + "không phải số nguyên tố");
        }else {
            return isPrime;
        }
    }
}
