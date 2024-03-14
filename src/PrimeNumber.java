import java.util.Scanner;

public class PrimeNumber {
    private static boolean isPrimeNumber(int n){
        //isPrimeNumber = true;
        if(n < 2){
            //isPrimeNumber = false;
            return false;
        }else {
            for(int i=2; i*i <= n; i=i+1){
                if(n % i == 0){
//                    isPrimeNumber = false;
//                    break;
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        boolean isPrimeNumber = true;
        Scanner scanner = new Scanner(System.in);
        int numberStart = scanner.nextInt();
        int numberEnd = scanner.nextInt();

        if(numberStart > numberEnd){
            int temp = numberStart;
            numberStart = numberEnd;
            numberEnd = temp;
        }

        for(int k = numberStart; k <= numberEnd; k++){
            if(isPrimeNumber(k)) System.out.print(k + " ");
        }
    }
}
