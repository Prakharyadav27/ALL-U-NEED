public class VotingEligibilty {
    public static void main(String[] args) {
        Check(45);
    }



    static void Check(int age){
        if (age>=18) {
            System.out.println("ELIGIBLE");
        } else {
            System.out.println("Nahhhhhh");
        }
    }
}
