package shapes;

public class Square extends Rectangle {

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

    //    public double getPerimeter(){
//        return 2 * (this.getLength() + this.getWidth());
//    }
//    public double getArea(){
//        return this.getLength() + this.getWidth();
//    }
}
