public class AlernatePrime{
    public static boolean isPrime(int n){
        if(n <= 1){
            return false;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void printAlternatePrime(int limit){
        int count = 0;
        for(int num = 1;num<=limit;num++){
           if (isPrime(num)){
                if(count % 2 == 0){
                    System.out.println(num+ " ");
                }
            }
            count++;
        }
    }
    public static void main(String[] args){
        int limit = 40;
        System.out.println("alternate prime numbers :");
        printAlternatePrime(limit);

    }
}