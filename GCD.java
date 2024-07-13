public class GCD {
    public static int findGCD(int a,int b){
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static void main(String[] args){
         int num1 = 50;
         int num2 = 5;
         System.out.println("the gcd of num1 and num2 is "+findGCD(num1,num2));
        
    }
    
}
