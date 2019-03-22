public class FirstTrapezium {

    private TrapeziumPrism inputDataOne = new TrapeziumPrism();

    public float SolveForFirstTrapezium() {

        float solutionForFirstTrapezium;
        float firstTrapeziumHeightFromOrdinates;
        float firstTrapeziumAreaFromOrdinatesDifference;

        if (inputDataOne.getFirstTrapeziumHeight() <= 0) {
            firstTrapeziumHeightFromOrdinates = (((inputDataOne.getFirstTrapeziumTopOrdinate1() + inputDataOne.getFirstTrapeziumTopOrdinate2()) / 2) - ((inputDataOne.getFirstTrapeziumBottomOrdinate1() + inputDataOne.getFirstTrapeziumBottomOrdinate2())) / 2);
            firstTrapeziumAreaFromOrdinatesDifference = ((inputDataOne.getFirstTrapeziumTopBase() + inputDataOne.getFirstTrapeziumBottomBase()) * firstTrapeziumHeightFromOrdinates) / 2;
            solutionForFirstTrapezium = firstTrapeziumAreaFromOrdinatesDifference;
        } else {
            float firstTrapeziumArea = ((inputDataOne.getFirstTrapeziumTopBase() + inputDataOne.getFirstTrapeziumBottomBase()) * inputDataOne.getFirstTrapeziumHeight()) / 2;
            solutionForFirstTrapezium = firstTrapeziumArea;
        }
        return solutionForFirstTrapezium;
    }
}