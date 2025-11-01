///////////////////////////////////////////////////////////
//
// Function Name : findLargestDigit
// Description :   Finds the largest digit in a number
// Input :         int (num)
// Output :        void (Prints the largest digit)
// Author :        Rushikesh baban dhande
// Date :          01/11/2025
//
///////////////////////////////////////////////////////////

class Logic {
    void findLargestDigit(int num) {
        int largestDigit = 0;
        int currentDigit = 0;

        // Handle negative numbers by using their absolute value
        if (num < 0) {
            num = -num;
        }

        // Handle the case of num = 0
        if (num == 0) {
            largestDigit = 0;
        }

        while (num > 0) {
            currentDigit = num % 10; // Get the last digit

            if (currentDigit > largestDigit) {
                largestDigit = currentDigit;
            }

            if (largestDigit == 9) {
                break;
            }

            num = num / 10; // Remove the last digit
        }

        System.out.println("The largest digit is: " + largestDigit);
    }
}

class Program5_4 {
    public static void main(String A[]) {
        Logic obj = new Logic();
        obj.findLargestDigit(83429);
    }
}
