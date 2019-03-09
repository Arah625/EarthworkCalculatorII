import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner firstTriangleScanner = new Scanner(System.in);
        Scanner secondTriangleScanner = new Scanner(System.in);
        Scanner trianglePrismScanner = new Scanner(System.in);
        boolean programIsRunning = true;
        boolean triangularTypeChosen = true;
        boolean trapezoidalTypeChosen = true;

        while (programIsRunning) {
            MenuToDisplay.displayMainMenu();
            int choseTypeOfTrench = scanner.nextInt();

            switch (choseTypeOfTrench) {
                case 1:
                    System.out.println("You have selected triangular type of trench");
                    while (triangularTypeChosen) {
                        MenuToDisplay.DisplayMenuWithCalculatingMethodsForTriangularTrench();
                        int choseTriangularCalculatingMethods = scanner.nextInt();

                        switch (choseTriangularCalculatingMethods) {
                            case 1:
                                System.out.println("You have selected: Average cross - section method");
                                System.out.println("Please set variables to calculate");
                                System.out.println("----------------------------------------------------- ");
                                System.out.println("Beginning chainage of the trench in meters and with '.'(dot)");
                                String trianglePrismBeginningChainage = trianglePrismScanner.next();
                                System.out.println("Closing chainage of the trench in meters and with '.'(dot)");
                                String trianglePrismClosingChainage = trianglePrismScanner.next();
                                TrianglePrism solution = new TrianglePrism(trianglePrismBeginningChainage, trianglePrismClosingChainage);
                                System.out.println(solution.ConvertTrianglePrismStringChainageToFloatLength());
                                System.out.println("First triangular cross - section variables");
                                System.out.println("Bottom ordinate of first triangular cross - section");
                                float firstTriangleBottomOrdinate1 = firstTriangleScanner.nextFloat();
                                System.out.println("Top ordinate of first triangular cross - section (1)");
                                float firstTriangleTopOrdinate1 = firstTriangleScanner.nextFloat();
                                System.out.println("Top ordinate of first triangular cross - section (2)");
                                float firstTriangleTopOrdinate2 = firstTriangleScanner.nextFloat();
                                System.out.println("Height of first triangular cross - section");
                                float firstTriangleHeight = firstTriangleScanner.nextFloat();
                                System.out.println("Top width of first triangular cross - section");
                                float firstTriangleTopBase = firstTriangleScanner.nextFloat();
                                FirstTriangle solution1 = new FirstTriangle(firstTriangleBottomOrdinate1, firstTriangleTopOrdinate1, firstTriangleTopOrdinate2, firstTriangleHeight, firstTriangleTopBase);
                                System.out.println(solution1.SolveForFirstTriangle());
                                System.out.println("Second triangular cross - section variables");
                                System.out.println("Bottom ordinate of first triangular cross - section");
                                float secondTriangleBottomOrdinate1 = secondTriangleScanner.nextFloat();
                                System.out.println("Top ordinate of second triangular cross - section (1)");
                                float secondTriangleTopOrdinate1 = secondTriangleScanner.nextFloat();
                                System.out.println("Top ordinate of second triangular cross - section (2)");
                                float secondTriangleTopOrdinate2 = secondTriangleScanner.nextFloat();
                                System.out.println("Height of second triangular cross - section");
                                float secondTriangleHeight = secondTriangleScanner.nextFloat();
                                System.out.println("Top width of second triangular cross - section");
                                float secondTriangleTopBase = secondTriangleScanner.nextFloat();
                                SecondTriangle solution2 = new SecondTriangle(secondTriangleBottomOrdinate1, secondTriangleTopOrdinate1, secondTriangleTopOrdinate2, secondTriangleHeight, secondTriangleTopBase);
                                System.out.println(solution2.SolveForSecondTriangle());
                                break;
                            case 2:
                                System.out.println("You have selected: Medial cross - section method");
                                break;
                            case 0:
                                System.out.println("You have selected: Get back to main menu");
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
                        MenuToDisplay.DisplayMenuWithCalculatingMethodsForTriangularTrench();
                        int radixTrapezoidalCalculatingMethods = scanner.nextInt();

                        switch (radixTrapezoidalCalculatingMethods) {
                            case 1:
                                System.out.println("You have selected: Average cross - section method");
                                break;
                            case 2:
                                System.out.println("You have selected: Simpson method");
                                break;
                            case 3:
                                System.out.println("You have selected: Medial cross - section method");
                                break;
                            case 0:
                                System.out.println("You have selected: Get back to main menu");
                                trapezoidalTypeChosen = false;
                            default:
                                System.out.println("You have selected: Get back to main menu");
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
