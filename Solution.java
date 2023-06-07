import java.io.*;
import java.util.* ;

public class Solution {
    public static void setZeros(int matrix[][]) {
        // Write your code here..
        int x = matrix.length;

        int y =matrix[0].length;

        int[] row = new int[x];

        int[] col = new int[y];

        for(int i=0;i<x;i++) row[i]=0;

        for(int i=0;i<y;i++) col[i]=0;

        for(int i=0;i<x;i++){

            for(int j=0;j<y;j++){

                if(matrix[i][j]==0){

                    row[i] = 1;

                    col[j] = 1;

                }

            }

        }

        for(int i=0;i<x;i++){

            for(int j=0;j<y;j++){

                if(row[i]==1 || col[j]==1){

                    matrix[i][j] = 0;

                }

            }

        }


        
    }

}