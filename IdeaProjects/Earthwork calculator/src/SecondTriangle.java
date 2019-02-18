public class SecondTriangle {

    float secondTriangleTopBase;
    float secondTriangleHeight;     //podać lub obliczyć z rzędnych
    float secondTriangleArmSlope1;
    float secondTriangleArmSlope2;
    float secondTriangleArmLenght1;
    float secondTriangleArmLength2;
    float secondTriangleBottomOrdinate1;
    float secondTriangleTopOrdinate1;
    float secondTriangleTopOrdinate2;


    float secondTriangleHeightFromOrdinates = ((secondTriangleTopOrdinate1 + secondTriangleTopOrdinate2)/2) - secondTriangleBottomOrdinate1;
    float secondTriangleArea = secondTriangleTopBase*secondTriangleHeight/2;

}
