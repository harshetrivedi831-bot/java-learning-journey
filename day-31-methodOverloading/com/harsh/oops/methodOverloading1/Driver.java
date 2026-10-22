package com.harsh.oops.methodOverloading1;

public class Driver
{
    public static void main(String[] args)
    {
        Payment payment = new Payment(7346736653745l,"harsh@121","dhumrapan nishedh",20);
        /*
         * method calls associated with it appropriate method implementation during
         * compile time only called early binding.
         * And here compiler cares reference type and ignore parameter name hence
         * identical parameter are not allowed creates confusion for the compiler.
         * 
         */
        payment.processPayment(payment.getDebitCardNumber());
        payment.processPayment(payment.getUpiId());
        payment.processPayment(payment.getWalletName(),payment.getAmount());
    }
}
