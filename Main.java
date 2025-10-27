
public class Main {
    public static void main(String[] args) {

        Car bmw = new Car();
        bmw.model = "BMW M5";
        bmw.year = "2006";

        Car nissan = new Car();
        nissan.model = "Nissan Almera";
        nissan.year = "2010";

        bmw.makeBeBe("BMW M6", "2010");
        nissan.makeBeBe("Nissan 350Z", "2025");
    }
}





