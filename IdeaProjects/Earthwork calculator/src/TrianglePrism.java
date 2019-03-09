public class TrianglePrism {

    private String trianglePrismBeginningChainage;
    private String trianglePrismClosingChainage;

    private float convertedTrianglePrismStringBeginningChainageToFloat = Float.parseFloat(trianglePrismBeginningChainage);
    private float convertedTrianglePrismStringClosingChainageToFloat = Float.parseFloat(trianglePrismClosingChainage);


    public TrianglePrism(String trianglePrismBeginningChainage, String trianglePrismClosingChainage) {

        this.trianglePrismBeginningChainage = trianglePrismBeginningChainage;
        this.trianglePrismClosingChainage = trianglePrismClosingChainage;

    }

    public String ConvertTrianglePrismStringChainageToFloatLength() {


        String solutionTrianglePrismStringChainageToFloatLength = " ";


        solutionTrianglePrismStringChainageToFloatLength = "Length on the trench is: " + (convertedTrianglePrismStringClosingChainageToFloat - convertedTrianglePrismStringBeginningChainageToFloat) + "m";

        return solutionTrianglePrismStringChainageToFloatLength;
    }

}