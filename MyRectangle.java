package QAP2;

public class MyRectangle {
    MyPoint corner1;
    MyPoint corner2;
    MyPoint corner3;

    public MyRectangle(MyPoint corner1, MyPoint corner2, MyPoint corner3){
        this.corner1 = corner1;
        this.corner2 = corner2;
        this.corner3 = corner3;
    }

    public int getLength(){
        int length = this.corner2.y - this.corner1.y;
        return length;
    }

    public int getWidth(){
        int width = this.corner3.x - this.corner2.x;
        return width;
    }

    public int getArea(){
        int area = this.getLength()*this.getWidth();
        return area;
    }
}
