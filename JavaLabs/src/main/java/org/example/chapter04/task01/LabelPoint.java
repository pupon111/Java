package org.example.chapter04.task01;

import java.util.Objects;

@SuppressWarnings("unused")
public class LabelPoint extends Point {
    String label;

    public LabelPoint(double x, double y, String label) {
        super(x, y);
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    @Override
    public String toString() {
        return "LabeledPoint{x=" + getX() + ", y=" + getY() + ", label='" + label + "'}";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        if (!super.equals(obj)) return false;
        return Objects.equals(this.label, ((LabelPoint) obj).label);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), label);
    }
}
