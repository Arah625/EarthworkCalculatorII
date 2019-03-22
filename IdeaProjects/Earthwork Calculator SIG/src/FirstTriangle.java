public class FirstTriangle {

    private TrianglePrism inputDataOne = new TrianglePrism();

    public float SolveForFirstTriangle() {

        float solutionForFirstTriangle;
        float firstTriangleHeightFromOrdinates;
        float firstTriangleAreaFromOrdinatesDifference;

        if (inputDataOne.getFirstTriangleHeight() <= 0) {
            firstTriangleHeightFromOrdinates = (((inputDataOne.getFirstTriangleTopOrdinate1() + inputDataOne.getFirstTriangleTopOrdinate2()) / 2) - inputDataOne.getFirstTriangleBottomOrdinate1());
            firstTriangleAreaFromOrdinatesDifference = inputDataOne.getFirstTriangleTopBase() * firstTriangleHeightFromOrdinates / 2;
            solutionForFirstTriangle = firstTriangleAreaFromOrdinatesDifference;
        } else {
            float firstTriangleArea = inputDataOne.getFirstTriangleTopBase() * inputDataOne.getFirstTriangleHeight() / 2;
            solutionForFirstTriangle = firstTriangleArea;
        }
        return solutionForFirstTriangle;
    }
}
