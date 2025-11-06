public class Employee {

    String name;
    double salary;

    public void work() {
        System.out.println("This is " + name + ". His salary is " + salary);
    }
}


class Manager extends Employee {

}

class Developer extends Employee {

}