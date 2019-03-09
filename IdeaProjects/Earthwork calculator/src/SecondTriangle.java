public class SecondTriangle {

    private float secondTriangleTopBase;
    private float secondTriangleBottomOrdinate1;
    private float secondTriangleTopOrdinate1;
    private float secondTriangleTopOrdinate2;
    private float secondTriangleHeight;


    public SecondTriangle(float secondTriangleBottomOrdinate1, float secondTriangleTopOrdinate1, float secondTriangleTopOrdinate2, float secondTriangleHeight, float secondTriangleTopBase) {

        this.secondTriangleBottomOrdinate1 = secondTriangleBottomOrdinate1;
        this.secondTriangleTopOrdinate1 = secondTriangleTopOrdinate1;
        this.secondTriangleTopOrdinate2 = secondTriangleTopOrdinate2;
        this.secondTriangleHeight = secondTriangleHeight;
        this.secondTriangleTopBase = secondTriangleTopBase;

    }

    public String SolveForSecondTriangle() {
        String solutionForSecondTriangle;
        float secondTriangleHeightFromOrdinates;
        float secondTriangleAreaFromOrdinatesDifference;

        if (secondTriangleHeight <= 0) {
            secondTriangleHeightFromOrdinates = (((secondTriangleTopOrdinate1 + secondTriangleTopOrdinate2) / 2) - secondTriangleBottomOrdinate1);
            secondTriangleAreaFromOrdinatesDifference = secondTriangleTopBase * secondTriangleHeightFromOrdinates / 2;
            solutionForSecondTriangle = "Area for second Triangle cross - section = " + secondTriangleAreaFromOrdinatesDifference;
        } else {
            float secondTriangleArea = secondTriangleTopBase * secondTriangleHeight / 2;
            solutionForSecondTriangle = "Area for second Triangle cross - section = " + secondTriangleArea;
        } return solutionForSecondTriangle;
    }
}
