import java.util.Scanner;

public class Problem05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first num: ");
        double firstNum = scanner.nextDouble();

        System.out.print("Enter second num: ");
        double secondNum = scanner.nextDouble();

        double sum = firstNum + secondNum;
        double diff = firstNum - secondNum;
        double multiplying = firstNum * secondNum;
        double dividing = firstNum / secondNum;
        double remainder = firstNum % secondNum;

        System.out.println("Сумма = " + sum);
        System.out.println("Разница = " + diff);
        System.out.println("Умножение = " + multiplying);
        System.out.println("Деление = " + dividing);
        System.out.println("Остаток = " + remainder);
    }
}
