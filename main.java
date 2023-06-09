
import java.util.Scanner;
import java.math; 

public class main {

    public static void usdToEuro(double convertUsdEur){ 

        double convertedUsdToEur = convertUsdEur * .93; 
        System.out.println(convertUsdEur + " USD converts to " + (convertedUsdToEur) +" Euros"); 

    }

    public static void euroToUsd(double convertEurtoUsd){ 

        double convertedEurToUSD = convertEurtoUsd * 1.07; 
        System.out.println(convertEurtoUsd + " Euros converts to " + convertedEurToUSD + " USD"); 
    }

    public static void usdToMxn(double convertUsdToMxn){ 

        double convertedUsdToMxn = convertUsdToMxn * 17.29; 
        System.out.println(convertUsdToMxn + " USD converts to " + convertedUsdToMxn + " MXN"); 
    }

    public static void mxnToUsd(double convertMxnToUsd){ 

        double convertedMxnToUsd = convertMxnToUsd * 1729; 
        System.out.println(convertMxnToUsd + " MXN converts to " + convertedMxnToUsd  + " USD"); 
    }


    


     public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in); 




        System.out.println("Welcome to Javier's Conversion Program! \n What would you like to convert? \n To select, input the number of your selection and press enter. \n (A) Money \n (B) Temperature \n (C) Fractions or Decimals "); 
     
     
            String choice = scanner.nextLine();
                if (choice.equalsIgnoreCase("A")) { 
                    System.out.println("\n Ok! What would you like to convert? \n (A) USD to EURO \n (B) EURO TO USD \n (C) USD to MXN \n (D) MXN to USD \n (E) EURO to MXN \n (F) MXN to EURO"); 
                        String money = scanner.nextLine();
                        switch (money.toLowerCase()){ 
                            case "a": 
                                System.out.println("Ok, you selected USD to Euro. \n Now, enter the USD amount you would like to convert and press enter"); 
                                double number = scanner.nextDouble();
                                usdToEuro(number); 
                                break; 

                            case "b": 
                                System.out.println("Ok, you selected Euro to USD. \n Now, enter the Euro amount you would like to convert and press enter"); 
                                double numberb = scanner.nextDouble();
                                euroToUsd(numberb); 
                                break; 

                            case "c": 
                                System.out.println("Ok, you selected USD to MXN(Mexcian Peso). \n Now, enter the USD amount you would like to convert and press enter"); 
                                double numberc = scanner.nextDouble();
                                usdToMxn(numberc); 
                                break; 

                            case "d": 
                                System.out.println("Ok, you selected MXN to USD. \n Now, enter the MXN amount you would like to convert and press enter"); 
                                double numberd = scanner.nextDouble();
                                usdToMxn(numberd); 
                                break; 



                            default: 
                            System.out.println("could not regonize input"); 
                            break; 


                        }

                 }
                
                else if (choice.equalsIgnoreCase("B")) {
                    System.out.println("\n Ok! What would you like to convert? \n Fahrenheit to Celsius \n Celsius to Fahrenheit"); 
                 } 
                else if (choice.equalsIgnoreCase("C")) {
                    System.out.println("\n Ok! What would you like to convert? \n (A) Fraction to Decimal \n (B) Decimal to Fraction "); 
                 }

                else {System.out.println("\n Selection error. Please restart program");}
     
     
     
     
     
     
     
     
     
     
        //    (1) USD to EURO \n (2) EURO TO USD \n (3) USD to MXN \n (4) MXN to USD \n (5) EURO to MXN \n (6) MXN to EURO");
    }
}
