///////////////////////////////////////////////////////////
//
// Function Name : reverseNumber
// Description :   Reverses a given integer number
// Input :         int
// Output :        void (Prints the result)
// Author :        Rushikesh baban dhande
// Date :          31/10/2025
//
///////////////////////////////////////////////////////////

class Logic
{
    void reverseNumber(int num)
    { 
        int reversedNum = 0;
        int remainder = 0;
        int originalNum = num; // Store original number for display

        while(num != 0)
        {
            remainder = num % 10;
            reversedNum = reversedNum * 10 + remainder;
            num = num / 10;
        }
        
        System.out.println("Reverse of " + originalNum + " is: " + reversedNum);
    }
}
class Program1_4
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.reverseNumber(1234);
    }
}

