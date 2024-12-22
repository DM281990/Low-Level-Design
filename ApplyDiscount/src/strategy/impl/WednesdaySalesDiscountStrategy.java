package strategy.impl;

import strategy.DiscountStrategy;

public class WednesdaySalesDiscountStrategy implements DiscountStrategy {
    double discount = 0.02;
    public WednesdaySalesDiscountStrategy(DiscountStrategy strategy){
        if(strategy!=null){
            this.discount=strategy.getDiscount()*this.discount;
        }
    }
    public WednesdaySalesDiscountStrategy(double discount){
        this.discount=discount;
    }
    public WednesdaySalesDiscountStrategy(){
    }

    @Override
    public double getDiscount() {
        return this.discount;
    }
}
