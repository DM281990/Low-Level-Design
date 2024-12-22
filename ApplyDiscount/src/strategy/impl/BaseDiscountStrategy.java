package strategy.impl;

import strategy.DiscountStrategy;

public class BaseDiscountStrategy implements DiscountStrategy {
    double discount = 0.01;
    public BaseDiscountStrategy(DiscountStrategy strategy){
        if(strategy!=null){
            this.discount=strategy.getDiscount()*this.discount;
        }
    }
    public BaseDiscountStrategy(double discount){
        this.discount=discount;
    }
    public BaseDiscountStrategy(){
    }

    @Override
    public double getDiscount() {
        return this.discount;
    }
}
