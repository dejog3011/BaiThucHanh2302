import java.util.Scanner;

public class Bai11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("So phan tu trong mang la:"); 
        int a=sc.nextInt();
        int arrA[] = new int[a];
        //nhap phan tu vao mang
        for(int i=0;i<arrA.length;i++)
        {
            System.out.printf("Nhap phan tu thu %d :",i+1);
            arrA[i]=sc.nextInt();
        }
        // xuat mang ra man hinh
        System.out.print("");
        for(int i=0;i<arrA.length;i++)
        {
            System.out.print("\t"+arrA[i]);
        }
        for(int i=0;i<arrA.length-1;i++)
        {    int b;
            for(int j=i+1;j<arrA.length;j++)
            {
                if(arrA[i]>arrA[j])
                {
                    b=arrA[i];
                    arrA[i]=arrA[j];
                    arrA[j]=b;
                }
            }
        }
        System.out.print("\n");
        System.out.println("mang da xap xep la:");
        
        for(int i=0;i<arrA.length;i++)
        {
            System.out.print("\t"+arrA[i]);
        }
        System.out.print("\n");
    }
}