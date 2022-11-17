import java.util.Scanner;

public class MaxOfAll_Inputs {
    public static void main(String[] args) {
        MaxInput(1, 2, 3);
    }

static void MaxInput(int input1, int input2, int input3) {
        int max = 0;
        if (max < input1) {
            max = input1;
        }
        if (max < input2) {
            max = input2;
        }
        if (max < input3) {
            max = input3;
        }
        System.out.println(max);
    }
}
