public class FirstTriangle {

    private float firstTriangleTopBase;
    private float firstTriangleBottomOrdinate1;
    private float firstTriangleTopOrdinate1;
    private float firstTriangleTopOrdinate2;
    private float firstTriangleHeight;


    public FirstTriangle(float firstTriangleBottomOrdinate1, float firstTriangleTopOrdinate1, float firstTriangleTopOrdinate2, float firstTriangleHeight, float firstTriangleTopBase) {

        this.firstTriangleBottomOrdinate1 = firstTriangleBottomOrdinate1;
        this.firstTriangleTopOrdinate1 = firstTriangleTopOrdinate1;
        this.firstTriangleTopOrdinate2 = firstTriangleTopOrdinate2;
        this.firstTriangleHeight = firstTriangleHeight;
        this.firstTriangleTopBase = firstTriangleTopBase;

    }

    public String SolveForFirstTriangle() {
        String solutionForFirstTriangle;
        float firstTriangleHeightFromOrdinates;
        float firstTriangleAreaFromOrdinatesDifference;

        if (firstTriangleHeight <= 0) {
            firstTriangleHeightFromOrdinates = (((firstTriangleTopOrdinate1 + firstTriangleTopOrdinate2) / 2) - firstTriangleBottomOrdinate1);
            firstTriangleAreaFromOrdinatesDifference = firstTriangleTopBase * firstTriangleHeightFromOrdinates / 2;
            solutionForFirstTriangle = "Area for first Triangle cross - section = " + firstTriangleAreaFromOrdinatesDifference;
        } else {
            float firstTriangleArea = firstTriangleTopBase * firstTriangleHeight / 2;
            solutionForFirstTriangle = "Area for first Triangle cross - section = " + firstTriangleArea;
        }
        return solutionForFirstTriangle;


    }
}
