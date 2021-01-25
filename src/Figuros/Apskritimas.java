package Figuros;

import java.util.Objects;

public class Apskritimas extends Figura {
    private double r;

    @Override
    public double area() {
        return Math.PI * r * r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public String toString() {
        return "Apskritimas{" + super.toString() + ", " +
                "r=" + r +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Apskritimas circle = (Apskritimas) o;
        return Double.compare(circle.r, r) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), r);
    }
}
