import inventory.Item;
import strategy.impl.BaseDiscountStrategy;
import strategy.impl.CreditCardDiscountStrategy;
import strategy.impl.WednesdaySalesDiscountStrategy;
import strategy.impl.WeekendDiscountStrategy;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Item item = new Item();
        item.itemName="ELECTRONICS";
        item.itemPrice =10000d;
        item.discountStrategy = new BaseDiscountStrategy(new CreditCardDiscountStrategy(
                new WednesdaySalesDiscountStrategy(new WeekendDiscountStrategy(0.1))
        ));
        System.out.println("final price ="+item.itemPrice*item.discountStrategy.getDiscount() );
    }
}