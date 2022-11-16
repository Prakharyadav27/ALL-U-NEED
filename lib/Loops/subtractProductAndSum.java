public class subtractProductAndSum {
    public static void main(String[] args) {
        int num = 234;
        int sum = 0;
        int product = 1;
        System.out.println(num%10);
        while(num>0){
             sum += num%10;
            product *= num%10;
             num/=10;
        }
    System.out.println(product-sum);
    }
    
}
