import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        float summ;
        int monthCount;
        float total = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите суммы вклада: ");
        summ = scanner.nextFloat();

        System.out.println("Введите кол-во месяцев: ");
        monthCount = scanner.nextInt();

        for (int i = 0; i < monthCount; i++) {
            total += summ * 0.07;
        }
        total += summ;
        System.out.println("Ваш вклад после " + monthCount + " месяцев будет равен " + total);

        total = 0;
        int monthCountNew = monthCount;
        while (monthCount > 0) {
            monthCount--;
            total += summ * 0.07;
        }
        total += summ;
        System.out.println("Ваш вклад после " + monthCountNew + " месяцев будет равен " + total);

        scanner.close();
    }
}





