public class oopProblemSolve {

    public double squareSum(double num1, double num2, double num3) {
        double numb1= num1*num1;
        double numb2= num2*num2;
        double numb3= num3*num3;
    
        double sum = numb1 + numb2 + numb3;
    
        
    
        return sum;
      }


    public static void main(String[] args) {
        oopProblemSolve s= new oopProblemSolve() ;


        System.out.println(s.squareSum(5, 6, 7));

    }
}
