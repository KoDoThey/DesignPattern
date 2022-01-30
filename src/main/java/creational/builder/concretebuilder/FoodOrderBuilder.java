package creational.builder.concretebuilder;

import creational.builder.builder.IOrderBuilder;
import creational.builder.product.order.Order;
import creational.builder.product.type.BreadType;
import creational.builder.product.type.MeatType;
import creational.builder.product.type.OrderType;
import creational.builder.product.type.VegetableType;

/**
 * ConcreteBuilder
 */
public class FoodOrderBuilder implements IOrderBuilder {
    private OrderType orderType;
    private VegetableType vegetableType;
    private MeatType meatType;
    private BreadType breadType;

    @Override
    public IOrderBuilder orderType(OrderType orderType){
        this.orderType = orderType;
        return this;
    }

    @Override
    public IOrderBuilder orderBread(BreadType breadType){
        this.breadType = breadType;
        return this;
    }

    @Override
    public IOrderBuilder orderMeat(MeatType meatType){
         this.meatType = meatType;
         return this;
    }

    @Override
    public IOrderBuilder orderVegetable(VegetableType vegetableType){
        this.vegetableType = vegetableType;
        return this;
    }

    @Override
    public Order build(){
        return new Order(orderType, breadType, meatType, vegetableType);
    }


}
