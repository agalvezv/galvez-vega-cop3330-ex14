package challenge14;

import java.util.Locale;
import java.util.Scanner;

public class Challenge14 {

    public static void main(String[] args) {

        Scanner inputs = new Scanner(System.in);

        System.out.println("What is the order amount? ");
        String orderAmountS = inputs.nextLine();
        double orderAmountD = Double.parseDouble(orderAmountS);

        System.out.println("What is the state? ");
        String stateS = inputs.nextLine();

        double tax = 0;
        if(stateS.equals("WI"))
        {
            tax = orderAmountD*.055;
            String subTotal = java.text.NumberFormat.getCurrencyInstance(Locale.US).format(orderAmountD);
            String responseOne = "The subtotal is " + subTotal;
            Output(responseOne);

            String taxS = java.text.NumberFormat.getCurrencyInstance(Locale.US).format(tax);
            String responseTwo = "The tax is " + taxS;
            Output(responseTwo);


        }
        double totalD = orderAmountD + tax;
        totalD = Math.round(totalD*100);
        totalD = totalD/100;
        String totalS = java.text.NumberFormat.getCurrencyInstance(Locale.US).format(totalD);
        String responseThree = "The total is " + totalS;
        Output(responseThree);






    }
    public static void Output(String proxy)
    {
        System.out.println(proxy);
    }

}
