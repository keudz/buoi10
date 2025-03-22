
public class Fraction {
    private int tu;
    private int mau;
    private int tl;
    private int ml;


    public Fraction(int newTu, int newMau) {

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


    public Fraction cong(Fraction other) {
        int newTu = this.tu * other.mau + other.tu * this.mau;
        int newMau = this.mau * other.mau;
        return new Fraction(newTu,newMau);

    }


    public Fraction tru (Fraction other) {
        int newTu = this.tu * other.mau - other.tu * this.mau;
        int newMau = this.mau * other.mau;
        return new Fraction (newTu, newMau);
    }


    public Fraction nhan(Fraction other) {
        int newTu = this.tu * other.tu;
        int newMau = this.mau * other.mau;
        return new Fraction(newTu, newMau);
    }

    public Fraction chia(Fraction other) {
        if (other.tu == 0) {
            throw new ArithmeticException("Không thể chia cho phân số có tử số bằng 0!");
        }
        int newTu = this.tu * other.mau;
        int newMau = this.mau * other.tu;
        return new Fraction(newTu, newMau);
    }


    public static void main(String[] args) {
        // Tạo hai phân số
        Fraction fs1 = new Fraction(20, 0);
        Fraction fs2 = new Fraction(10, 50);
         if(fs1.mau == 0 || fs2.mau == 0 ){
             System.out.println("loi!!!!!!!");
             return;
         }




        Fraction sum = fs1.cong(fs2);
        Fraction hieu = fs1.tru(fs2);
        Fraction tich = fs1.nhan(fs2);
        Fraction thuong = fs1.chia(fs2);

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
