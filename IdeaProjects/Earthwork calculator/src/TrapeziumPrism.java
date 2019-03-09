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



}

