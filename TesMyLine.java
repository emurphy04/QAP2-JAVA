package QAP2;

import java.util.Arrays;

public class TesMyLine {
    public static void main(String[] args){
        MyPoint begin = new MyPoint(2, 4);
        MyPoint end = new MyPoint(5, 9);

        MyLine line = new MyLine(5, 4, 2, 9);

        System.out.println(Arrays.toString(line.getBeginXY()));
        System.out.println(Arrays.toString(line.getEndXY()));
        System.out.println(line.getLength());
        System.out.println(line.getGradient());
    }
}
