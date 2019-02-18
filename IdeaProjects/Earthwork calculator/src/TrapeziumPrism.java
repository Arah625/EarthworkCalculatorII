import java.util.Scanner;

public class TrapeziumPrism {
    Scanner scanner = new Scanner(System.in);
    float trapeziumPrismLenght;
    float trapeziumPrismSlope;
    float trapeziumPrismVariableAForTopSurfaceAreaForSimpsonMethod;
    float trapeziumPrismVariableBForTopSurfaceAreaForSimpsonMethod;
    float trapeziumPrismVariableCForBottomSurfaceAreaForSimpsonMethod;
    float trapeziumPrismVariableDForBottomSurfaceAreaForSimpsonMethod;
    String trapeziumPrismBeginningChainage = scanner.next();

    String trapeziumPrismClosingChainage;

    private float trapeziumPrismBottomSurfaceAreaForSimpsonMethod = trapeziumPrismVariableCForBottomSurfaceAreaForSimpsonMethod * trapeziumPrismVariableDForBottomSurfaceAreaForSimpsonMethod;
    private float trapeziumPrismTopSurfaceAreaForSimpsonMethod = trapeziumPrismVariableAForTopSurfaceAreaForSimpsonMethod * trapeziumPrismVariableBForTopSurfaceAreaForSimpsonMethod;
    private float trapeziumPrismMiddleSurfaceAreaForSimpsonMethod = (trapeziumPrismVariableAForTopSurfaceAreaForSimpsonMethod * trapeziumPrismVariableCForBottomSurfaceAreaForSimpsonMethod) * (trapeziumPrismVariableBForTopSurfaceAreaForSimpsonMethod * trapeziumPrismVariableDForBottomSurfaceAreaForSimpsonMethod);

    private FirstTrapezium firstTrapezium1 = new FirstTrapezium();

    private SecondTrapezium secondTrapezium1 = new SecondTrapezium();

    //metoda średniego przekroju
    float trapeziumPrismVolumeAverageCrossSectionnMethod = (float) (0.5 * (firstTrapezium1.firstTrapeziumArea + secondTrapezium1.secondTrapeziumArea) * trapeziumPrismLenght);


    //metoda Simpsona
    float trapeziumPrismVolumeSimpsonMethod = (float) ((trapeziumPrismLenght / 6) * (trapeziumPrismBottomSurfaceAreaForSimpsonMethod + trapeziumPrismTopSurfaceAreaForSimpsonMethod + 4 * trapeziumPrismMiddleSurfaceAreaForSimpsonMethod));


    //metoda środkowego przekroju
    float trapeziumPrismVolumeMedialCrossSectionMethod = (float) (((firstTrapezium1.firstTrapeziumArea + secondTrapezium1.secondTrapeziumArea) / 2) * trapeziumPrismLenght);


}

