/**
 * The purpose of this program is to count the number of
 * tickets sold and the amount of money received.
 * 
 * @author Jonathan Carroll
 * @version 10/12/2021
 */
public class AdmissionV1
{
    public static void main(String[ ] args)
    {
        //local variables       
        int counter = 0;            //total tickets sold
        double ticketPrice = 0.0;   //cost of student ticket
        double totalSales = 0.0;    //total sales
        
        System.out.print("Number of tickets\tTotal Sales: $\n");      
        
        //calculate total ticket sales at the game
        ticketPrice = 5.50;         //ticket price
        counter++;
        totalSales += ticketPrice;
        System.out.println("\t\t" + counter + "\t\t" + totalSales); 
        
        //calculate total ticket sales at the game
        ticketPrice = 5.50;         //ticket price
        counter++;
        totalSales += ticketPrice;
        System.out.println("\t\t" + counter + "\t\t" + totalSales); 
        
        //calculate total ticket sales at the game
        ticketPrice = 5.50;         //ticket price
        counter++;
        totalSales += ticketPrice;
        System.out.println("\t\t" + counter + "\t\t" + totalSales); 


        double dNum1 = 10.50, dNum2 = 3.14;
        System.out.println("\n" +dNum1 + " + " + dNum2);
    }//end of main method
}//end of class