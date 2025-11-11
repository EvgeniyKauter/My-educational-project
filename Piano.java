public class Piano extends Data.Enum implements Payable {

    @Override
    public void play(int str) {
        System.out.println("This piano plays classic, and use " + str + " string");
    }
}
