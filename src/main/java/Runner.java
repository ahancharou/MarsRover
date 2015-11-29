import Aliens.Scrap;
import NASA.NasaRover;
import NASA.RoverI;

import java.util.Scanner;

public class Runner {

    public static void main (String[] args) {

        Scrap scrap = new Scrap();
        RoverI explorer = new NasaRover();

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
            found = explorer.move(a,b);
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
