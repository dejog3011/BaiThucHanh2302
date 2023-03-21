import java.util.Scanner;

public class Bai9 {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);   
       System.out.print("Nhap chuoi ky tu:");
       String a=sc.next();
       int chuthuong=0,chuinhoa=0,so=0;
       for(int i=0;i<a.length();i++)
       {if(a.charAt(i)>='a' && a.charAt(i)<='z')
           chuthuong++;
        if(a.charAt(i)>='A' && a.charAt(i)<='Z')
           chuinhoa++;
        if(a.charAt(i)>='0' && a.charAt(i)<='9')
           so++;
       }
        System.out.print("trong chuoi co "+chuthuong+" chu thuong, co "+chuinhoa+" chu hoa va co "+so+" so\n");
       
       }
    
}