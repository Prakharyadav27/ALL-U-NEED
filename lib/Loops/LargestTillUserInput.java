import java.util.Scanner;

public class LargestTillUserInput {
    public static void main(String[] args) {
        int input=1;
        int max = input;
        Scanner sc = new Scanner(System.in);
        while (input!=0) {
            input  = sc.nextInt();
            if (input>max) {
                max =input;
            }
        }System.out.println(max);
    }
}
