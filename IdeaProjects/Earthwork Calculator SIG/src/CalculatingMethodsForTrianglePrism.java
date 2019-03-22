public class CalculatingMethodsForTrianglePrism {
    private FirstTriangle dataFromFirstTriangleCalculation = new FirstTriangle();
    private SecondTriangle dataFromSecondTriangleCalculation = new SecondTriangle();
    private TrianglePrism dataLengthFromTrianglePrism = new TrianglePrism();


    public float AverageCrossSectionMethodForTrianglePrism() {

        float trianglePrismVolumeAverageCrossSectionMethod;
        trianglePrismVolumeAverageCrossSectionMethod = (float) (0.5 * (dataFromFirstTriangleCalculation.SolveForFirstTriangle()) + dataFromSecondTriangleCalculation.SolveForSecondTriangle()) * dataLengthFromTrianglePrism.CalculateLengthOfTrench();

        return trianglePrismVolumeAverageCrossSectionMethod;
    }

}