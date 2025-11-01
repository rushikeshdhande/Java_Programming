///////////////////////////////////////////////////////////
//
// Function Name : displayGrade
// Description :   Displays the grade of a student based on marks
// Input :         int
// Output :        void (Prints the grade)
// Author :        Rushikesh baban dhande
// Date :          01/11/2025
//
///////////////////////////////////////////////////////////

class Logic
{
    void displayGrade(int marks)
    { 
        if (marks > 100 || marks < 0)
        {
            System.out.println("Invalid marks.");
        }
        else if (marks >= 90)
        {
            System.out.println("Grade: A+");
        }
        else if (marks >= 80)
        {
            System.out.println("Grade: A");
        }
        else if (marks >= 70)
        {
            System.out.println("Grade: B");
        }
        else if (marks >= 60)
        {
            System.out.println("Grade: C");
        }
        else if (marks >= 50)
        {
            System.out.println("Grade: D");
        }
        else if (marks >= 35)
        {
            System.out.println("Grade: E");
        }
        else
        {
            System.out.println("Grade: Fail");
        }
    }
}
class Program4_2
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.displayGrade(92);
    }
}

