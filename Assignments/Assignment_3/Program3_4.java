///////////////////////////////////////////////////////////
//
// Function Name : sumEvenOddDigits
// Description :   Finds the sum of even and odd digits separately
// Input :         int
// Output :        void (Prints the sums)
// Author :        Rushikesh baban dhande
// Date :          01/11/2025
//
///////////////////////////////////////////////////////////

class Logic {
    void sumEvenOddDigits(int num) { 
        int evenSum = 0;
        int oddSum = 0;
        int digit = 0;

        // Handle negative numbers by making them positive
        if (num < 0) {
            num = -num;
        }

        // Handle 0 as a special case (even)
        if (num == 0) {
            evenSum = 0;
        }

         while (num > 0) {
            digit = num % 10; // Get the last digit

            if (digit % 2 == 0) {
                evenSum += digit; // Add to even sum
            } else {
                oddSum += digit; // Add to odd sum
            }

            num = num / 10; // Remove the last digit
        }

        System.out.println("Sum of even digits: " + evenSum);
        System.out.println("Sum of odd digits: " + oddSum);
    }
}

class Program3_4 {
    public static void main(String A[]) {
        Logic obj = new Logic();
        obj.sumEvenOddDigits(123456);
    }
}
