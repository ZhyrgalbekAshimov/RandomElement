import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        HashSet<String> set = new HashSet<>();

        System.out.println("Enter 10 cities:");
        int numberOfCity = 1;

        for (int i = 0; i <10; i++){

            System.out.print(numberOfCity + ") ");
            set.add(scan.nextLine());
            numberOfCity++;

        }

        int randomNumber = new Random().nextInt(set.size());
        int counter = 0;

        for (String str : set) {
            if (counter == randomNumber) {
                System.out.println("Random element: " + str);
            }
            counter++;
        }

    }
}