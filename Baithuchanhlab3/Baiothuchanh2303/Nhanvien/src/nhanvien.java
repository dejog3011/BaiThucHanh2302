import java.util.Scanner;

public class nhanvien{

        String hoTen;
        int tuoi;
        final float heSoLuong=1490f;
        float luongCoBan;
        float luongNV;
    
        void nhapDuLieu()
        {
            Scanner sc=new Scanner (System.in);
            System.out.print("nhap ten nhan vien:");
            hoTen=sc.next();
            System.out.print("nhap tuoi nhan vien:");
            tuoi=sc.nextInt();
            System.out.print("nhap luong co ban cua nhan vien:");
            luongCoBan=sc.nextFloat();
        }
        float tinhLuong()
        {
          luongNV=heSoLuong*luongCoBan;
          return luongNV;
        }
        void inDuLieu()
        {
            System.out.println(" ten nhan vien la: " +hoTen);
            System.out.println(" tuoi nhan vien la: " +tuoi);
            System.out.println(" luong nhan vien la: " +tinhLuong());
        }
    }