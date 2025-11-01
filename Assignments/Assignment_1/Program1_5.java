///////////////////////////////////////////////////////////
//
// Function Name : countDigits
// Description :   Counts the number of digits in a given number
// Input :         int
// Output :        void (Prints the result)
// Author :        Rushikesh baban dhande
// Date :          01/11/2025
//
///////////////////////////////////////////////////////////

class Logic
{
    void countDigits(int num)
    { 
        int count = 0;
        int originalNum = num; // Store original number for display
 
        if (num == 0)
        {
            count = 1;
        }
        else
        {
             // Handle negative numbers by making them positive for counting
            if (num < 0)
            {
                num = -num;
            }

            while(num != 0)
            {
                num = num / 10;
                count++;
            }
        }
        
        System.out.println("Number of digits in " + originalNum + " is: " + count);
    }
}
class Program1_5
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.countDigits(7865);
    }
}

