import java.util.InputMismatchException;
import java.util.Scanner;

public class Runner {
    private static void log(String message) {
        System.out.println(message);
    }

    public static void main(String[] args) {
        // your code here
        CanFly userBird = getUserBird();
        int monsterSpeed = getMonsterSpeed();

        int birdSpeed = userBird.fly();
        if (birdSpeed > monsterSpeed) {
            log(" Winner! Your bird was fast enough to escape");
        } else {
            log(" Loser! Your bird was not fast enough to escape :-(");
        }
    }

    private static CanFly getUserBird() {
        Scanner inputScanner = new Scanner(System.in);
        while (true) {
            log("Please enter the type of bird you would like");
            log("1. Eagle");
            log("2. Ostrich");
            log("3. Owl");

            try {
                int userSelection = inputScanner.nextInt();
                if (userSelection == 1) {
                    return new Eagle();
                } else if (userSelection == 2) {
                    // return new Ostrich();
                    System.out.println("This is a trap. Ostrichs do not fly. Let's try again.");
                } else if (userSelection == 3) {
                    return new Owl();
                } else {
                    throw new InputMismatchException("Values must be either 1, 2 or 3");
                }
            } catch (InputMismatchException inputException) {
                inputScanner.nextLine(); // clear the invalid input
                log("Invalid input - " + inputException.getMessage());
            }
        }
    }

    private static int getMonsterSpeed() {
        Scanner inputScanner = new Scanner(System.in);
        while (true) {
            log("How fast can the monster fly (in mph)?");
            try {
                int monsterSpeed = inputScanner.nextInt();
                return monsterSpeed;
            } catch (InputMismatchException inputException) {
                inputScanner.nextLine(); // clear the invalid input
                log("Invalid input - " + inputException.getMessage());
            }
        }
    }
}
