import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class bt4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi:");
        String line = sc.nextLine();

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < line.length(); i++) {
            try {
                list.add(Character.getNumericValue(line.charAt(i)));
            }catch (NullPointerException e){
                list.add(0);
            }
        }
        System.out.println(list);
    }
}
