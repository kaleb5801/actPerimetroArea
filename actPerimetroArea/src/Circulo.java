public class Circulo implements Shape {
    public static double PI = 3.141592;
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double getArea() {
        return  PI* radio *radio;
    }

    @Override
    public double getPerimeter() {
        return PI* radio *2;
    }

}
