package LSP;

/*
If class B is a subtype of class A, then A's methods should work with B
without knowing it’s actually dealing with B.
LSP ensures inheritance is used properly.
*/
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
