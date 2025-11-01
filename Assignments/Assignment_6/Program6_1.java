///////////////////////////////////////////////////////////
//
// Function Name : productOfDigits
// Description :   Calculates the product of digits of a number
// Input :         int (num)
// Output :        void (Prints the product)
// Author :        Rushikesh baban dhande
// Date :          01/11/2025
//
///////////////////////////////////////////////////////////

class Logic {
    void productOfDigits(int num) {
        long product = 1; // Use long to avoid overflow for large products
        int digit = 0;

        // Handle negative numbers by using their absolute value
        if (num < 0) {
            num = -num;
        }

        // Handle the case of num = 0
        if (num == 0) {
            product = 0;
        }

        while (num > 0) {
            digit = num % 10;

            // If any digit is 0, the whole product becomes 0
            if (digit == 0) {
                product = 0;
                break;
            }

            product = product * digit; // Multi plication

            num = num / 10;
        }

        System.out.println("The product of digits is: " + product);
    }
}

class Program6_1 {
    public static void main(String A[]) {
        Logic obj = new Logic();
        obj.productOfDigits(234);
    }
}
