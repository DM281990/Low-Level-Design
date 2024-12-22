package strategy.impl;

import strategy.DiscountStrategy;

public class CreditCardDiscountStrategy implements DiscountStrategy {
    double discount = 0.03;
    public CreditCardDiscountStrategy(DiscountStrategy strategy){
        if(strategy!=null){
            this.discount=strategy.getDiscount()*this.discount;
        }
    }
    public CreditCardDiscountStrategy(double discount){
        this.discount=discount;
    }
    public CreditCardDiscountStrategy(){
    }

    @Override
    public double getDiscount() {
        return this.discount;
    }
}
