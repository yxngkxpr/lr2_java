import java.util.Scanner;
import static java.lang.Math.pow;

public class program {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
        final double PI = 3.14;
        System.out.print("\t\tЗАДАНИЕ 1\n");
        System.out.print("Введите x: ");
        int x = in.nextInt();
        System.out.print("Введите у: ");
        int y = in.nextInt();
        double num1 = 2 * (1 + pow(x,2) + 3 * y) - 12 * pow(x,2) * y + PI;
        System.out.printf("Результат = %.2f\n", num1);
        System.out.print("\t\tЗАДАНИЕ 2\n");
    System.out.print("Введите внешний радиус кольца: ");
        double r1 = in.nextDouble();
    System.out.print("Введите внутренний радиус кольца: ");
        double r2 = in.nextDouble();
        double num2 = PI * (r1 - r2);
    System.out.printf("Площадь кольца = %.2f", num2);
    in.close();
}




}
