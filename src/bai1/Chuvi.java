package bai1;

public class Chuvi {
    private double bankinh;
    public Chuvi(double bankinh){
        this.bankinh = bankinh;
    }

    public double getBankinh() {
        return bankinh;
    }
    public void setBankinh(double bankinh) {
        this.bankinh = bankinh;
    }
    public double chuvi(){
       return  2*bankinh*Math.PI;
    }
    public double diendtich(){
        return bankinh*bankinh*Math.PI;
    }
}
