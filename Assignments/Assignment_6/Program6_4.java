///////////////////////////////////////////////////////////
//
// Function Name : countFactors
// Description :   Counts the total factors of a given number
// Input :         int (num)
// Output :        void (Prints the count)
// Author :        Rushikesh baban dhande
// Date :          01/11/2025
//
///////////////////////////////////////////////////////////

class Logic
{
    void countFactors(int num)
    {
        // logic  
        int count = 0; // Initialize factor counter
        
        if (num <= 0)
        {
            System.out.println("Please enter a positive number.");
            return;
        }
        
        // Loop from 1 up to the number
        for (int i = 1; i <= num; i++)
        {
            // Check if 'i' is a factor
            if (num % i == 0)
            {
                count++; // Increment the counter
            }
        }
        
        System.out.println("Total factors of " + num + " are: " + count);
    }
}
class Program6_4
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.countFactors(20);
    }
}

