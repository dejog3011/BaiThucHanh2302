import java.util.Scanner;

public class Bai12 {

    public static void main(String[] args) {
        Scanner sc=new Scanner  (System.in) ;  
        System.out.print("so hang cua mang la:");
        int a=sc.nextInt();
        System.out.print("so cot cua mang la:");
        int b=sc.nextInt();
        int arrA[][]=new int[a][b];
        //nhap du lieu vao mang 2 chieu
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<b;j++)
            {
                System.out.printf("arrA[%d][%d]=",i,j);
                arrA[i][j]=sc.nextInt();
            }
        }
        //xuat mang 2 chieu
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<b;j++)
            {
                System.out.printf("\t"+arrA[i][j]);
            }
            System.out.println("\n");
        }
        // sap xep mang tang dan theo cot
        int e;
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<b-1;j++)
            {
                for( int u=j+1;u<b;u++)
                {
                    if(arrA[i][u]<arrA[i][j])
                    {
                        e=arrA[i][j];
                        arrA[i][j]=arrA[i][u];
                        arrA[i][u]=e;
                    }
                }
            }
            System.out.println(" Mang duoc sap xep tang dan theo cot la: \n");
        }
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<b;j++)
            {
                System.out.printf("\t"+arrA[i][j]);
            }
            System.out.println("\n");
        }
        //sap xep ham cua cot cuoi theo thu tu tang dan
        for(int i=0;i<a-1;i++){
            for(int j=i+1;j<a;j++)
            if(arrA[i][b-1]>=arrA[j][b-1]){
                e=arrA[i][b-1];
                arrA[i][b-1]=arrA[j][b-1];
                arrA[j][b-1]=e;
                
            }
        }
        System.out.println("sap xep mang theo thu tu tang dan cua cot cuoi" );
         for(int i=0;i<a;i++)
        {
            for(int j=0;j<b;j++)
            {
                System.out.printf("\t"+arrA[i][j]);
            }
            System.out.println("\n");
        }
         System.out.println("gia tri lon nhat trong ma tran la:" +arrA[a-1][b-1]);
    }
    