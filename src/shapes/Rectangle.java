package shapes;

public class Rectangle extends Quadrilateral implements Measurable {

    private int length;
    private int width;

    public Rectangle(int length, int width) {
        super();
        this.length = length;
        this.width = width;
    }

    public double getPerimeter(){
        return 2 * (this.length + this.width);
    }
    public double getArea(){
        return this.length * this.width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public void setLength(double length) {

    }

    @Override
    public void setWidth(double width) {

    }

    public void setWidth(int width) {
        this.width = width;
    }
}
