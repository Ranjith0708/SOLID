package LSP;

public class Main {
    public static void main(String[] args) {
        RectangleVio rectangleVio = new SquareVio();
        rectangleVio.setWidth(5);
        rectangleVio.setHeight(10);
        System.out.println(rectangleVio.getArea());


        Shape shape = new Rectangle(10,5);
        Shape shape_1 = new Square(10);
        System.out.println(shape.getArea());
        System.out.println(shape_1.getArea());
    }
}
