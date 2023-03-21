import java.util.Scanner;

public class Bai1 {

    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.print("nhap so thu nhat :");
        double a=sc.nextDouble();
        System.out.print("nhap so thu hai:");
        double b=sc.nextDouble();
        System.out.println("tong 2 so la:" +(a+b));
        System.out.println("hieu hai so la:" +(a-b));
        System.out.println("thuong hai so la:" +(a*b));
        if(a>=b)
            System.out.println("chia lay du 2 so la:" +(a%b));
        else 
            System.out.println("chia lay du 2 so la:" +(b%a));
        
       if(a>b)
           System.out.println(a+">" +b);
       if(a==b)
           System.out.println(a+"=" +b); 
       if(a<b)
           System.out.println(a+"<" +b);    }
    
}
