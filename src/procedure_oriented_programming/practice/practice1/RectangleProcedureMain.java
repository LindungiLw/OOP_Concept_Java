package procedure_oriented_programming.practice.practice1;

public class RectangleProcedureMain {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.width = 5;
        rectangle.height = 8;
        System.out.println("Area = " + rectangle.calculate(rectangle.width, rectangle.height));
        System.out.println("Perimeter = " + rectangle.calculatePerimeter(rectangle.width, rectangle.height));
        System.out.println("Is Square = " + rectangle.isSquare(rectangle.width, rectangle.height));
    }
}
