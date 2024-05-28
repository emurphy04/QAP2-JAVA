package QAP2;

public class MyLine {
    int x1;
    int y2;
    int x2;
    int y1;
    MyPoint begin;
    MyPoint end;

    public MyLine(int x1, int y1, int x2, int y2){
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public MyLine(MyPoint begin, MyPoint end){
        this.begin = begin;
        this.end = end;
    }

    public MyPoint getBegin() {
        return begin;
    }

    public void setBegin(MyPoint begin) {
        this.begin = begin;
    }

    public MyPoint getEnd() {
        return end;
    }

    public void setEnd(MyPoint end) {
        this.end = end;
    }

    public int getBeginX(){
        return x1;
    }

    public void setBeginX(int x){
        this.x1 = x;
    }

    public int getBeginY(){
        return y1;
    }

    public void setBeginY(int y){
        this.y1 = y;
    }

    public int getEndX(){
        return x2;
    }

    public void setEndX(int x){
        this.x2 = x;
    }

    public int getEndY(){
        return y2;
    }

    public void setEndY(int y){
        this.y2 = y;
    }

    public int[] getBeginXY(){
        return new int[] {this.x1, this.y1};
    }

    public int[] getEndXY(){
        return new int[] {this.x2, this.y2};
    }

    public void setBeginXY(int x, int y){
        this.x1 = x;
        this.y1 = y;
    }

    public void setEndXY(int x, int y){
        this.x2 = x;
        this.y2 = y;
    }

    public double getLength(){
        int width;
        int height;
        double length;

        if(this.x1 < this.x2){
            width = (this.x2 - this.x1);
        } else if(this.x1 > this.x2){
            width = (this.x1 - this.x2);
        } else {
            width = 0;
        }

        if(this.y1 < this.y2){
            height = (this.y2 - this.y1);
        } else if(this.y1 > this.y2){
            height = (this.y1 - this.y2);
        } else {
            height = 0;
        }  

        length = Math.sqrt((width*width)+(height*height));

        return length;
    }

    public double getGradient(){
        double gradient;

        gradient = Math.tan(Math.atan2((this.y2 - this.y1), (this.x2 - this.x1)));

        return gradient;
    }




}
