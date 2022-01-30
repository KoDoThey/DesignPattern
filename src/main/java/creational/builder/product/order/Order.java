package creational.builder.product.order;


import creational.builder.product.type.BreadType;
import creational.builder.product.type.MeatType;
import creational.builder.product.type.OrderType;
import creational.builder.product.type.VegetableType;

public class Order {
    private OrderType orderType;
    private BreadType breadType;
    private MeatType meatType;
    private VegetableType vegetableType;

    public Order(OrderType orderType, BreadType breadType, MeatType meatType, VegetableType vegetableType) {
        super();
        this.orderType = orderType;
        this.breadType = breadType;
        this.meatType = meatType;
        this.vegetableType = vegetableType;
    }

    public Order(creational.builder.product.type.OrderType orderType, creational.builder.product.type.BreadType breadType, creational.builder.product.type.MeatType meatType, creational.builder.product.type.VegetableType vegetableType) {
    }

    @Override
    public String toString() {
        return "Order Type: " + orderType + " Bread Type: " + breadType + " Meat Type: " + meatType + " Vegetable Type: " + vegetableType;
    }

    public OrderType getOrderType() {
        return orderType;
    }

    public BreadType getBreadType() {
        return breadType;
    }

    public MeatType getMeatType() {
        return meatType;
    }

    public VegetableType getVegetableType() {
        return vegetableType;
    }

    public enum VegetableType {
        SALAD, CUCUMBER, TOMATO
    }

    public enum OrderType {
        TAKE_AWAY, ON_SITE
    }

    public enum BreadType {
        SIMPLE, OMELETTE, FRIED_EGG, GRILLED_FISH, PORK, BEEF
    }

    public enum MeatType {
        PORK, BEEF, CHICKEN, FISH
    }
}
