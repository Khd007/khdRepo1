package com.mycompany.app;

/**
 * Created by khalid on 16/5/16.
 */
public class BankAcc1 implements BankAcc {
    private double principle,amount,simpleIntrest;
    private float rate;
    private int time;

    BankAcc1(double p,float r,int t){
        this.principle=p;
        rate=r;
        time=t;
    }
    @Override
    public double getInterest() {
        simpleIntrest= (principle*rate*time)/100;
        return simpleIntrest;
    }

    @Override
    public double getAmount() {
        amount=principle+getInterest();
        return amount;
    }
}
