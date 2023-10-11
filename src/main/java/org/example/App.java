package org.example;

public class App 
{
    public static void main( String[] args )
    {
        FunctionCalculator functionCalculator = new FunctionCalculator();
        try {
            System.out.printf("%.6f", functionCalculator.calculate(10, 10, 16, 20) );
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
