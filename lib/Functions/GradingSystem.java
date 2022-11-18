public class GradingSystem {
    public static void main(String[] args) {
    Grades(86);        
    }

   /* Marks        Grade 
    91-100         AA 
    81-90          AB 
    71-80          BB 
    61-70          BC 
    51-60          CD 
    41-50          DD 
    <=40          Fail */

    static void Grades(int score){
        if (score>=91&&score<=100) {
            System.out.println("AA");
        }else if (score>=81&&score<=90) {
            System.out.println("AB");
        }else if(score>=71&&score<=80){
            System.out.println("BB");
        }else if (score>=61&&score<=70) {
            System.out.println("BC");
        }else if (score>=51&&score<=60) {
            System.out.println("CD");
        }else if (score>=41&&score<=50) {
            System.out.println("DD");
        }else if (score<=40) {
            System.out.println("Fail");
        }
        
    }
}
