package DiceChallenge.src.PART_A;

import java.util.*;

public class ProbabilityCalculator {

    // it's calculate the probablity 
    private static double [][] calculateProbability(int faces){
        // here we define the size of matrix. Here faces is 6, the (6*2-1) = 11, i.e Matrix is [11][2].
        double [][] probabilityMatrix = new double [faces*2 - 1][2];
        //As minimum possible sum by two dice is 1+1=2 and Maximum possible sum (6+6)=12 so we run a loop
        for(int sum = 2; sum <= 2*faces; sum++){
            //This line is calculate that how many times a particular sum came.
            int count = Math.min(sum-1, 2*faces - sum+1);
            // for that particlar sum its calculate probability
            double probability = (double) count / (faces*faces);
            //as matrix is 0 bas indexing and sum starts from 2 so we did -2 in each case and 1st strore sum 
            probabilityMatrix [sum-2][0] = sum;
            //its store probability
            probabilityMatrix [sum-2][1] = probability;
        }
        return probabilityMatrix;
    }

    // this is just for printing the output parfectly.
    private static void printProbabilities(double [][] probabilityMatrix){
        for(int i=0;i<probabilityMatrix.length;i++){
            System.out.println("P(Sum = " + (int) probabilityMatrix[i][0] + ") = " + probabilityMatrix[i][1]);
        }
    }


    //This is the Main function take input that how main face are their, As is Dice you should give 6
    public static void main (String[]args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number of faces on the dice: ");
        int faces = sc.nextInt();
        // call calculateProbability function and pass the number of faces.
        double [][] probabilityMatrix = calculateProbability(faces);
        System.out.println("Probability of Sums:");
        printProbabilities(probabilityMatrix);
        sc.close();
    }
}
