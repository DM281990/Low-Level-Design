package entity.billing.payment;

import entity.billing.payment.mode.impl.PaymentMode;

public class Payment {

   PaymentMode paymentMode;

   public Payment(PaymentMode paymentMode){
       this.paymentMode = paymentMode;
   }

    public boolean makePayment(){
        return paymentMode.makePayment();
    }

}
