import java.util.Scanner;

class main{
    public static void main(String[]args){
        Scanner ui = new Scanner(System.in);

        System.out.println("pick col");
        int col = ui.nextInt();

        System.out.println("pick row");
        int row = ui.nextInt();

        int [][] arr = new int[row][col];

        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                System.out.println("["+ i +"]" + "[" + j + "]");
                arr[i][j] = ui.nextInt();
            }
        }

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){

            }
        }
    }
}