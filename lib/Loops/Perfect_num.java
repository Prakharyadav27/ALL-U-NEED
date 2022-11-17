public class Perfect_num {
    public static void main(String[] args) {
        int factors , num = 6 , sum=0 ;
        System.out.println("Factors :~ ");
        for (int i = 1; i < num; i++) {
            if (num%i==0) {
                System.out.println(i);
                sum +=i;
            }
        }       
        System.out.println(sum);
        if (sum==num) {
            System.out.println("Perfect");
        }else{
            System.out.println("Nahhhhhh");
        }
    }
}
