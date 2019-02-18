import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean programIsRunning = true;
        boolean triangularTypeChosen = true;
        boolean trapezoidalTypeChosen = true;

        while (programIsRunning) {
            MenuToDisplay.displayMainMenu();
            int radix = scanner.nextInt();

            switch (radix) {
                case 1:
                    System.out.println("You have selected triangular type of trench");
                    while (triangularTypeChosen) {
                        MenuToDisplay.displayMenuWithCalculatingMethods();
                        int radixTriangularCalculatingMethods = scanner.nextInt();

                        switch (radixTriangularCalculatingMethods) {
                            case 1:
                                System.out.println("You have selected: Average cross - section method");
                                System.out.println("Please set variables to calculate");
                                System.out.println(" ");
                                System.out.println("Beginning chainage of the trench");
                                System.out.println("Closing chainage of the trench");
                                System.out.println("First triangular cross - section variables");
                                System.out.println("Bottom ordinate of first triangular cross - section");

                                System.out.println("Top ordinate of first triangular cross - section (1)");
                                System.out.println("Top ordinate of first triangular cross - section (2)");
                                System.out.println("Top width of first triangular cross - section");
                                System.out.println("Height of first triangular cross - section");
                                System.out.println("Arm slope of first triangular cross - section(1)");
                                System.out.println("Arm slope of first triangular cross - section(2)");
                                System.out.println("Arm length of first triangular cross - section(1)");
                                System.out.println("Arm length of first triangular cross - section(2)");
                                break;
                            case 2:
                                System.out.println("You have selected: Simpson method");
                                break;
                            case 3:
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
                        MenuToDisplay.displayMenuWithCalculatingMethods();
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
