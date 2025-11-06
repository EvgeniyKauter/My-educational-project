import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Manager petya = new Manager();
        petya.name = "Петя";
        petya.salary = 100500.02;

        petya.work();

        Developer vasya = new Developer();
        vasya.name = "Вася";
        vasya.salary = 500100.03;

        vasya.work();

        Circle circle = new Circle();
        circle.draw();

        Rectangle rectangle = new Rectangle();
        rectangle.draw();

    }
}





