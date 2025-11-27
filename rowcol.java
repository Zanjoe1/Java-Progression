import java.util.Scanner;

public class rowcol{
    public static void main(String[]args){
        Scanner ui = new Scanner(System.in);
        System.out.println("number of rows");
        int row = ui.nextInt();

        System.out.println("Number of column");
        int col = ui.nextInt();

        int [][] arr = new int[row][col];
        int sum = 0;

        for(int i = 0; i < row; i++){
            
            int i2 = 0;
            while (i2 < col){
                System.out.println("enter value for " + "[" + i +"]" + "[" + i2 +"]");
                arr[i][i2] = ui.nextInt();
                sum += arr[i][i2];
                i2++;
            }
        }

        System.out.println("\nMatrix:");
        for(int i = 0; i < row; i++){
            for(int i2 = 0; i2 < col; i2++){
                System.out.print(arr[i][i2] + " ");
            }
            System.out.println("");
        }

        System.out.println("\nsum of all is " + sum);
    }
}