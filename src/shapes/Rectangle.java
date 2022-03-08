package shapes;

public class Rectangle {

    private int length;
    private int width;

    public double getPerimeter(){
        return 2 * (this.length + this.width);
    }
    public double getArea(){
        return this.length * this.width;
    }
}
