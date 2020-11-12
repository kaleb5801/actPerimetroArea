import java.util.Scanner;

public class Menu {
    Scanner scan = new Scanner(System.in);

    int menu =0;
    double base;
    double altura;
    int op;

    private void ShowMenu(){
        System.out.println("Bienvenid@ Usuario!" +
                "\n Selecciona una Figura"+
                "\n 1- Círculo"+
                "\n 2- Cuadrado."+
                "\n 3- Triángulo"+
                "\n 4- Salir del programa");
    }

    private void pregunta(){
        System.out.print("Ingresa una opcion: ");
        menu = scan.nextInt();
    }


    public void ShowMenuSec() {
        ShowMenu();
            pregunta();
            switch (menu) {
                case 1:
                    division();
                    System.out.println("Círculo");
                    segundoMenu();
                    if (op == 1) {
                        opcionArea();
                        System.out.print("Ingrese el radio del círculo: ");
                        base = scan.nextDouble();
                        showAreaCirculo();
                    } else if (op == 2) {
                        opcionPerimeter();
                        System.out.print("Ingrese el radio del circulo: ");
                        base = scan.nextDouble();
                        showPerimeterCirculo();
                    } else if (op > 2) {
                        System.out.println("Ingrese una opcion correcta");
                    }
                    break;

                case 2:
                    division();
                    System.out.println("Cuadrado");
                    segundoMenu();
                    if (op == 1) {
                        opcionArea();
                        System.out.print("Ingrese el lado del cuadrado: ");
                        base = scan.nextDouble();
                        showAreaCuadrado();
                    } else if (op == 2) {
                        opcionPerimeter();
                        System.out.print("Ingrese el lado del cuadrado: ");
                        base = scan.nextDouble();
                        showPerimeterCuadrado();
                    } else if (op > 2) {
                        System.out.println("Ingrese una opcion correcta");
                    }
                    break;

                case 3:
                    division();
                    System.out.println("Triángulo");
                    segundoMenu();
                    if (op == 1) {
                        opcionArea();
                        System.out.print("Ingrese la base del triángulo: ");
                        base = scan.nextDouble();
                        System.out.print("Ingrese la altura del triángulo: ");
                        altura = scan.nextDouble();
                        showAreaTriangulo();
                    } else if (op == 2) {
                        opcionPerimeter();
                        System.out.print("Ingrese el lado del triángulo: ");
                        base = scan.nextDouble();
                        showPerimeterTriangulo();
                    } else if (op > 2) {
                        System.out.println("Ingrese una opcion correcta");
                    }
                    break;

                case 4:
                    break;

                default:
                    System.out.println("Ingrese una opcion correcta");
                    break;
            }
    }

    private void division(){
        System.out.println("------------------------------------------------------");
    }

    private void opcionArea(){
        System.out.println("Calcular área");
    }

    private void opcionPerimeter(){
        System.out.println("Calcular perímetro");
    }

    private void segundoMenu(){
        System.out.print("1-Calcular área " +
                "\n2-Calcular el perimetro ");
        op = scan.nextInt();
    }

    private void showAreaCirculo(){
        Circulo circulo = new Circulo(base);
        System.out.println("Área del círculo: "+circulo.getArea());
    }

    private void showPerimeterCirculo(){
        Circulo circulo = new Circulo(base);
        System.out.println("Perímetro del circulo: "+ circulo.getPerimeter());
    }

    private void showAreaCuadrado(){
        Cuadrado cuadrado = new Cuadrado(base);
        System.out.println("Área del cuadrado "+cuadrado.getArea());
    }

    private void showPerimeterCuadrado(){
        Cuadrado cuadrado = new Cuadrado(base);
        System.out.println("Perímetro del cuadrado "+cuadrado.getPerimeter());
    }

    private void showAreaTriangulo(){

        Triangulo triangulo = new Triangulo(base ,altura);
        System.out.println("Área del triangulo "+triangulo.getArea());
    }

    private void showPerimeterTriangulo(){
        Triangulo triangulo = new Triangulo(base,altura);
        System.out.println("Perímetro del triangulo "+triangulo.getPerimeter());
    }
}