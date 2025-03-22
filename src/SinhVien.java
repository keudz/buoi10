package buoi10;

public class SinhVien {
    // Thuộc tính
    private String hoTen;
    private String diaChi;
    private String email;
    private String soDienThoai;
    private String maSinhVien;




    public SinhVien(String hoTen, String diaChi, String email, String soDienThoai, String maSinhVien) {
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.email = email;
        this.soDienThoai = soDienThoai;
        this.maSinhVien = maSinhVien;
    }




    public void HoTen(String hoTen) {
        this.hoTen = hoTen;
    }


    public void DiaChi(String diaChi) {
        this.diaChi = diaChi;
    }


    public void Email(String email) {
        this.email = email;
    }

    public void SoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }


    public void MaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }


    public void diHoc() {
        System.out.println(hoTen + " đang đi học.");
    }

    public void lamBaiTap() {
        System.out.println(hoTen + " đang làm bài tập.");
    }

    public void nopHocPhi() {
        System.out.println(hoTen + " đã nộp học phí.");
    }

    public void lamBaiKiemTra() {
        System.out.println(hoTen + " đang làm bài kiểm tra.");
    }

    // Phương thức hiển thị thông tin
    public void hienThiThongTin() {
        System.out.println("Họ và tên: " + hoTen);
        System.out.println("Địa chỉ: " + diaChi);
        System.out.println("Email: " + email);
        System.out.println("Số điện thoại: " + soDienThoai);
        System.out.println("Mã sinh viên: " + maSinhVien);
    }
    public static void main(String[] args) {
        SinhVien sv = new SinhVien("nguyen the dat","dh giao thong van tai", "1234@gmail.com","123456789","242230700");



        sv.diHoc();
        sv.lamBaiTap();
        sv.nopHocPhi();
        sv.lamBaiKiemTra();


        sv.hienThiThongTin();


     }
}

