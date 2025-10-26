
class Computer {

    public String name;
    static int cost;
    public String completeness;

    public int changeCost (int difference) {
        int newCost = cost + difference;
        return newCost;
    }
}

public class Main {
    public static void main (String[] args) {

        Computer computer = new Computer();
        computer.name = "gaming PC";
        computer.completeness = "Full";
        Computer.cost = 5000;

        int newCost = computer.changeCost(1000);

        System.out.println("I found the present for you. " +
                "It,s " + computer.name + ". Yesterday, it was cost " +
                Computer.cost + ". But today, this price is " + newCost);

    }
}





