public class playAround 
{
    public static void main(String[ ] args)
    {
    // Display a welcome message
    System.out.println("This is a playground for messing around with Java... Enjoy!");
    // Declare variables for demonstration of primitive data types
    int integerNum = 10;
    float floatNum = 15;
    double doubleNum = 20.00;
    boolean falseBool = false;
    boolean trueBool = true;
    System.out.println("Addition: " + (integerNum + floatNum + doubleNum));
    System.out.println("This is a bool: " + (falseBool));
    System.out.println("This is a bool: " + (trueBool));

    if (floatNum==integerNum)
    {
    System.out.println("If is True");
    }
    else
    {
    System.out.println("If is False");
    if (floatNum-floatNum==integerNum-integerNum)
        System.out.println("Nested if is True");
    }
    int integer1 = 10;
    double integer2 = (double)integer1;
    System.out.println(integer1 + " AND "+integer2);

    double dNum = 55/100;
    System.out.println(dNum);
    
    // initializing variables
    int num = 5;
  
    // first 5 gets printed and then
    // increment to 6
    System.out.println("Post "
        + "increment = " + num++);
  
    // num was 6, incremented to 7
    // then printed
    System.out.println("Pre "
         + "increment = " + ++num);
    }
}