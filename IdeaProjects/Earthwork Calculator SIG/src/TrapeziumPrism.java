public class TrapeziumPrism {

    private String trapeziumPrismBeginningChainage;
    private String trapeziumPrismClosingChainage;
    private float firstTrapeziumTopBase;
    private float firstTrapeziumBottomBase;
    private float firstTrapeziumBottomOrdinate1;
    private float firstTrapeziumBottomOrdinate2;
    private float firstTrapeziumTopOrdinate1;
    private float firstTrapeziumTopOrdinate2;
    private float firstTrapeziumHeight;
    private float secondTrapeziumTopBase;
    private float secondTrapeziumBottomBase;
    private float secondTrapeziumBottomOrdinate1;
    private float secondTrapeziumBottomOrdinate2;
    private float secondTrapeziumTopOrdinate1;
    private float secondTrapeziumTopOrdinate2;
    private float secondTrapeziumHeight;
    private float medialTrapeziumTopBase;
    private float medialTrapeziumBottomBase;
    private float medialTrapeziumBottomOrdinate1;
    private float medialTrapeziumBottomOrdinate2;
    private float medialTrapeziumTopOrdinate1;
    private float medialTrapeziumTopOrdinate2;
    private float medialTrapeziumHeight;

    private String replacedSumSignInTrapeziumPrismBeginningChainage = trapeziumPrismBeginningChainage.replace("+", "");
    private String replacedSumSignInTrapeziumPrismClosingChainage = trapeziumPrismClosingChainage.replace("+", "");
    private float convertedTrapeziumPrismStringBeginningChainageToFloat = Float.valueOf(replacedSumSignInTrapeziumPrismBeginningChainage);
    private float convertedTrapeziumPrismStringClosingChainageToFloat = Float.valueOf(replacedSumSignInTrapeziumPrismClosingChainage);

    private float trapeziumPrismVariableAForTopSurfaceAreaForSimpsonMethod;
    private float trapeziumPrismVariableBForTopSurfaceAreaForSimpsonMethod;
    private float trapeziumPrismVariableCForBottomSurfaceAreaForSimpsonMethod;
    private float trapeziumPrismVariableDForBottomSurfaceAreaForSimpsonMethod;
    private float trapeziumPrismTopOrdinate1ForSimpsonMethod;
    private float trapeziumPrismTopOrdinate2ForSimpsonMethod;
    private float trapeziumPrismBottomOrdinate1ForSimpsonMethod;
    private float trapeziumPrismBottomOrdinate2ForSimpsonMethod;
    private float trapeziumPrismHeightForSimpsonMethod;



    private float trapeziumPrismBottomSurfaceAreaForSimpsonMethod = trapeziumPrismVariableCForBottomSurfaceAreaForSimpsonMethod * trapeziumPrismVariableDForBottomSurfaceAreaForSimpsonMethod;
    private float trapeziumPrismTopSurfaceAreaForSimpsonMethod = trapeziumPrismVariableAForTopSurfaceAreaForSimpsonMethod * trapeziumPrismVariableBForTopSurfaceAreaForSimpsonMethod;
    private float trapeziumPrismMiddleSurfaceAreaForSimpsonMethod = (trapeziumPrismVariableAForTopSurfaceAreaForSimpsonMethod * trapeziumPrismVariableCForBottomSurfaceAreaForSimpsonMethod) * (trapeziumPrismVariableBForTopSurfaceAreaForSimpsonMethod * trapeziumPrismVariableDForBottomSurfaceAreaForSimpsonMethod);

    public String getTrapeziumPrismBeginningChainage() {
        return trapeziumPrismBeginningChainage;
    }

    public void setTrapeziumPrismBeginningChainage(String trapeziumPrismBeginningChainage) {
        this.trapeziumPrismBeginningChainage = trapeziumPrismBeginningChainage;
    }

    public String getTrapeziumPrismClosingChainage() {
        return trapeziumPrismClosingChainage;
    }

    public void setTrapeziumPrismClosingChainage(String trapeziumPrismClosingChainage) {
        this.trapeziumPrismClosingChainage = trapeziumPrismClosingChainage;
    }

    public float getFirstTrapeziumTopBase() {
        return firstTrapeziumTopBase;
    }

    public void setFirstTrapeziumTopBase(float firstTrapeziumTopBase) {
        this.firstTrapeziumTopBase = firstTrapeziumTopBase;
    }

    public float getFirstTrapeziumBottomBase() {
        return firstTrapeziumBottomBase;
    }

    public void setFirstTrapeziumBottomBase(float firstTrapeziumBottomBase) {
        this.firstTrapeziumBottomBase = firstTrapeziumBottomBase;
    }

    public float getFirstTrapeziumBottomOrdinate1() {
        return firstTrapeziumBottomOrdinate1;
    }

    public void setFirstTrapeziumBottomOrdinate1(float firstTrapeziumBottomOrdinate1) {
        this.firstTrapeziumBottomOrdinate1 = firstTrapeziumBottomOrdinate1;
    }

    public float getFirstTrapeziumBottomOrdinate2() {
        return firstTrapeziumBottomOrdinate2;
    }

    public void setFirstTrapeziumBottomOrdinate2(float firstTrapeziumBottomOrdinate2) {
        this.firstTrapeziumBottomOrdinate2 = firstTrapeziumBottomOrdinate2;
    }

    public float getFirstTrapeziumTopOrdinate1() {
        return firstTrapeziumTopOrdinate1;
    }

    public void setFirstTrapeziumTopOrdinate1(float firstTrapeziumTopOrdinate1) {
        this.firstTrapeziumTopOrdinate1 = firstTrapeziumTopOrdinate1;
    }

    public float getFirstTrapeziumTopOrdinate2() {
        return firstTrapeziumTopOrdinate2;
    }

    public void setFirstTrapeziumTopOrdinate2(float firstTrapeziumTopOrdinate2) {
        this.firstTrapeziumTopOrdinate2 = firstTrapeziumTopOrdinate2;
    }

    public float getFirstTrapeziumHeight() {
        return firstTrapeziumHeight;
    }

    public void setFirstTrapeziumHeight(float firstTrapeziumHeight) {
        this.firstTrapeziumHeight = firstTrapeziumHeight;
    }

    public float getSecondTrapeziumTopBase() {
        return secondTrapeziumTopBase;
    }

    public void setSecondTrapeziumTopBase(float secondTrapeziumTopBase) {
        this.secondTrapeziumTopBase = secondTrapeziumTopBase;
    }

    public float getSecondTrapeziumBottomBase() {
        return secondTrapeziumBottomBase;
    }

    public void setSecondTrapeziumBottomBase(float secondTrapeziumBottomBase) {
        this.secondTrapeziumBottomBase = secondTrapeziumBottomBase;
    }

    public float getSecondTrapeziumBottomOrdinate1() {
        return secondTrapeziumBottomOrdinate1;
    }

    public void setSecondTrapeziumBottomOrdinate1(float secondTrapeziumBottomOrdinate1) {
        this.secondTrapeziumBottomOrdinate1 = secondTrapeziumBottomOrdinate1;
    }

    public float getSecondTrapeziumBottomOrdinate2() {
        return secondTrapeziumBottomOrdinate2;
    }

    public void setSecondTrapeziumBottomOrdinate2(float secondTrapeziumBottomOrdinate2) {
        this.secondTrapeziumBottomOrdinate2 = secondTrapeziumBottomOrdinate2;
    }

    public float getSecondTrapeziumTopOrdinate1() {
        return secondTrapeziumTopOrdinate1;
    }

    public void setSecondTrapeziumTopOrdinate1(float secondTrapeziumTopOrdinate1) {
        this.secondTrapeziumTopOrdinate1 = secondTrapeziumTopOrdinate1;
    }

    public float getSecondTrapeziumTopOrdinate2() {
        return secondTrapeziumTopOrdinate2;
    }

    public void setSecondTrapeziumTopOrdinate2(float secondTrapeziumTopOrdinate2) {
        this.secondTrapeziumTopOrdinate2 = secondTrapeziumTopOrdinate2;
    }

    public float getSecondTrapeziumHeight() {
        return secondTrapeziumHeight;
    }

    public void setSecondTrapeziumHeight(float secondTrapeziumHeight) {
        this.secondTrapeziumHeight = secondTrapeziumHeight;
    }

    public float getMedialTrapeziumTopBase() {
        return medialTrapeziumTopBase;
    }

    public void setMedialTrapeziumTopBase(float medialTrapeziumTopBase) {
        this.medialTrapeziumTopBase = medialTrapeziumTopBase;
    }

    public float getMedialTrapeziumBottomBase() {
        return medialTrapeziumBottomBase;
    }

    public void setMedialTrapeziumBottomBase(float medialTrapeziumBottomBase) {
        this.medialTrapeziumBottomBase = medialTrapeziumBottomBase;
    }

    public float getMedialTrapeziumBottomOrdinate1() {
        return medialTrapeziumBottomOrdinate1;
    }

    public void setMedialTrapeziumBottomOrdinate1(float medialTrapeziumBottomOrdinate1) {
        this.medialTrapeziumBottomOrdinate1 = medialTrapeziumBottomOrdinate1;
    }

    public float getMedialTrapeziumBottomOrdinate2() {
        return medialTrapeziumBottomOrdinate2;
    }

    public void setMedialTrapeziumBottomOrdinate2(float medialTrapeziumBottomOrdinate2) {
        this.medialTrapeziumBottomOrdinate2 = medialTrapeziumBottomOrdinate2;
    }

    public float getMedialTrapeziumTopOrdinate1() {
        return medialTrapeziumTopOrdinate1;
    }

    public void setMedialTrapeziumTopOrdinate1(float medialTrapeziumTopOrdinate1) {
        this.medialTrapeziumTopOrdinate1 = medialTrapeziumTopOrdinate1;
    }

    public float getMedialTrapeziumTopOrdinate2() {
        return medialTrapeziumTopOrdinate2;
    }

    public void setMedialTrapeziumTopOrdinate2(float medialTrapeziumTopOrdinate2) {
        this.medialTrapeziumTopOrdinate2 = medialTrapeziumTopOrdinate2;
    }

    public float getMedialTrapeziumHeight() {
        return medialTrapeziumHeight;
    }

    public void setMedialTrapeziumHeight(float medialTrapeziumHeight) {
        this.medialTrapeziumHeight = medialTrapeziumHeight;
    }

    public String getReplacedSumSignInTrapeziumPrismBeginningChainage() {
        return replacedSumSignInTrapeziumPrismBeginningChainage;
    }

    public void setReplacedSumSignInTrapeziumPrismBeginningChainage(String replacedSumSignInTrapeziumPrismBeginningChainage) {
        this.replacedSumSignInTrapeziumPrismBeginningChainage = replacedSumSignInTrapeziumPrismBeginningChainage;
    }

    public String getReplacedSumSignInTrapeziumPrismClosingChainage() {
        return replacedSumSignInTrapeziumPrismClosingChainage;
    }

    public void setReplacedSumSignInTrapeziumPrismClosingChainage(String replacedSumSignInTrapeziumPrismClosingChainage) {
        this.replacedSumSignInTrapeziumPrismClosingChainage = replacedSumSignInTrapeziumPrismClosingChainage;
    }

    public float getConvertedTrapeziumPrismStringBeginningChainageToFloat() {
        return convertedTrapeziumPrismStringBeginningChainageToFloat;
    }

    public void setConvertedTrapeziumPrismStringBeginningChainageToFloat(float convertedTrapeziumPrismStringBeginningChainageToFloat) {
        this.convertedTrapeziumPrismStringBeginningChainageToFloat = convertedTrapeziumPrismStringBeginningChainageToFloat;
    }

    public float getConvertedTrapeziumPrismStringClosingChainageToFloat() {
        return convertedTrapeziumPrismStringClosingChainageToFloat;
    }

    public void setConvertedTrapeziumPrismStringClosingChainageToFloat(float convertedTrapeziumPrismStringClosingChainageToFloat) {
        this.convertedTrapeziumPrismStringClosingChainageToFloat = convertedTrapeziumPrismStringClosingChainageToFloat;
    }

    public float getTrapeziumPrismVariableAForTopSurfaceAreaForSimpsonMethod() {
        return trapeziumPrismVariableAForTopSurfaceAreaForSimpsonMethod;
    }

    public void setTrapeziumPrismVariableAForTopSurfaceAreaForSimpsonMethod(float trapeziumPrismVariableAForTopSurfaceAreaForSimpsonMethod) {
        this.trapeziumPrismVariableAForTopSurfaceAreaForSimpsonMethod = trapeziumPrismVariableAForTopSurfaceAreaForSimpsonMethod;
    }

    public float getTrapeziumPrismVariableBForTopSurfaceAreaForSimpsonMethod() {
        return trapeziumPrismVariableBForTopSurfaceAreaForSimpsonMethod;
    }

    public void setTrapeziumPrismVariableBForTopSurfaceAreaForSimpsonMethod(float trapeziumPrismVariableBForTopSurfaceAreaForSimpsonMethod) {
        this.trapeziumPrismVariableBForTopSurfaceAreaForSimpsonMethod = trapeziumPrismVariableBForTopSurfaceAreaForSimpsonMethod;
    }

    public float getTrapeziumPrismVariableCForBottomSurfaceAreaForSimpsonMethod() {
        return trapeziumPrismVariableCForBottomSurfaceAreaForSimpsonMethod;
    }

    public void setTrapeziumPrismVariableCForBottomSurfaceAreaForSimpsonMethod(float trapeziumPrismVariableCForBottomSurfaceAreaForSimpsonMethod) {
        this.trapeziumPrismVariableCForBottomSurfaceAreaForSimpsonMethod = trapeziumPrismVariableCForBottomSurfaceAreaForSimpsonMethod;
    }

    public float getTrapeziumPrismVariableDForBottomSurfaceAreaForSimpsonMethod() {
        return trapeziumPrismVariableDForBottomSurfaceAreaForSimpsonMethod;
    }

    public void setTrapeziumPrismVariableDForBottomSurfaceAreaForSimpsonMethod(float trapeziumPrismVariableDForBottomSurfaceAreaForSimpsonMethod) {
        this.trapeziumPrismVariableDForBottomSurfaceAreaForSimpsonMethod = trapeziumPrismVariableDForBottomSurfaceAreaForSimpsonMethod;
    }

    public float getTrapeziumPrismBottomSurfaceAreaForSimpsonMethod() {
        return trapeziumPrismBottomSurfaceAreaForSimpsonMethod;
    }

    public void setTrapeziumPrismBottomSurfaceAreaForSimpsonMethod(float trapeziumPrismBottomSurfaceAreaForSimpsonMethod) {
        this.trapeziumPrismBottomSurfaceAreaForSimpsonMethod = trapeziumPrismBottomSurfaceAreaForSimpsonMethod;
    }

    public float getTrapeziumPrismTopSurfaceAreaForSimpsonMethod() {
        return trapeziumPrismTopSurfaceAreaForSimpsonMethod;
    }

    public void setTrapeziumPrismTopSurfaceAreaForSimpsonMethod(float trapeziumPrismTopSurfaceAreaForSimpsonMethod) {
        this.trapeziumPrismTopSurfaceAreaForSimpsonMethod = trapeziumPrismTopSurfaceAreaForSimpsonMethod;
    }

    public float getTrapeziumPrismMiddleSurfaceAreaForSimpsonMethod() {
        return trapeziumPrismMiddleSurfaceAreaForSimpsonMethod;
    }

    public void setTrapeziumPrismMiddleSurfaceAreaForSimpsonMethod(float trapeziumPrismMiddleSurfaceAreaForSimpsonMethod) {
        this.trapeziumPrismMiddleSurfaceAreaForSimpsonMethod = trapeziumPrismMiddleSurfaceAreaForSimpsonMethod;
    }

    public float getTrapeziumPrismTopOrdinate1ForSimpsonMethod() {
        return trapeziumPrismTopOrdinate1ForSimpsonMethod;
    }

    public void setTrapeziumPrismTopOrdinate1ForSimpsonMethod(float trapeziumPrismTopOrdinate1ForSimpsonMethod) {
        this.trapeziumPrismTopOrdinate1ForSimpsonMethod = trapeziumPrismTopOrdinate1ForSimpsonMethod;
    }

    public float getTrapeziumPrismTopOrdinate2ForSimpsonMethod() {
        return trapeziumPrismTopOrdinate2ForSimpsonMethod;
    }

    public void setTrapeziumPrismTopOrdinate2ForSimpsonMethod(float trapeziumPrismTopOrdinate2ForSimpsonMethod) {
        this.trapeziumPrismTopOrdinate2ForSimpsonMethod = trapeziumPrismTopOrdinate2ForSimpsonMethod;
    }

    public float getTrapeziumPrismBottomOrdinate1ForSimpsonMethod() {
        return trapeziumPrismBottomOrdinate1ForSimpsonMethod;
    }

    public void setTrapeziumPrismBottomOrdinate1ForSimpsonMethod(float trapeziumPrismBottomOrdinate1ForSimpsonMethod) {
        this.trapeziumPrismBottomOrdinate1ForSimpsonMethod = trapeziumPrismBottomOrdinate1ForSimpsonMethod;
    }

    public float getTrapeziumPrismBottomOrdinate2ForSimpsonMethod() {
        return trapeziumPrismBottomOrdinate2ForSimpsonMethod;
    }

    public void setTrapeziumPrismBottomOrdinate2ForSimpsonMethod(float trapeziumPrismBottomOrdinate2ForSimpsonMethod) {
        this.trapeziumPrismBottomOrdinate2ForSimpsonMethod = trapeziumPrismBottomOrdinate2ForSimpsonMethod;
    }

    public float getTrapeziumPrismHeightForSimpsonMethod() {
        return trapeziumPrismHeightForSimpsonMethod;
    }

    public void setTrapeziumPrismHeightForSimpsonMethod(float trapeziumPrismHeightForSimpsonMethod) {
        this.trapeziumPrismHeightForSimpsonMethod = trapeziumPrismHeightForSimpsonMethod;
    }
}
