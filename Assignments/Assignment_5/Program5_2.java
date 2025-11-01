///////////////////////////////////////////////////////////
//
// Function Name : printReverse
// Description :   Prints numbers from N down to 1
// Input :         int (n)
// Output :        void (Prints the numbers)
// Author :        Rushikesh baban dhande
// Date :          01/11/2025
//
///////////////////////////////////////////////////////////

class Logic
{
    void printReverse(int n)
    { 
        if (n < 1)
        {
            System.out.println("Invalid input. Number should be greater than 0.");
            return;
        }

        System.out.println("Numbers in reverse order from " + n + " to 1:");
        for (int i = n; i >= 1; i--)
        {
            System.out.print(i + " ");
        }
        System.out.println();  
    }
}
class Program5_2
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.printReverse(10);
    }
}

