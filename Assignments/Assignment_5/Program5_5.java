///////////////////////////////////////////////////////////
//
// Function Name : findSmallestDigit
// Description :   Finds the smallest digit in a number
// Input :         int (num)
// Output :        void (Prints the smallest digit)
// Author :        Rushikesh baban dhande
// Date :          31/10/2025
//
///////////////////////////////////////////////////////////

class Logic {
    void findSmallestDigit(int num) {
        int smallestDigit = 9;  
        int currentDigit = 0;

        // Handle negative numbers by using their absolute value
        if (num < 0) {
            num = -num;
        }

        // Handle the case of num = 0
        if (num == 0) {
            smallestDigit = 0;
        }

        // Loop through all digits
        while (num > 0) {
            currentDigit = num % 10; 
            if (currentDigit < smallestDigit) {
                smallestDigit = currentDigit;
            }

            // Stop if 0 is found, as it's the smallest possible
            if (smallestDigit == 0) {
                break;
            }

            num = num / 10; // Remove the last digit
        }

        System.out.println("The smallest digit is: " + smallestDigit);
    }
}

class Program5_5 {
    public static void main(String A[]) {
        Logic obj = new Logic();
        obj.findSmallestDigit(45872);
    }
}
