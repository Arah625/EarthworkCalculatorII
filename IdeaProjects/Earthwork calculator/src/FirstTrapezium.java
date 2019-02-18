public class FirstTrapezium {

    float firstTrapeziumTopBase = 12.4f;
    float firstTrapeziumBottomBase = 16.8f;
    float firstTrapeziumHeight = 3.25f;     //podać lub obliczyć z rzędnych
    float firstTrapeziumArmSlope1;
    float firstTrapeziumArmSlope2;
    float firstTrapeziumArmLenght1;
    float firstTrapeziumArmLength2;
    float firstTrapeziumBottomOrdinate1;
    float firstTrapeziumBottomOrdinate2;
    float firstTrapeziumTopOrdinate1;
    float firstTrapeziumTopOrdinate2;


    float firstTrapeziumHeightFromOrdinates = ((firstTrapeziumTopOrdinate1 + firstTrapeziumTopOrdinate2)/2) - ((firstTrapeziumBottomOrdinate1 + firstTrapeziumBottomOrdinate2)/2);
    float firstTrapeziumArea = ((firstTrapeziumBottomBase + firstTrapeziumTopBase)*firstTrapeziumHeight)/2;

}
