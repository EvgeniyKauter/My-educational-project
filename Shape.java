public abstract class Shape {

    abstract void draw();
}

class Circle extends Shape {

    void draw () {
        System.out.println("The circle is drawn");
    }
}

class Rectangle extends Shape {

    void draw () {
        System.out.println("The rectangle is drawn");
    }
}