import java.nio.channels.Pipe;
import java.util.InvalidPropertiesFormatException;
import java.util.Scanner;

public class bt10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radius = 0;

        boolean check = true;
        while (check) {
            try {
                System.out.println("nhập vaào bán kính");
                radius = Double.parseDouble(sc.nextLine());
                if (radius <= 0) {
                    System.err.println("bánh kính không được <= 0");
                }else {
                    check = false;
                }
            } catch (NumberFormatException e) {
                System.err.println("không phải là số, vui lòng nhập lại.");
            }
        }
        double area = getArea(radius);
        System.out.println(area);


    }

    public static double getArea(double radius) {
        double area = Math.PI * radius * radius;
        return area;
    }
}
