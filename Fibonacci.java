import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args){
        int a = 0;
        int b = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = input.nextInt();
        int temp;
        System.out.println(a);
        System.out.println(b);
        for(int i = 0; i <= n; i++){
            System.out.println(a+b);
            temp = a+b;
            a = b;
            b = temp;
        }
        input.close();
    }
    
}
