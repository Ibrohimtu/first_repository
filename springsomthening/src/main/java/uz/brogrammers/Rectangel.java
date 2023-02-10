package uz.brogrammers;

public class Rectangel implements Shape {
    int a;
    int b;

    public Rectangel(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int area() {
        return a*b;
    }
}
