///////////////////////////////////////////////////////////
//
// Function Name : checkPalindrome
// Description :   Checks if a given number is a palindrome
// Input :         int
// Output :        void (Prints the result)
// Author :        Rushikesh baban dhande
// Date :          01/11/2025
//
///////////////////////////////////////////////////////////

class Logic
{
    void checkPalindrome(int num)
    {
        //logic
         int reversedNum = 0;
        int remainder = 0;
        int originalNum = num; // Store original number for comparison

        // Handle negative numbers (palindromes are usually considered for non-negatives)
        if (num < 0)
        {
             System.out.println(originalNum + " is not a palindrome (negative number).");
             return;
        }

        while(num != 0)
        {
            remainder = num % 10;
            reversedNum = reversedNum * 10 + remainder;
            num = num / 10;
        }

        // Check if the original number is equal to the reversed number
        if (originalNum == reversedNum)
        {
            System.out.println(originalNum + " is a palindrome.");
        }
        else
        {
            System.out.println(originalNum + " is not a palindrome.");
        }
    }
}
class Program2_2
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.checkPalindrome(121);
    }
}

