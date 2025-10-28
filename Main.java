import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String[] array = {"привет", "ПОКА", "гипербола"};

        System.out.println(array[0]);

        System.out.println(array[1].toLowerCase());

        for (int i = 0; i < array.length; i++) {
            if (array[i].charAt(1) == 'О') {
                System.out.println(array[i]);
                System.out.println(array[i].subSequence(0,3) + " " + array[i].subSequence(3, array[i].length()));
            }
        }
    }
}





