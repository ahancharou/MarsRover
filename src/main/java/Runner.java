import NASA.NasaRover;

import java.util.Scanner;

public class Runner {

    public static void main (String[] args) {
        NasaRover explorer = new NasaRover();

        boolean found = false;
        Scanner keyboard = new Scanner(System.in);
        int[] coordinates;
        while (true){
            coordinates = explorer.getCoordinates();

            System.out.println("We are at "+ coordinates[0]+ ' ' + coordinates[1]);
            System.out.println("New coordinates:");
            System.out.print("a: ");
            int a = keyboard.nextInt();
            System.out.print("b: ");
            int b = keyboard.nextInt();
            int [] target = {a,b};
            found = explorer.move(target);
            System.out.println();
            if (found) {
                break;
            }
            System.out.println("Found only dust =(");
        }

        coordinates = explorer.getCoordinates();
        System.out.println("Rover found scrap! Coordinates "+ coordinates[0] + ' ' + coordinates[1]);
    }
}
