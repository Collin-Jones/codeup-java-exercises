package shapes;

public class Square {
    private int length;
    private int width;

    public Square(int i) {
    }

    public double getPerimeter(){
        return 2 * (this.length + this.width);
    }
    public double getArea(){
        return this.length * this.width;
    }
}
