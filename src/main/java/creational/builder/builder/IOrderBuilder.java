package creational.builder.builder;


import creational.builder.product.order.Order;
import creational.builder.product.type.BreadType;
import creational.builder.product.type.MeatType;
import creational.builder.product.type.OrderType;
import creational.builder.product.type.VegetableType;

/**
 * builder
 */

public interface IOrderBuilder {
    IOrderBuilder orderType(OrderType orderType);
    IOrderBuilder orderBread(BreadType breadType);
    IOrderBuilder orderMeat(MeatType meatType);
    IOrderBuilder orderVegetable(VegetableType vegetableType);

    Order build();
}
