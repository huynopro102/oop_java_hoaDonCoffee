package oop_hoaDonCoffee;

public class main {
public static void main(String[] args) {
	hoaDonCoffee hd = new hoaDonCoffee("caffee huy ", 1000, 7);
	System.out.println("tong tien la :"+hd.tongTienTuiCoffee());
	System.out.println("tong tien lon hon la : "+hd.kiemTraKhoiLuongLonHon(4));
	System.out.println("tong tien > 5000 : "+hd.kiemTraTongTienLonHon5000HayKhong());
	System.out.println("giam gia la :"+hd.giamGia(4));
	System.out.println("tong tien khi da giam gia :"+hd.tongTienKhiGiamGia(4));
}
}
