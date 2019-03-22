public class SecondTrapezium {

    private TrapeziumPrism inputDataTwo = new TrapeziumPrism();

    public float SolveForSecondTrapezium() {

        float solutionForSecondTrapezium;
        float secondTrapeziumHeightFromOrdinates;
        float secondTrapeziumAreaFromOrdinatesDifference;

        if (inputDataTwo.getSecondTrapeziumHeight() <= 0) {
            secondTrapeziumHeightFromOrdinates = (((inputDataTwo.getSecondTrapeziumTopOrdinate1() + inputDataTwo.getSecondTrapeziumTopOrdinate2()) / 2) - ((inputDataTwo.getSecondTrapeziumBottomOrdinate1() + inputDataTwo.getSecondTrapeziumBottomOrdinate2())) / 2);
            secondTrapeziumAreaFromOrdinatesDifference = ((inputDataTwo.getSecondTrapeziumTopBase() + inputDataTwo.getSecondTrapeziumBottomBase()) * secondTrapeziumHeightFromOrdinates) / 2;
            solutionForSecondTrapezium = secondTrapeziumAreaFromOrdinatesDifference;
        } else {
            float secondTrapeziumArea = ((inputDataTwo.getSecondTrapeziumTopBase() + inputDataTwo.getSecondTrapeziumBottomBase()) * inputDataTwo.getSecondTrapeziumHeight()) / 2;
            solutionForSecondTrapezium = secondTrapeziumArea;
        }
        return solutionForSecondTrapezium;
    }
}
