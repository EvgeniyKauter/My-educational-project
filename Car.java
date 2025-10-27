public class Car {

    String model;
    String year;

    public void makeBeBe (String model, String year) {
        this.model = model;
        this.year = year;

        System.out.println("Название автомобиля: " + this.model +
                            "\nГод выпуска: " + this.year);
    }
}
