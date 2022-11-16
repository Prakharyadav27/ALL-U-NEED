public class Factorial {
    public static void main(String[] args) {
        int num=5,Fact=1 ;
        for (int i = 1; i < num; i++) {
            Fact = Fact*i;
        }
        System.out.println(Fact);
    }
}
