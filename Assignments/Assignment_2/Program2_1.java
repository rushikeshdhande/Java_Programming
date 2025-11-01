///////////////////////////////////////////////////////////
//
// Function Name : sumOfDigits
// Description :   Calculates the sum of digits of a given number
// Input :         int
// Output :        void (Prints the result)
// Author :        Rushikesh baban dhande
// Date :          31/10/2025
//
///////////////////////////////////////////////////////////

class Logic
{
    void sumOfDigits(int num)
    {
        // Write logic here
        int sum = 0;
        int remainder = 0;
        int originalNum = num; // Store original number for display

        // Handle negative numbers by making them positive
        if (num < 0)
        {
            num = -num;
        }

        while(num != 0)
        {
            remainder = num % 10;
            sum = sum + remainder;
            num = num / 10;
        }
        
        System.out.println("Sum of digits in " + originalNum + " is: " + sum);
    }
}
class Program2_1
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.sumOfDigits(1234);
    }
}

