package org.example.chapter04.task06;

import java.util.Objects;

public class Item {
    private final String description;
    private final double price;

    public Item(String description, double price) {
        this.description = description;
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    @SuppressWarnings("unused")
    public double getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object otherObject) {
        if (this == otherObject) return true;
        if (otherObject == null) return false;
        if (!(otherObject instanceof Item other)) return false;
        return Objects.equals(description, other.description) &&
                Double.compare(price, other.price) == 0;
    }
}