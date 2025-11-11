public class Guitar extends Data.Enum implements Payable {

    @Override
    public void play(int str) {
        System.out.println("This guitar plays rock, and use " + str + " string");
    }
}
