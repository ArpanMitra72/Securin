package DiceChallenge.src.PART_A;

import java.util.*;
public class TotalCombinations {
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);

        // give the number of faces and dice means 6 and 2 here.
        System.out.println("Enter the number of faces: ");
        int faces = sc.nextInt();
        System.out.println("Enter the total number of Dice: ");
        int totalNumberOfDice = sc.nextInt();

        // We know from Math formula as total possible combination for 2 die sum = (6^2) = 36.
        int TotalCombinationsPossible = (int)Math.pow(faces,totalNumberOfDice);

        System.out.println("Total Combinations: " + TotalCombinationsPossible);
        sc.close();
    }
}
