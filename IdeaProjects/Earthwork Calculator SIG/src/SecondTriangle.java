public class SecondTriangle {

    private TrianglePrism inputDataTwo = new TrianglePrism();

    public float SolveForSecondTriangle() {
        float solutionForSecondTriangle;
        float secondTriangleHeightFromOrdinates;
        float secondTriangleAreaFromOrdinatesDifference;

        if (inputDataTwo.getSecondTriangleHeight() <= 0) {
            secondTriangleHeightFromOrdinates = (((inputDataTwo.getSecondTriangleTopOrdinate1() + inputDataTwo.getSecondTriangleTopOrdinate2()) / 2) - inputDataTwo.getSecondTriangleBottomOrdinate1());
            secondTriangleAreaFromOrdinatesDifference = inputDataTwo.getSecondTriangleTopBase() * secondTriangleHeightFromOrdinates / 2;
            solutionForSecondTriangle = secondTriangleAreaFromOrdinatesDifference;
        } else {
            float secondTriangleArea = inputDataTwo.getSecondTriangleTopBase() * inputDataTwo.getSecondTriangleHeight() / 2;
            solutionForSecondTriangle = secondTriangleArea;
        }
        return solutionForSecondTriangle;
    }
}
