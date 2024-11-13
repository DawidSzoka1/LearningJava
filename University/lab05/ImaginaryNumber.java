package University.lab05;

import java.util.Objects;

public class ImaginaryNumber {
    private double re;
    private double im;

    public ImaginaryNumber() {}
    public ImaginaryNumber(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public double getRe() {
        return re;
    }

    public void setRe(double re) {
        this.re = re;
    }

    public double getIm() {
        return im;
    }

    public void setIm(double im) {
        this.im = im;
    }

    public ImaginaryNumber add(ImaginaryNumber other) {
        return new ImaginaryNumber(re + other.re, im + other.im);
    }


    @Override
    public String toString() {
        return "re = "  + re + " im = " + im;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ImaginaryNumber that = (ImaginaryNumber) o;
        return Double.compare(re, that.re) == 0 && Double.compare(im, that.im) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(re, im);
    }
}
