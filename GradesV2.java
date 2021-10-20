 /**
 * Calculate the total points and average grade each time a new score is added to the total.
 * 
 * @author Jonathan Carroll
 * @version 10/15/2021
 */
public class GradesV2
{
    public static void main(String[] args)
    {
        // local variables
        // "Do not modify these statements or add more variables."
        int numTests = 0;      //counts number of tests
        int testGrade = 0;     //individual test grade
        int totalPoints = 0;   //total points for all tests
        double average = 0.0;  //average grade
        
        // display interface
        System.out.println("|  Test #  |  Test Grade  |  Total Points  |  Average Score |");
        
        // display test #1
        numTests++;
        testGrade += 95;
        totalPoints += testGrade;
        average = (double)totalPoints/(double)numTests;
        System.out.println("|\t"+numTests+"  |\t    "+testGrade+"\t  |\t"+totalPoints+"\t   |\t"+String.format("%.2f",average)+"\t    |");
        testGrade -= testGrade; // reset variable

        // display test #2
        numTests++;
        testGrade += 73;
        totalPoints += testGrade;
        average = (double)totalPoints/(double)numTests;
        System.out.println("|\t"+numTests+"  |\t    "+testGrade+"\t  |\t"+totalPoints+"\t   |\t"+String.format("%.2f",average)+"\t    |");
        testGrade -= testGrade; // reset variable

        // display test #3
        numTests++;
        testGrade += 91;
        totalPoints += testGrade;
        average = (double)totalPoints/(double)numTests;
        System.out.println("|\t"+numTests+"  |\t    "+testGrade+"\t  |\t"+totalPoints+"\t   |\t"+String.format("%.2f",average)+"\t    |");
        testGrade -= testGrade; // reset variable

        // display test #4
        numTests++;
        testGrade += 82;
        totalPoints += testGrade;
        average = (double)totalPoints/(double)numTests;
        System.out.println("|\t"+numTests+"  |\t    "+testGrade+"\t  |\t"+totalPoints+"\t   |\t"+String.format("%.2f",average)+"\t    |");
        testGrade -= testGrade; // reset variable

        // display test #5
        numTests++;
        testGrade += 69;
        totalPoints += testGrade;
        average = (double)totalPoints/(double)numTests;
        System.out.println("|\t"+numTests+"  |\t    "+testGrade+"\t  |\t"+totalPoints+"\t   |\t"+String.format("%.2f",average)+"\t    |");
        testGrade -= testGrade; // reset variable
    
        // display test #6
        numTests++;
        testGrade += 87;
        totalPoints += testGrade;
        average = (double)totalPoints/(double)numTests;
        System.out.println("|\t"+numTests+"  |\t    "+testGrade+"\t  |\t"+totalPoints+"\t   |\t"+String.format("%.2f",average)+"\t    |");
        testGrade -= testGrade; // reset variable

        // display test #7
        numTests++;
        testGrade += 49;
        totalPoints += testGrade;
        average = (double)totalPoints/(double)numTests;
        System.out.println("|\t"+numTests+"  |\t    "+testGrade+"\t  |\t"+totalPoints+"\t   |\t"+String.format("%.2f",average)+"\t    |");
        testGrade -= testGrade; // reset variable

        // display test #8
        numTests++;
        testGrade += 45;
        totalPoints += testGrade;
        average = (double)totalPoints/(double)numTests;
        System.out.println("|\t"+numTests+"  |\t    "+testGrade+"\t  |\t"+totalPoints+"\t   |\t"+String.format("%.2f",average)+"\t    |");
        testGrade -= testGrade; // reset variable

        // display test #9
        numTests++;
        testGrade += 67;
        totalPoints += testGrade;
        average = (double)totalPoints/(double)numTests;
        System.out.println("|\t"+numTests+"  |\t    "+testGrade+"\t  |\t"+totalPoints+"\t   |\t"+String.format("%.2f",average)+"\t    |");
        testGrade -= testGrade; // reset variable

        } // end of method
} // end of class