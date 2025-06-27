package LSP;

public class Rectangle implements Shape {
    private int height;
    private int width;

    Rectangle(int height,int width){
        this.width=width;
        this.height=height;
    }

    @Override
    public int getArea() {
        return height*width;
    }
}
