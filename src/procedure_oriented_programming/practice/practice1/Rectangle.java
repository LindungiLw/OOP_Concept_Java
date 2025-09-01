package procedure_oriented_programming.practice.practice1;

public class Rectangle {
    int width;
    int height;

    int calculate(int width, int height){
        return width * height;
    }

    int calculatePerimeter(int width, int height){
        return width + height;
    }
    boolean isSquare(int width, int height){
        return width == height;
    }
}
