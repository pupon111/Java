package org.example.chapter04.task06;

@SuppressWarnings("unused")
public class DiscountedItem extends Item {
    private final double discount;

    public DiscountedItem(String description, double price, double discount) {
        super(description, price);
        this.discount = discount;
    }

    public double getDiscount() {
        return discount;
    }

    @Override
    public boolean equals(Object otherObject) {
        if (this == otherObject) return true;
        if (otherObject == null) return false;
        if (!(otherObject instanceof Item)) return false;
        if (!(otherObject instanceof DiscountedItem other)) {
            return super.equals(otherObject);
        }
        if (!super.equals(other)) return false;
        return Double.compare(discount, other.discount) == 0;
    }
}