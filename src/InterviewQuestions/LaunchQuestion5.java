package InterviewQuestions;

class CheckPrime {

    // most efficient way
    public boolean isPrime(int num) {
        if (num <= 1) return false;
        if (num <= 3) return true;

        if (num % 2 == 0 || num % 3 == 0) return false;
        for (int i = 5; i * i <= num ; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0){
                return false;
            }
        }
        return true;
    }
}

public class LaunchQuestion5 {
    public static void main(String[] args) {
     CheckPrime checkPrime = new CheckPrime();
     int n = 17;
     boolean result = checkPrime.isPrime(n);

     if (result){
         System.out.println("Prime");
     }
     else {
         System.out.println("Not Prime");
     }
    }
}
