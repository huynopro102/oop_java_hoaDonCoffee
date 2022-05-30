package oop_hoaDonCoffee;

public class hoaDonCoffee {
	private String tenLoaiCoffee;
	private double giaTienTren1Kg;
	private double KhoiLuongTuiCoffee;
	// tạo 1 constructor
	public hoaDonCoffee(String ten , double gia,double kl) {
		this.tenLoaiCoffee=ten;
		this.giaTienTren1Kg=gia;
		this.KhoiLuongTuiCoffee=kl;
	}
	// tao phuong thuc
	public double tongTienTuiCoffee() {
		// phuong thuc nay ko can truyen kieu du lieu gi vao het
		return this.giaTienTren1Kg*this.KhoiLuongTuiCoffee;
	}
	public boolean kiemTraKhoiLuongLonHon(double Khoiluong) {
		if(tongTienTuiCoffee()>Khoiluong) {
			return true;
		}
		else {
			return false ;
		}
	}
	public boolean kiemTraTongTienLonHon5000HayKhong() {
//		if(tongTienTuiCoffee()>5000) {
//			return true;
//		}
//		else {
//			return false;
//		}
		return tongTienTuiCoffee()>5000;
	}
	public double giamGia(double x) {
		// giam gia neu tong tien > 5000
		if(tongTienTuiCoffee()>5000) {
			return (x/100)*tongTienTuiCoffee();
		}
		else {
			return 0;
		}
	}
	public double tongTienKhiGiamGia(double x) {
		if(tongTienTuiCoffee()>5000){
			return (x/100)*tongTienTuiCoffee()+tongTienTuiCoffee();
		}
		else {
			return tongTienTuiCoffee();
		}
	}
}
