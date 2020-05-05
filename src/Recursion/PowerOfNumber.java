package Recursion;

public class PowerOfNumber {
    public static void main(String[] args) {
        System.out.println(powOfNumber(2,3));
    }
        public static int powOfNumber( int num1, int num2) {
            if ( num2 == 0 ) {
                return 1;
            }
            return ( num1 * powOfNumber(num1,num2-1));
        }
    }

