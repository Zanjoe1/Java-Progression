import java.util.Scanner;

public class reverse{
    public static void main(String[]args){
        Scanner ui = new Scanner(System.in);
        System.out.println("Input a string");
        String input = ui.nextLine();
        String rev = "";

        for(int i = input.length() - 1; i >= 0; i-- ){
            rev += input.charAt(i);
        }

        System.out.println(rev);
    }
}