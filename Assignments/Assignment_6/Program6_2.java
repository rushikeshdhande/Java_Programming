///////////////////////////////////////////////////////////
//
// Function Name : countEvenOddRange
// Description :   Counts even and odd numbers from 1 to N
// Input :         int (n)
// Output :        void (Prints the counts)
// Author :        Rushikesh baban dhande
// Date :          31/10/2025
//
///////////////////////////////////////////////////////////

class Logic
{
    void countEvenOddRange(int n)
    {
         int evenCount = 0;
        int oddCount = 0;

        if (n < 1)
        {
            System.out.println("Invalid range. Please enter a number greater than 0.");
            return;
        }

        // Loop from 1 up to n
        for (int i = 1; i <= n; i++)
        {
            if (i % 2 == 0)
            {
                evenCount++; // Increment even counter
            }
            else
            {
                oddCount++; // Increment odd counter
            }
        }
        
        System.out.println("Numbers from 1 to " + n + ":");
        System.out.println("Total Even numbers: " + evenCount);
        System.out.println("Total Odd numbers: " + oddCount);
    }
}
class Program6_2
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.countEvenOddRange(50);
    }
}

