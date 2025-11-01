///////////////////////////////////////////////////////////
//
// Function Name : printTable
// Description :   Prints the multiplication table of a number
// Input :         int
// Output :        void (Prints the table)
// Author :        Rushikesh baban dhande
// Date :          01/11/2025
//
///////////////////////////////////////////////////////////

class Logic
{
    void printTable(int num)
    {
        // logic
        System.out.println("Multiplication table of " + num + ":");
        for(int i = 1; i <= 10; i++)
        {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}
class Program2_5
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.printTable(5);
    }
}

