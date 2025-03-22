
public class sdfg {
    private int tu;
    private int mau;
    private int tl;
    private int ml;


    public sdfg(int newTu, int newMau) {

        tu = newTu;
        mau = newMau;
        rutgon();
    }


    private int ucln() {
        int t = Math.abs(tu);
        int m = Math.abs(mau);
        while (t != m) {
            if (t > m) {
                t -= m;
            } else {
                m -= t;
            }
        }
        return m;
    }


    public void rutgon() {
        int k = ucln();
        this.tu /= k;
        this.mau /= k;
        this.tl = this.tu;
        this.ml = this.mau;
    }


    public void show() {
        System.out.println(tl + "/" + ml);
    }


    public sdfg cong(sdfg other) {
        int newTu = this.tu * other.mau + other.tu * this.mau;
        int newMau = this.mau * other.mau;
        return new sdfg(newTu,newMau);

    }


    public sdfg tru(sdfg other) {
        int newTu = this.tu * other.mau - other.tu * this.mau;
        int newMau = this.mau * other.mau;
        return new sdfg(newTu, newMau);
    }


    public sdfg nhan(sdfg other) {
        int newTu = this.tu * other.tu;
        int newMau = this.mau * other.mau;
        return new sdfg(newTu, newMau);
    }

    public sdfg chia(sdfg other) {
        if (other.tu == 0) {
            throw new ArithmeticException("Không thể chia cho phân số có tử số bằng 0!");
        }
        int newTu = this.tu * other.mau;
        int newMau = this.mau * other.tu;
        return new sdfg(newTu, newMau);
    }


    public static void main(String[] args) {
        // Tạo hai phân số
        sdfg fs1 = new sdfg(20, 0);
        sdfg fs2 = new sdfg(10, 50);
         if(fs1.mau == 0 || fs2.mau == 0 ){
             System.out.println("loi!!!!!!!");
             return;
         }




        sdfg sum = fs1.cong(fs2);
        sdfg hieu = fs1.tru(fs2);
        sdfg tich = fs1.nhan(fs2);
        sdfg thuong = fs1.chia(fs2);

        System.out.print("Tổng: ");
        sum.show();
        System.out.print("Hiệu: ");
       hieu.show();
        System.out.print("Tích: ");
        tich.show();
        System.out.print("Thương: ");
        thuong.show();
    }
}
