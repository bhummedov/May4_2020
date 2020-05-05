package Recursion;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(fact(3));
    }
    public static double fact(int number){
        if(number==1){
            return 1;
        }
        else{
            return number*fact(number-1);
        }
    }
}
