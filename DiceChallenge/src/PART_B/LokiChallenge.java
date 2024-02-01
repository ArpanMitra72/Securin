package DiceChallenge.src.PART_B;

import java.util.*;

public class LokiChallenge {

    //function to restore the DieA but keeping the same probability.
    public static HashSet<Integer> undoomDice(int[]diceA, int[]diceB) {
        int[]newDiceA = {4,4,4,4,4,4}; 
        //Die A cannot have more than 4 Spots on a face.
        //Die A may have multiple faces with the same number of spots.
        HashSet<Integer>originalProbabilities = Probabilitys(diceA,diceB);
        //calculate the probality with the new Die A and Die be as Die B can have as many spots on a face as necessary i.e. even more than 6. 
        HashSet<Integer>res = Probabilitys(newDiceA,diceB); 
        //check if the probaliti are same or not 
        boolean status = !originalProbabilities.equals(res); 
        int i=0;

        // Continue modifying Die A until the probabilities match the original probabilities
        while(!status) {
            //as Set to 4 since Die A cannot have more than 4 spots
            newDiceA[i]=4; 
            res = Probabilitys(newDiceA,diceB);
            status = !originalProbabilities.equals(res);
            i++;
        }

        //for print 
        System.out.println("New Die A = " + Arrays.toString(newDiceA));
        System.out.println("New Die B = " + Arrays.toString(diceB));
        return res;
    }

    // Function to calculate the set of sums by rolling two dice
    public static HashSet<Integer> Probabilitys(int[]diceA, int[]diceB) {
        Map<Integer,Integer> probabilitySumMap = new HashMap<>();

        // Iterate through all possible combinations of dice rolls
        for (int i=0;i<diceA.length;i++) {
            for (int j=0;j<diceB.length;j++) {
                int sum1 = diceA[i]+diceB[j];
                if (probabilitySumMap.containsKey(sum1)) {
                    probabilitySumMap.put(sum1, probabilitySumMap.get(sum1)+1);
                } else {
                    probabilitySumMap.put(sum1, 1);
                }
            }
        }

        // Return the set of sums
        return new HashSet<>(probabilitySumMap.keySet());
    }

    public static void main(String[] args) {
        int diceA[] = {1,2,3,4,5,6};
        int diceB[] = {1,2,3,4,5,6};
        undoomDice(diceA,diceB);
    }
}
