public class Triangulo implements Shape {
    private double baseTriangulo;
    private double alturaTriangulo;
    private double perimeterTriangulo;

    public Triangulo(double baseTriangulo, double heightTriangulo) {
        this.baseTriangulo = baseTriangulo;
        this.alturaTriangulo = heightTriangulo;
    }

    @Override
    public double getArea() {
        return (baseTriangulo*alturaTriangulo)/2.0;
    }

    @Override
    public double getPerimeter() {
        return baseTriangulo*3;
    }

}
