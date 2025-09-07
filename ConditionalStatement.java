import java.util.Scanner;
public class ConditionalStatement {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number :");
        int a = input.nextInt();
        System.out.println("Enter the second number :");
        int b = input.nextInt();
        System.out.println("Enter the third number :");
        int c = input.nextInt();
        if(a > b && a > c){
            System.out.println("The largest among the three is : "+a);
        }else if(b>c){
            System.out.println("The largest among the three is : "+b);
        }else{
            System.out.println("The largest among the three is : "+c);
        }
        input.close();
    }
}