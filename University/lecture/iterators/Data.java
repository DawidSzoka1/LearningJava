package University.lecture.iterators;

public class Data implements Comparable<Data>{
    private int d, m, r;
    public Data(){}
    public Data(int d, int m, int r) {
        this.d = d;
        this.m = m;
        this.r = r;
    }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    @Override
    public String toString() {
        return "{" + d +
                "/" + m +
                "/" + r + '}';
    }

    @Override
    public int compareTo(Data o) {
        int comR = this.getR() - o.getR();
        int comM = this.getM() - o.getM();
        if (comR != 0) {
            return comR;
        }
        if (comM != 0) {
            return comM;
        }
        return this.getD() - o.getD();
    }
}
