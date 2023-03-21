import java.util.Scanner;

public class Bai8 {

    public static void main(String[] args) {
        int n;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap bao nhieu so nguyen:");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.printf("nhap bao nhieu so nguyen thu % d la:",i);
             int a=sc.nextInt();
            sum += a;
        }
        double f=(sum)/n;
        System.out.printf("trung binh cong cua %d la:%f",n,f);
    }
}
