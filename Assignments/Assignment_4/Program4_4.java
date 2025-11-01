///////////////////////////////////////////////////////////
//
// Function Name : printDigits
// Description :   Prints each digit of a number separately
// Input :         int
// Output :        void (Prints the digits)
// Author :        Rushikesh baban dhande
// Date :          31/10/2025
//
///////////////////////////////////////////////////////////

class Logic {
    void printDigits(int num) { 
        if (num < 0) {
            num = -num;
        }

        if (num == 0) {
            System.out.println(0);
            return;
        }

        System.out.println("Digits are:");
        while (num > 0) {
            int digit = num % 10; // Get the last digit
            System.out.println(digit);
            num = num / 10; // Remove the last digit
        }
    }
}

class Program4_4 {
    public static void main(String A[]) {
        Logic obj = new Logic();
        obj.printDigits(9876);
    }
}
