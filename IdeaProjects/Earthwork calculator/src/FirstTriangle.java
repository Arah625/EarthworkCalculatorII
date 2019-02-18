import java.util.Scanner;

public class FirstTriangle {

    private float firstTriangleTopBase;
    private float firstTriangleHeight;      //podać lub obliczyć z rzędnych
    private float firstTriangleArmSlope1;
    private float firstTriangleArmSlope2;
    private float firstTriangleArmLength1;
    private float firstTriangleArmLength2;
    private float firstTriangleBottomOrdinate1;
    private float firstTriangleTopOrdinate1;
    private float firstTriangleTopOrdinate2;


    public FirstTriangle(float firstTriangleTopBase, float firstTriangleHeight, float firstTriangleArmSlope1, float firstTriangleArmSlope2, float firstTriangleArmLength1, float firstTriangleArmLength2, float firstTriangleBottomOrdinate1, float firstTriangleTopOrdinate1, float firstTriangleTopOrdinate2) {
        this.firstTriangleBottomOrdinate1 = firstTriangleBottomOrdinate1;
        this.firstTriangleTopOrdinate1 = firstTriangleTopOrdinate1;
        this.firstTriangleTopOrdinate2 = firstTriangleTopOrdinate2;
        this.firstTriangleTopBase = firstTriangleTopBase;
        this.firstTriangleHeight = firstTriangleHeight;
        this.firstTriangleArmSlope1 = firstTriangleArmSlope1;
        this.firstTriangleArmSlope2 = firstTriangleArmSlope2;
        this.firstTriangleArmLength1 = firstTriangleArmLength1;
        this.firstTriangleArmLength2 = firstTriangleArmLength2;
    }

    public String solveForFirstTriangle() {
        String solutionForFirstTriangle;

        if (firstTriangleHeight <= 0) {
            float firstTriangleHeightFromOrdinates = (((firstTriangleTopOrdinate1 + firstTriangleTopOrdinate2) / 2) - firstTriangleBottomOrdinate1);
            float firstTriangleAreaFromOrdinatesDifference = firstTriangleTopBase * firstTriangleHeightFromOrdinates / 2;
            solutionForFirstTriangle = "Area for first Triangle cross - section = " + firstTriangleAreaFromOrdinatesDifference;
        } else {
            float firstTriangleArea = firstTriangleTopBase * firstTriangleHeight / 2;
            solutionForFirstTriangle = "Area for first Triangle cross - section = " + firstTriangleArea;
        } return solutionForFirstTriangle;
    }

    public static void main(String[] args) {

        FirstTriangle calculationsForFirstTriangle = new FirstTriangle(0, 0, 0, 0, 0, 0, 0, 0, 0);
        System.out.println(calculationsForFirstTriangle.solveForFirstTriangle());
    }


    float firstTriangleHeightFromOrdinates = (((firstTriangleTopOrdinate1 + firstTriangleTopOrdinate2) / 2) - firstTriangleBottomOrdinate1);
    float firstTriangleAreaFromOrdinatesDifference = firstTriangleTopBase * firstTriangleHeightFromOrdinates / 2;
    float firstTriangleArea = firstTriangleTopBase * firstTriangleHeight / 2;

}
