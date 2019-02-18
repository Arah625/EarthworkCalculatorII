public class TrianglePrism {



    private float trianglePrismLenght;
    private float trianglePrismSlope;
    private float trianglePrismVariableAForTopSurfaceAreaForSimpsonMethod;
    private float trianglePrismVariableBForTopSurfaceAreaForSimpsonMethod;
    private float trianglePrismVariableCForBottomSurfaceAreaForSimpsonMethod;
    private float trianglePrismVariableDForBottomSurfaceAreaForSimpsonMethod;
    private String trianglePrismBeginningChainage;
    private String trianglePrismClosingChainage;
    private float trianglePrismBottomSurfaceAreaForSimpsonMethod = trianglePrismVariableCForBottomSurfaceAreaForSimpsonMethod * trianglePrismVariableDForBottomSurfaceAreaForSimpsonMethod;
    private float trianglePrismTopSurfaceAreaForSimpsonMethod = trianglePrismVariableAForTopSurfaceAreaForSimpsonMethod * trianglePrismVariableBForTopSurfaceAreaForSimpsonMethod;
    private float trianglePrismMiddleSurfaceAreaForSimpsonMethod = (trianglePrismVariableAForTopSurfaceAreaForSimpsonMethod * trianglePrismVariableCForBottomSurfaceAreaForSimpsonMethod) * (trianglePrismVariableBForTopSurfaceAreaForSimpsonMethod * trianglePrismVariableDForBottomSurfaceAreaForSimpsonMethod);

    private FirstTriangle firstTriangle1 = new FirstTriangle(0,0,0,0,0,0,0,0,0);

    private SecondTriangle secondTriangle1 = new SecondTriangle();

    //metoda średniego przekroju
    float trianglePrismVolumeAverageCrossSectionnMethod = (float) (0.5 * (firstTriangle1.firstTriangleArea + secondTriangle1.secondTriangleArea) * trianglePrismLenght);


    //metoda Simpsona
    float trianglePrismVolumeSimpsonMethod = (float) ((trianglePrismLenght / 6) * (trianglePrismBottomSurfaceAreaForSimpsonMethod + trianglePrismTopSurfaceAreaForSimpsonMethod + 4 * trianglePrismMiddleSurfaceAreaForSimpsonMethod));


    //metoda środkowego przekroju
    float trianglePrismVolumeMedialCrossSectionMethod = (float) (((firstTriangle1.firstTriangleArea + secondTriangle1.secondTriangleArea) / 2) * trianglePrismLenght);


}
