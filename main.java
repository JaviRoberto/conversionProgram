import java.util.Scanner;

import javax.swing.JCheckBox;

import java.math; 


// TODO! 
//1) get doubles to round off to hundereds place for all converstions. 
// add api for live currency rates 
// add time zone conversion. 


public class main {

    public static void usdToEuro(double convertUsdEur){ 

        double convertedUsdToEur = convertUsdEur * .93; 
        System.out.println(convertUsdEur + " USD converts to " + (convertedUsdToEur) +" Euros."); 

    }

    public static void euroToUsd(double convertEurToUsd){ 

        double convertedEurToUSD = convertEurToUsd * 1.07; 
        System.out.println(convertEurToUsd + " Euros converts to " + convertedEurToUSD + " USD."); 
    }

    public static void usdToMxn(double convertUsdToMxn){ 

        double convertedUsdToMxn = convertUsdToMxn * 17.29; 
        System.out.println(convertUsdToMxn + " USD converts to " + convertedUsdToMxn + " MXN."); 
    }

    public static void mxnToUsd(double convertMxnToUsd){ 

        double convertedMxnToUsd = convertMxnToUsd * 1729; 
        System.out.println(convertMxnToUsd + " MXN converts to " + convertedMxnToUsd  + " Euro."); 
    }

    public static void EurToMxn(double convertEurToMxn){ 
        double convertedEurToMxn = convertEurToMxn * 18.56; 
        System.out.println(convertEurToMxn + " Euro converts to " + convertedEurToMxn  + " MXN."); 
    }

    
    public static void mxnToEuro(double convertmxnToEuro){ 
    
        double convertedmxnToEuro = convertmxnToEuro * 0.054; 
        System.out.println(convertmxnToEuro + " MXN converts to " + convertedmxnToEuro  + " Euro."); 
    }

    public static void celToF(double convertcToF){ 
        double convertedcToF = (convertcToF - 32) * 0.5556; 
        System.out.println(convertcToF + " Fahrenheit converts to " + convertedcToF + " Celsius."  ); 


    } 

    public static void fToCel(double convertCtoF){ 
        double convertedfToC = (convertCtoF * 1.8) + 32; 
        System.out.println(convertCtoF + " converts to " + convertedfToC ); 

    } 


    public static void fracToDec(double numer, double denomer){ 
        System.out.println(numer + "/" + denomer + " is " +numer/denomer); 
    } 

    public static void decToFrac(double comvertdecTofrac){ 

       double topper =  comvertdecTofrac * 100000; 
       double butter = 100000; 
       for (int j = 0; j <10000; j++){
        for (double i = 100; i>1; i--){ 
            if (topper % i == 0 && butter % i ==0) { 
                topper /= i; 
                butter /= i;}
             } 
            }   
           System.out.println(topper + " / " + butter);} 
                             
              
            
                            
                    
    
     
                           





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

                            case "e": 
                                System.out.println("Ok, you selected Euro to MXN. \n Now, enter the Euro amount you would like to convert and press enter"); 
                                double numbere = scanner.nextDouble();
                                EurToMxn(numbere); 
                                break; 

                            case "f": 
                                System.out.println("Ok, you selected MXN to USD. \n Now, enter the MXN amount you would like to convert and press enter"); 
                                double numberf = scanner.nextDouble();
                                mxnToEuro(numberf); 
                                break; 

                            default: 
                                System.out.println("could not regonize input"); 
                                break; 

                        }
                    }
                
                else if (choice.equalsIgnoreCase("B")) {
                    System.out.println("\n Ok! What would you like to convert? \n (A)Fahrenheit to Celsius \n (B)Celsius to Fahrenheit"); 
                        String typeOfTemp = scanner.nextLine();
                            switch (typeOfTemp.toLowerCase()){ 
                                case "a": 
                                System.out.println("OK! Enter the Fahrenheit number and then press enter.");
                                double numberFahrenheit = scanner.nextDouble(); 
                                celToF(numberFahrenheit); 
                                 break; 

                                case "b": 
                                    System.out.println("OK! Enter the Celsius number and then press enter.");
                                    double numberCelsius = scanner.nextDouble(); 
                                    fToCel(numberCelsius); 

                                 break; 

                            } 
                         } 


                else if (choice.equalsIgnoreCase("C")) {
                    System.out.println("\n Ok! What would you like to convert? \n (A) Fraction to Decimal \n (B) Decimal to Fraction"); 
                    String typeOfMath = scanner.nextLine();
                    switch (typeOfMath.toLowerCase()){ 
                        case "a": 
                        System.out.println("Ok! enter the numerator to the fraction (this is the top number) and press enter."); 
                        double numeratorz = scanner.nextDouble(); 
                        System.out.println("Ok! Now enter the denominator and press enter"); 
                        double denominator = scanner.nextDouble(); 
                        fracToDec(numeratorz,denominator); 
                        break; 

                        case "b": 
                        System.out.println("Ok! please enter the decimal and press enter");
                        double btype = scanner.nextDouble(); 
                        decToFrac(btype); 
                        break; 




                    }

                 }

                else {System.out.println("\n Selection error. Please restart program");}
     
     
     
     
     
     
     
     
     
     
        //    (1) USD to EURO \n (2) EURO TO USD \n (3) USD to MXN \n (4) MXN to USD \n (5) EURO to MXN \n (6) MXN to EURO");
    }
}
