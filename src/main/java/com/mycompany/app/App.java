package com.mycompany.app;

/**
 * Hello world!
 *
 */
public class App 
{

    public static void main( String[] args ){
       /* BankAcc b1= new BankAcc1(2333.323,10,5);
        System.out.println("Interest as per Bank1= "+ b1.getInterest());
        System.out.println("Amount as Bank1 "+b1.getAmount()+"\n");*/

        BankAcc b1 = new BankAcc2(43434.4,5,3);
      //  System.out.println("Interest as per Bank2= "+b1.getInterest());
        System.out.println("Amount as of Bank2= "+b1.getAmount());

    }

}
