package com.mycompany.app;

import static java.lang.Math.*;

/**
 * Created by khalid on 16/5/16.
 */
public class BankAcc2 implements BankAcc {

    private double principle,amount,compIntrest;
    private float rate;
    private int time;

    BankAcc2(double p,float r,int t){
        principle=p;
        rate=r;
        time=t;
    }
    public double getInterest() {
        compIntrest = principle * pow((1+rate/100),time);
        return compIntrest;
    }

    @Override
    public double getAmount() {
            amount= principle+getInterest();
        return compIntrest;
    }
}
