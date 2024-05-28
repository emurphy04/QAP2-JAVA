package QAP2;

public class TesMyRectangle {
    public static void main(String[] args){
        MyPoint corner1 = new MyPoint(2, 2);
        
        MyPoint corner2 = new MyPoint(2, 5);

        MyPoint corner3 = new MyPoint(6, 5);

        MyRectangle rectangle = new MyRectangle(corner1, corner2, corner3);

        System.out.println(rectangle.getLength());

        System.out.println(rectangle.getWidth());

        System.out.println(rectangle.getArea());
    }
}
