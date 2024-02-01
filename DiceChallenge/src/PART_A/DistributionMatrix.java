package DiceChallenge.src.PART_A;

import java.util.*;

public class DistributionMatrix {

    //This for printing the matrix 
    private static void printMatrix(int[][] matrix) {
        for (int i=0;i<matrix.length;i++) {
            for (int j=0;j<matrix[0].length;j++) {
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }
    }

    private static int[][] generateDistributionMatrix(int faces){
        // as it will form matric , I take [6][6] matric here as their two die and faces are 6
        int[][]matrix = new int [faces][faces];
        for(int i=0;i<faces;i++){
            for(int j=0;j<faces;j++){
                //as matric follow 0 base indexing we have to add +1 and then we jus adding the sum
                // for 1st row 1 st colom  i=0, j=0 so its give (0+1)+(0+1) = 2;
                matrix[i][j] = (i+1)+(j+1);
            }
        }
        return matrix;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Here user should give number of faces , in this case it should be 6
        System.out.println("Enter the number of faces on the dice: ");
        int faces = sc.nextInt();
        int[][]distributionMatrix = generateDistributionMatrix(faces);
        printMatrix(distributionMatrix);
        sc.close();
    }
}
