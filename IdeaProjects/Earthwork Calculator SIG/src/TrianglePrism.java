public class TrianglePrism {

    private String trianglePrismBeginningChainage;
    private String trianglePrismClosingChainage;
    private float firstTriangleTopBase;
    private float firstTriangleBottomOrdinate1;
    private float firstTriangleTopOrdinate1;
    private float firstTriangleTopOrdinate2;
    private float firstTriangleHeight;
    private float secondTriangleTopBase;
    private float secondTriangleBottomOrdinate1;
    private float secondTriangleTopOrdinate1;
    private float secondTriangleTopOrdinate2;
    private float secondTriangleHeight;
    private float medialTriangleTopBase;
    private float medialTriangleBottomOrdinate1;
    private float medialTriangleTopOrdinate1;
    private float medialTriangleTopOrdinate2;
    private float medialTriangleHeight;
    private String replacedSumSignInTrianglePrismBeginningChainage;
    private String replacedSumSignInTrianglePrismClosingChainage;
    private float convertedTrianglePrismStringBeginningChainageToFloat;
    private float convertedTrianglePrismStringClosingChainageToFloat;


    public float CalculateLengthOfTrench() {

        float solutionForTrenchLength;

        solutionForTrenchLength = getConvertedTrianglePrismStringClosingChainageToFloat() - getConvertedTrianglePrismStringBeginningChainageToFloat();
        return solutionForTrenchLength;
    }


    public String getTrianglePrismBeginningChainage() {
        return trianglePrismBeginningChainage;
    }

    public void setTrianglePrismBeginningChainage(String trianglePrismBeginningChainage) {
        this.trianglePrismBeginningChainage = trianglePrismBeginningChainage;
    }

    public String getTrianglePrismClosingChainage() {
        return trianglePrismClosingChainage;
    }

    public void setTrianglePrismClosingChainage(String trianglePrismClosingChainage) {
        this.trianglePrismClosingChainage = trianglePrismClosingChainage;
    }

    public float getFirstTriangleTopBase() {
        return firstTriangleTopBase;
    }

    public void setFirstTriangleTopBase(float firstTriangleTopBase) {
        this.firstTriangleTopBase = firstTriangleTopBase;
    }

    public float getFirstTriangleBottomOrdinate1() {
        return firstTriangleBottomOrdinate1;
    }

    public void setFirstTriangleBottomOrdinate1(float firstTriangleBottomOrdinate1) {
        this.firstTriangleBottomOrdinate1 = firstTriangleBottomOrdinate1;
    }

    public float getFirstTriangleTopOrdinate1() {
        return firstTriangleTopOrdinate1;
    }

    public void setFirstTriangleTopOrdinate1(float firstTriangleTopOrdinate1) {
        this.firstTriangleTopOrdinate1 = firstTriangleTopOrdinate1;
    }

    public float getFirstTriangleTopOrdinate2() {
        return firstTriangleTopOrdinate2;
    }

    public void setFirstTriangleTopOrdinate2(float firstTriangleTopOrdinate2) {
        this.firstTriangleTopOrdinate2 = firstTriangleTopOrdinate2;
    }

    public float getFirstTriangleHeight() {
        return firstTriangleHeight;
    }

    public void setFirstTriangleHeight(float firstTriangleHeight) {
        this.firstTriangleHeight = firstTriangleHeight;
    }

    public float getSecondTriangleTopBase() {
        return secondTriangleTopBase;
    }

    public void setSecondTriangleTopBase(float secondTriangleTopBase) {
        this.secondTriangleTopBase = secondTriangleTopBase;
    }

    public float getSecondTriangleBottomOrdinate1() {
        return secondTriangleBottomOrdinate1;
    }

    public void setSecondTriangleBottomOrdinate1(float secondTriangleBottomOrdinate1) {
        this.secondTriangleBottomOrdinate1 = secondTriangleBottomOrdinate1;
    }

    public float getSecondTriangleTopOrdinate1() {
        return secondTriangleTopOrdinate1;
    }

    public void setSecondTriangleTopOrdinate1(float secondTriangleTopOrdinate1) {
        this.secondTriangleTopOrdinate1 = secondTriangleTopOrdinate1;
    }

    public float getSecondTriangleTopOrdinate2() {
        return secondTriangleTopOrdinate2;
    }

    public void setSecondTriangleTopOrdinate2(float secondTriangleTopOrdinate2) {
        this.secondTriangleTopOrdinate2 = secondTriangleTopOrdinate2;
    }

    public float getSecondTriangleHeight() {
        return secondTriangleHeight;
    }

    public void setSecondTriangleHeight(float secondTriangleHeight) {
        this.secondTriangleHeight = secondTriangleHeight;
    }

    public float getMedialTriangleTopBase() {
        return medialTriangleTopBase;
    }

    public void setMedialTriangleTopBase(float medialTriangleTopBase) {
        this.medialTriangleTopBase = medialTriangleTopBase;
    }

    public float getMedialTriangleBottomOrdinate1() {
        return medialTriangleBottomOrdinate1;
    }

    public void setMedialTriangleBottomOrdinate1(float medialTriangleBottomOrdinate1) {
        this.medialTriangleBottomOrdinate1 = medialTriangleBottomOrdinate1;
    }

    public float getMedialTriangleTopOrdinate1() {
        return medialTriangleTopOrdinate1;
    }

    public void setMedialTriangleTopOrdinate1(float medialTriangleTopOrdinate1) {
        this.medialTriangleTopOrdinate1 = medialTriangleTopOrdinate1;
    }

    public float getMedialTriangleTopOrdinate2() {
        return medialTriangleTopOrdinate2;
    }

    public void setMedialTriangleTopOrdinate2(float medialTriangleTopOrdinate2) {
        this.medialTriangleTopOrdinate2 = medialTriangleTopOrdinate2;
    }

    public float getMedialTriangleHeight() {
        return medialTriangleHeight;
    }

    public void setMedialTriangleHeight(float medialTriangleHeight) {
        this.medialTriangleHeight = medialTriangleHeight;
    }

    public String getReplacedSumSignInTrianglePrismBeginningChainage() {
        return replacedSumSignInTrianglePrismBeginningChainage;
    }

    public void setReplacedSumSignInTrianglePrismBeginningChainage(String replacedSumSignInTrianglePrismBeginningChainage) {
        this.replacedSumSignInTrianglePrismBeginningChainage = getTrianglePrismBeginningChainage().replace("+", "");
    }

    public String getReplacedSumSignInTrianglePrismClosingChainage() {
        return replacedSumSignInTrianglePrismClosingChainage;
    }

    public void setReplacedSumSignInTrianglePrismClosingChainage(String replacedSumSignInTrianglePrismClosingChainage) {
        this.replacedSumSignInTrianglePrismClosingChainage = getTrianglePrismClosingChainage().replace("+", "");
    }

    public float getConvertedTrianglePrismStringBeginningChainageToFloat() {
        return convertedTrianglePrismStringBeginningChainageToFloat;
    }

    public void setConvertedTrianglePrismStringBeginningChainageToFloat(float convertedTrianglePrismStringBeginningChainageToFloat) {
        this.convertedTrianglePrismStringBeginningChainageToFloat = Float.valueOf(getReplacedSumSignInTrianglePrismBeginningChainage());
    }

    public float getConvertedTrianglePrismStringClosingChainageToFloat() {
        return convertedTrianglePrismStringClosingChainageToFloat;
    }

    public void setConvertedTrianglePrismStringClosingChainageToFloat(float convertedTrianglePrismStringClosingChainageToFloat) {
        this.convertedTrianglePrismStringClosingChainageToFloat = Float.valueOf(getReplacedSumSignInTrianglePrismClosingChainage());
    }


}
