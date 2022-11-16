import java.util.Scanner;
//Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)
public class SumTillUserInput {
    public static void main(String[] args) {
        int sum =0;
        Scanner sc = new Scanner(System.in); 
        int input=1;
        while (input!=0) {
            input = sc.nextInt();
            sum+=input;
        }
        System.out.println(sum);
    }
}
