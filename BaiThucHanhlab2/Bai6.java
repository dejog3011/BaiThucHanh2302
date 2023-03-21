import java.util.Scanner;
public class Bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum=1;
        System.out.println("Nhap vao so nguyen: ");
        int a=sc.nextInt();
        do{
            sum=sum*a;
            a--;
        } while(a>0);
         System.out.println("giai thua so do la: " +sum); 
         
    }
}
