 /**
 * The Currency class converts an amount of money from a specific
 * country into the equivalent currency of another country given 
 * the current exchange rate.
 *
 * @author Joanthan Carroll
 * @version 10/15/2021
 */
public class CurrencyV1
{
    public static void main(String [ ] args)
    {
        //Declare and initialize local variables
        double startingUsDollars = 6500.00; // starting US Dollars
        double pesosSpent = 7210.25;        // Mexican Pesos spent
        double pesoExchangeRate = 19.57852; // 1 US dollar = 19.57852 Pesos
        double dollarsSpentInMexico = 0.0;  // US dollars spent in Mexico
        double dollarsAfterMexico = 0.0;    // US dollars remaining after Mexico

        double yenSpent = 102478.26;      // Yen spent
        double yenExchangeRate = 108.70;  // 1 US dollar = 108.70 Yen
        double dollarsSpentInJapan = 0.0; // US dollars spent in Japan
        double dollarsAfterJapan = 0.0;   // US dollars remaining after Japan

        double euroSpent = 655.23;          // Euro spent
        double euroExchangeRate = 0.82;     // 1 US dollar = 0.82 Euro
        double dollarsSpentInBeligum = 0.0; // US dollars spent in Belgium
        double dollarsAfterBelgium = 0.0;   // US dollars remaining after Belgium
		
		double randSpent = 3537.05;             // Rand spent
        double randExchangeRate = 13.77;        // 1 US dollar = 13.77 Rand
        double dollarsSpentInSouthAfrica = 0.0; // US dollars spent in South Africa
        double dollarsAfterSouthAfrica = 0.0;   // US dollars remaining after South Africa

        // Message to user stating purpose
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("This program converts an amount of money");
        System.out.println("from a specific country into the equivalent");
        System.out.println("currency of another country given the current");
        System.out.println("exchange rate.");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println();

        // Display starting amount of US dollars
        System.out.println("Starting US dollars:\t" + startingUsDollars + "\n");

        // Conversion
        // code goes below here
		dollarsSpentInMexico += pesosSpent/pesoExchangeRate; // US Dollars spent in Mexico
        startingUsDollars -= dollarsSpentInMexico;
        dollarsAfterMexico += startingUsDollars;

		dollarsSpentInJapan += yenSpent/yenExchangeRate; // US Dollars spent in Japan
        startingUsDollars -= dollarsSpentInJapan;
        dollarsAfterJapan += startingUsDollars;

		dollarsSpentInBeligum += euroSpent/euroExchangeRate; // US Dollars spent in Belgium
        startingUsDollars -= dollarsSpentInBeligum;
        dollarsAfterBelgium += startingUsDollars;

		dollarsSpentInSouthAfrica += randSpent/randExchangeRate; // US Dollars spent in South Africa
        startingUsDollars -= dollarsSpentInSouthAfrica;
		dollarsAfterSouthAfrica += startingUsDollars;


        // Display Mexico
        System.out.println("Mexico:");
        System.out.println("Pesos spent:\t\t" + pesosSpent);
        System.out.println("US dollars equivalent:\t" + String.format("%.2f",dollarsSpentInMexico));
        System.out.println("US dollars remaining:\t" + String.format("%.2f",dollarsAfterMexico) + "\n");
        // Display Japan
        System.out.println("Japan:");
        System.out.println("Yen spent:\t\t" + yenSpent);
        System.out.println("US dollars equivalent:\t" + String.format("%.2f",dollarsSpentInJapan));
        System.out.println("US dollars remaining:\t" + String.format("%.2f",dollarsAfterJapan) + "\n");
        // Display Belgium
        System.out.println("Belgium:");
        System.out.println("Euros spent:\t\t" + euroSpent);
        System.out.println("US dollars equivalent:\t" + String.format("%.2f",dollarsSpentInBeligum));
        System.out.println("US dollars remaining:\t" + String.format("%.2f",dollarsAfterBelgium) + "\n");
        // Display South Africa
        System.out.println("South Africa:");
        System.out.println("Rand spent:\t\t" + String.format("%.2f",randSpent));
        System.out.println("US dollars equivalent:\t" + String.format("%.2f",dollarsSpentInSouthAfrica));
        System.out.println("US dollars remaining:\t" + String.format("%.2f",dollarsAfterSouthAfrica) + "\n");
        // Display remaining left in US Dollars
        System.out.println("==========================================");
        System.out.print("Remaining US dollars:\t" );
        System.out.print(String.format("%.2f",startingUsDollars) + "\n\n");

        // Complete the code below for Souvenir Purchases
 		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Souvenir Purchases");
		System.out.println(" (all values in US Dollars) ");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");


		//Calculations for Souvenir #1
		int costItem1 = 12;  		               //cost per item of first souvenir
		int budget1 = 100;   		               //budget for first item
		int totalItems1 = (budget1/costItem1);     //how many items can be purchased
		int fundsRemaining1 = (budget1%costItem1); //how much of the budget is left

		System.out.println("Item 1");
		System.out.println("   Cost per item: $" + costItem1 );
		System.out.println("   Budget: $"+ budget1);
		System.out.println("   Total items purchased: " +  (totalItems1));
		System.out.println("   Funds remaining: $"  +  (fundsRemaining1));
     	System.out.println();

		//Calculations for Souvenir #2
		double costItem2 = 29.99;  		            //cost per item of second souvenir
		int budget2 = 500;   			            //budget for second item
		int totalItems2 = budget2/(int)costItem2-1; //how many items can be purchased
		double fundsRemaining2 = budget2%costItem2; //how much of the budget is left

		System.out.println("Item 2");
		System.out.println("   Cost per item: $" + costItem2 );
		System.out.println("   Budget: $"+ budget2);
		System.out.println("   Total items purchased: " +  totalItems2);
		System.out.println("   Funds remaining: $"  +  String.format("%.2f",fundsRemaining2));

    } // end of main method
} // end of class