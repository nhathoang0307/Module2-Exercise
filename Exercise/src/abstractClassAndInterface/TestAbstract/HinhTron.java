package abstractClassAndInterface.TestAbstract;

public class HinhTron extends Hinh {
    private double r;

    public HinhTron(ToaDo toaDo, double r) {
        super(toaDo);
        this.r = r;
    }

    public HinhTron() {
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double tinhDienTich() {
        return Math.PI*this.r*this.r;
    }

    @Override
    public String toString() {
        return "HinhTron{" +
                "r=" + r +
                ", " + toaDo +
                '}';
    }
}
