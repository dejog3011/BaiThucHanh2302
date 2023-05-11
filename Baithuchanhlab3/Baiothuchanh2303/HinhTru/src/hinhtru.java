import java.util.Scanner;

public class hinhtru {

    final float PI = 3.14f;
    float chieuCao;
    float banKinh;
    double theTich;
    double dienTichXungQuanh;
    double dienTichToanPhan;

    void nhapThongTin() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap chieu cao: ");
        chieuCao = scanner.nextFloat();
        System.out.println("nhap ban kinh: ");
        banKinh = scanner.nextFloat();
    }

    void tinhTheTich() {
        theTich = PI * banKinh * banKinh * chieuCao;
    }

    void tinhDienTichXungQuanh() {
        dienTichXungQuanh = 2 * PI * banKinh * chieuCao;
    }

    void tinhDienTichToanPhan() {
        dienTichToanPhan = (2 * PI * banKinh * chieuCao) + (2 * PI * banKinh * banKinh);
    }

    void hienThi() {
        System.out.printf("the tich = %f", theTich);
        System.out.printf("dien tich xung quanh = %f", dienTichXungQuanh);
        System.out.printf("dien tich toan phan = %f", dienTichToanPhan);
    }
}