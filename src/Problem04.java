import java.util.Scanner;

public class Problem04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter first num: ");
        int firstNum = scanner.nextInt();

        System.out.println("Enter second num: ");
        int secondNum = scanner.nextInt();

        int sum = firstNum + secondNum;
        int diff = firstNum - secondNum;
        int multiplying = firstNum * secondNum;
        int dividing = firstNum / secondNum;
        int remainder = firstNum % secondNum;

        System.out.println("Сумма = " + sum);
        System.out.println("Разница = " + diff);
        System.out.println("Умножение = " + multiplying);
        System.out.println("Деление = " + dividing);
        System.out.println("Остаток = " + remainder);



    }
}
