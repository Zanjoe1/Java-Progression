/*Create a Java program that asks the user to enter the size of an array and its elements, then
displays the original array and the reversed array.*/

import java.util.Scanner;

public class reverseArray{
    public static void main(String[]args){
        Scanner ui = new Scanner(System.in);

        System.out.println("Input array size/length");
        int num = ui.nextInt();
        System.out.println(); 

        int [] array = new int[num];
        
        for(int i = 0; i < array.length; i++ ){
            System.out.print("Input for index [" + i + "]" + " ");
            array[i] = ui.nextInt();
        }

        System.out.println("\nOriginal Array: ");
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }

        System.out.println("\nReverse Array:");
        for(int i = array.length - 1; i >= 0; i-- ){
            System.out.print(array[i] + " ");
        }

    }
}
