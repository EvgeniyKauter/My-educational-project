import java.util.Random;

public class RandomString {

    String[] str;

    Random random = new Random();
    int randomIndex = random.nextInt(3);

    public void randomWord() {

        System.out.println(str[randomIndex]);
    }
}
