///////////////////////////////////////////////////////////
//
// Function Name : checkPrime
// Description :   Checks if a number is prime or not
// Input :         int
// Output :        void (Prints the result)
// Author :        Rushikesh baban dhande
// Date :          01/11/2025
//
///////////////////////////////////////////////////////////

class Logic {
    void checkPrime(int num) {
        boolean isPrime = true;

        // 0 and 1 are not prime numbers
        // Negative numbers are not prime
        if (num <= 1) {
            isPrime = false;
        } else {
            // Check for factors from 2 up to num/2
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    // If a factor is found, it's not prime
                    isPrime = false;
                    break;
                }
            }
        }

        // Print the result
        if (isPrime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }
}

class Program3_1 {
    public static void main(String A[]) {
        Logic obj = new Logic();
        obj.checkPrime(11);
    }
}
