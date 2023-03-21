import java.util.Scanner;

public class Bai10 {

    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in) ;
        int c=0;
        String a;
        do{
        System.out.print("nhap chuoi ki tu khong qua 80 ki tu : ");
         a=sc.next();
          for(int i=0;i<a.length();i++)
        {
           c++;
            }

        }while(c<1 && c>80);
        System.out.print("nhap mot ky tu:");
        char b=sc.next().charAt(0);
        int sum=0;
        for(int j=0;j<a.length();j++)
        {
            if(a.charAt(j)==b)
            {
                sum++;
            }
        }
        System.out.print("ky tu '"+b+"' xuat hien "+sum+" lan trong chuoi ky tu \n");
        }
    
}