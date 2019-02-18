public class SecondTrapezium {

    float secondTrapeziumTopBase;
    float secondTrapeziumBottomBase;
    float secondTrapeziumHeight;    //podać lub obliczyć z rzędnych
    float secondTrapeziumArmSlope1;
    float secondTrapeziumArmSlope2;
    float secondTrapeziumArmLenght1;
    float secondTrapeziumArmLength2;
    float secondTrapeziumBottomOrdinate1;
    float secondTrapeziumBottomOrdinate2;
    float secondTrapeziumTopOrdinate1;
    float secondTrapeziumTopOrdinate2;


    float secondTrapeziumHeightFromOrdinates = ((secondTrapeziumTopOrdinate1 + secondTrapeziumTopOrdinate2)/2) - ((secondTrapeziumBottomOrdinate1 + secondTrapeziumBottomOrdinate2)/2);
    float secondTrapeziumArea = ((secondTrapeziumBottomBase + secondTrapeziumTopBase)*secondTrapeziumHeight)/2;

}
