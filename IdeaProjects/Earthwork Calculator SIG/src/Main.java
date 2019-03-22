import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean programIsRunning = true;
        boolean triangularTypeChosen = true;
        boolean trapezoidalTypeChosen = true;
        TrianglePrism dataInputForTriangleFromUser = new TrianglePrism();
        TrapeziumPrism dataInputForTrapeziumFromUser = new TrapeziumPrism();
        CalculatingMethodsForTrianglePrism solutionForTrianglePrism = new CalculatingMethodsForTrianglePrism();

        while (programIsRunning) {
            MenuToDisplay.DisplayMainMenu();
            int choseTypeOfTrench = scanner.nextInt();

            switch (choseTypeOfTrench) {
                case 1:
                    System.out.println("You have selected triangular type of trench");
                    while (triangularTypeChosen) {
                        MenuToDisplay.DisplayMenuWithCalculatingMethodsForTriangularTrench();
                        int chooseTriangularCalculatingMethods = scanner.nextInt();

                        switch (chooseTriangularCalculatingMethods) {
                            case 1:
                                System.out.println("You have selected: Average cross - section method");
                                System.out.println("Please set variables to calculate");
                                System.out.println("----------------------------------------------------- ");
                                System.out.println("Beginning chainage of the trench in meters and with '.'(dot)");
                                dataInputForTriangleFromUser.setTrianglePrismBeginningChainage(scanner.next());
                                System.out.println("Closing chainage of the trench in meters and with '.'(dot)");
                                dataInputForTriangleFromUser.setTrianglePrismClosingChainage(scanner.next());
                                System.out.println("Length of the trench from set chainage: ");
                                System.out.println("First triangular cross - section variables");
                                System.out.println("Bottom ordinate of first triangular cross - section");
                                dataInputForTriangleFromUser.setFirstTriangleBottomOrdinate1(scanner.nextFloat());
                                System.out.println("Top ordinate of first triangular cross - section (1)");
                                dataInputForTriangleFromUser.setFirstTriangleTopOrdinate1(scanner.nextFloat());
                                System.out.println("Top ordinate of first triangular cross - section (2)");
                                dataInputForTriangleFromUser.setFirstTriangleTopOrdinate2(scanner.nextFloat());
                                System.out.println("Height of first triangular cross - section");
                                dataInputForTriangleFromUser.setFirstTriangleHeight(scanner.nextFloat());
                                System.out.println("Top width of first triangular cross - section");
                                dataInputForTriangleFromUser.setFirstTriangleTopBase(scanner.nextFloat());
                                System.out.println("Second triangular cross - section variables");
                                System.out.println("Bottom ordinate of second triangular cross - section");
                                dataInputForTriangleFromUser.setSecondTriangleBottomOrdinate1(scanner.nextFloat());
                                System.out.println("Top ordinate of second triangular cross - section (1)");
                                dataInputForTriangleFromUser.setSecondTriangleTopOrdinate1(scanner.nextFloat());
                                System.out.println("Top ordinate of second triangular cross - section (2)");
                                dataInputForTriangleFromUser.setSecondTriangleTopOrdinate2(scanner.nextFloat());
                                System.out.println("Height of second triangular cross - section");
                                dataInputForTriangleFromUser.setSecondTriangleHeight(scanner.nextFloat());
                                System.out.println("Top width of second triangular cross - section");
                                dataInputForTriangleFromUser.setSecondTriangleTopBase(scanner.nextFloat());
                                System.out.println("Volume of earthwork: " + solutionForTrianglePrism.AverageCrossSectionMethodForTrianglePrism() + "m3");
                                break;
                            case 2:
                                System.out.println("You have selected: Medial cross - section method");
                                System.out.println("Please set variables to calculate");
                                System.out.println("----------------------------------------------------- ");
                                System.out.println("Beginning chainage of the trench in meters and with '.'(dot)");
                                dataInputForTriangleFromUser.setTrianglePrismBeginningChainage(scanner.next());
                                System.out.println("Closing chainage of the trench in meters and with '.'(dot)");
                                dataInputForTriangleFromUser.setTrianglePrismClosingChainage(scanner.next());
                                System.out.println("Medial triangular cross - section variables");
                                System.out.println("Bottom ordinate of medial triangular cross - section");
                                dataInputForTriangleFromUser.setMedialTriangleBottomOrdinate1(scanner.nextFloat());
                                System.out.println("Top ordinate of medial triangular cross - section (1)");
                                dataInputForTriangleFromUser.setMedialTriangleTopOrdinate1(scanner.nextFloat());
                                System.out.println("Top ordinate of medial triangular cross - section (2)");
                                dataInputForTriangleFromUser.setMedialTriangleTopOrdinate2(scanner.nextFloat());
                                System.out.println("Height of medial triangular cross - section");
                                dataInputForTriangleFromUser.setMedialTriangleHeight(scanner.nextFloat());
                                System.out.println("Top width of medial triangular cross - section");
                                dataInputForTriangleFromUser.setMedialTriangleTopBase(scanner.nextFloat());
                                System.out.println("Volume of earthwork: " + solutionForTrianglePrism.MedialCrossSectionMethodForTrianglePrism() + "m3");
                                break;
                            case 0:
                                System.out.println("You have selected: Get back to trench type selection");
                                triangularTypeChosen = false;
                                break;
                            default:
                                System.out.println("Wrong button! Please select method of calculation");
                                break;
                        }
                    }
                    break;
                case 2:
                    System.out.println("You have selected trapezoidal type of trench");
                    while (trapezoidalTypeChosen) {
                        MenuToDisplay.DisplayMenuWithCalculatingMethodsForTrapezoidalTrench();
                        int chooseTrapezoidalCalculatingMethods = scanner.nextInt();

                        switch (chooseTrapezoidalCalculatingMethods) {
                            case 1:
                                System.out.println("You have selected: Average cross - section method");
                                System.out.println("Please set variables to calculate");
                                System.out.println("----------------------------------------------------- ");
                                System.out.println("Beginning chainage of the trench in meters and with '.'(dot)");
                                dataInputForTrapeziumFromUser.setTrapeziumPrismBeginningChainage(scanner.next());
                                System.out.println("Closing chainage of the trench in meters and with '.'(dot)");
                                dataInputForTrapeziumFromUser.setTrapeziumPrismClosingChainage(scanner.next());
                                System.out.println("Length of the trench from set chainage: ");
                                System.out.println("First trapezoidal cross - section variables");
                                System.out.println("Bottom ordinate of first trapezoidal cross - section (1)");
                                dataInputForTrapeziumFromUser.setFirstTrapeziumBottomOrdinate1(scanner.nextFloat());
                                System.out.println("Bottom ordinate of first trapezoidal cross - section (2)");
                                dataInputForTrapeziumFromUser.setFirstTrapeziumBottomOrdinate2(scanner.nextFloat());
                                System.out.println("Top ordinate of first trapezoidal cross - section (1)");
                                dataInputForTrapeziumFromUser.setFirstTrapeziumTopOrdinate1(scanner.nextFloat());
                                System.out.println("Top ordinate of first trapezoidal cross - section (2)");
                                dataInputForTrapeziumFromUser.setFirstTrapeziumTopOrdinate2(scanner.nextFloat());
                                System.out.println("Height of first trapezoidal cross - section");
                                dataInputForTrapeziumFromUser.setFirstTrapeziumHeight(scanner.nextFloat());
                                System.out.println("Top width of first trapezoidal cross - section");
                                dataInputForTrapeziumFromUser.setFirstTrapeziumTopBase(scanner.nextFloat());
                                System.out.println("Bottom width of first trapezoidal cross - section");
                                dataInputForTrapeziumFromUser.setFirstTrapeziumBottomBase(scanner.nextFloat());
                                System.out.println("Second trapezoidal cross - section variables");
                                System.out.println("Bottom ordinate of second trapezoidal cross - section (1)");
                                dataInputForTrapeziumFromUser.setSecondTrapeziumBottomOrdinate1(scanner.nextFloat());
                                System.out.println("Bottom ordinate of second trapezoidal cross - section (2)");
                                dataInputForTrapeziumFromUser.setSecondTrapeziumBottomOrdinate2(scanner.nextFloat());
                                System.out.println("Top ordinate of second trapezoidal cross - section (1)");
                                dataInputForTrapeziumFromUser.setSecondTrapeziumTopOrdinate1(scanner.nextFloat());
                                System.out.println("Top ordinate of second trapezoidal cross - section (2)");
                                dataInputForTrapeziumFromUser.setSecondTrapeziumTopOrdinate2(scanner.nextFloat());
                                System.out.println("Height of second trapezoidal cross - section");
                                dataInputForTrapeziumFromUser.setSecondTrapeziumHeight(scanner.nextFloat());
                                System.out.println("Top width of second trapezoidal cross - section");
                                dataInputForTrapeziumFromUser.setSecondTrapeziumTopBase(scanner.nextFloat());
                                System.out.println("Bottom width of second trapezoidal cross - section");
                                dataInputForTrapeziumFromUser.setSecondTrapeziumBottomBase(scanner.nextFloat());
                                System.out.println("Volume of earthwork: " + solutionForTrapeziumPrism.AverageCrossSectionMethodForTrapeziumPrism() + "m3");
                                break;
                            case 2:
                                System.out.println("You have selected: Medial cross - section method");
                                System.out.println("Please set variables to calculate");
                                System.out.println("----------------------------------------------------- ");
                                System.out.println("Medial trapezoidal cross - section variables");
                                System.out.println("Bottom ordinate of medial trapezoidal cross - section (1)");
                                dataInputForTrapeziumFromUser.setMedialTrapeziumBottomOrdinate1(scanner.nextFloat());
                                System.out.println("Bottom ordinate of medial trapezoidal cross - section (2)");
                                dataInputForTrapeziumFromUser.setMedialTrapeziumBottomOrdinate2(scanner.nextFloat());
                                System.out.println("Top ordinate of medial trapezoidal cross - section (1)");
                                dataInputForTrapeziumFromUser.setMedialTrapeziumTopOrdinate1(scanner.nextFloat());
                                System.out.println("Top ordinate of medial trapezoidal cross - section (2)");
                                dataInputForTrapeziumFromUser.setMedialTrapeziumTopOrdinate2(scanner.nextFloat());
                                System.out.println("Height of medial trapezoidal cross - section");
                                dataInputForTrapeziumFromUser.setMedialTrapeziumHeight(scanner.nextFloat());
                                System.out.println("Top width of medial trapezoidal cross - section");
                                dataInputForTrapeziumFromUser.setMedialTrapeziumTopBase(scanner.nextFloat());
                                System.out.println("Bottom width of medial trapezoidal cross - section");
                                dataInputForTrapeziumFromUser.setMedialTrapeziumBottomBase(scanner.nextFloat());
                                System.out.println("Volume of earthwork: " + solutionForTrapeziumPrism.AverageCrossSectionMethodForTrapeziumPrism() + "m3");
                                break;
                            case 3:
                                System.out.println("You have selected: Simpson method");
                                System.out.println("Please set variables to calculate");
                                System.out.println("----------------------------------------------------- ");
                                System.out.println("Medial trapezoidal cross - section variables");
                                System.out.println("Top width of the trench");
                                dataInputForTrapeziumFromUser.setTrapeziumPrismVariableAForTopSurfaceAreaForSimpsonMethod(scanner.nextFloat());
                                System.out.println("Top length of the trench");
                                dataInputForTrapeziumFromUser.setTrapeziumPrismVariableBForTopSurfaceAreaForSimpsonMethod(scanner.nextFloat());
                                System.out.println("Bottom width of the trench");
                                dataInputForTrapeziumFromUser.setTrapeziumPrismVariableCForBottomSurfaceAreaForSimpsonMethod(scanner.nextFloat());
                                System.out.println("Bottom length of the trench");
                                dataInputForTrapeziumFromUser.setTrapeziumPrismVariableDForBottomSurfaceAreaForSimpsonMethod(scanner.nextFloat());
                                System.out.println("Bottom ordinate of the trench (1)");
                                dataInputForTrapeziumFromUser.setTrapeziumPrismBottomOrdinate1ForSimpsonMethod(scanner.nextFloat());
                                System.out.println("Bottom ordinate of the trench (2)");
                                dataInputForTrapeziumFromUser.setTrapeziumPrismBottomOrdinate2ForSimpsonMethod(scanner.nextFloat());
                                System.out.println("Top ordinate of the trench (1)");
                                dataInputForTrapeziumFromUser.setTrapeziumPrismTopOrdinate1ForSimpsonMethod(scanner.nextFloat());
                                System.out.println("Top ordinate of the trench (2)");
                                dataInputForTrapeziumFromUser.setTrapeziumPrismTopOrdinate2ForSimpsonMethod(scanner.nextFloat());
                                System.out.println("Height of the trench");
                                dataInputForTrapeziumFromUser.setTrapeziumPrismHeightForSimpsonMethod(scanner.nextFloat());
                                System.out.println("Volume of earthwork: " + solutionForTrapeziumPrism.AverageCrossSectionMethodForTrapeziumPrism() + "m3");
                                break;
                            case 0:
                                System.out.println("You have selected: Get back to trench type selection");
                                trapezoidalTypeChosen = false;
                            default:
                                System.out.println("Wrong button! Please select method of calculation");
                                break;
                        }
                    }
                case 0:
                    System.out.println("Program is closing");
                    programIsRunning = false;
                    break;
                default:
                    System.out.println("Wrong button! Please select 1 or 2.");
                    break;
            }
        }
    }
}

