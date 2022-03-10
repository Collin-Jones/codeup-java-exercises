package shapes;

public class Square extends Quadrilateral {

    public Square(int side) {
        super(side, side);
        System.out.println("In Square constructor");
    }

    @Override
    public double getPerimeter() {
        return 4 * getLength();
    }

    @Override
    public double getArea() {
        return getWidth() * getLength();
    }

    @Override
    public void setLength(double length) {

    }

    @Override
    public void setWidth(double width) {

    }

    //    public double getPerimeter(){
//        return 2 * (this.getLength() + this.getWidth());
//    }
//    public double getArea(){
//        return this.getLength() + this.getWidth();
//    }
}
