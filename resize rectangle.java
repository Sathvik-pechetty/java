public class Rectangle {
    double length;
    double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
}

public class RectangleSize {

    public static void resizeRectangle(Rectangle rect, double newLength, double newWidth) {
        rect.length = newLength;
        rect.width = newWidth;
    }
}

public class Main {

    public static void main(String[] args) {
        Rectangle myRectangle = new Rectangle(5.0, 3.0);

        System.out.println("Original Dimensions: Length = " + myRectangle.length + ", Width = " + myRectangle.width);

        RectangleSize.resizeRectangle(myRectangle, 10.0, 6.0);

        System.out.println("Resized Dimensions: Length = " + myRectangle.length + ", Width = " + myRectangle.width);
    }
}
