import java.util.Scanner;
public class Factorial {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = input.nextInt();
        for(int i = n-1; i >= 1; i--){
            n *= i;
        }
        System.out.println("The factorial is : "+n);
        input.close();
    }
}
