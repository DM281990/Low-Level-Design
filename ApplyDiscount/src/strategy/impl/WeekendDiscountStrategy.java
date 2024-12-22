package strategy.impl;

import strategy.DiscountStrategy;

public class WeekendDiscountStrategy implements DiscountStrategy {
    double discount = 0.04;
    public WeekendDiscountStrategy(DiscountStrategy strategy){
        if(strategy!=null){
            this.discount=strategy.getDiscount()*this.discount;
        }
    }
    public WeekendDiscountStrategy(double discount){
        this.discount=discount;
    }
    public WeekendDiscountStrategy(){
    }
    @Override
    public double getDiscount() {
        return this.discount;
    }
}
