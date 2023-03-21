import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap ten:");
        String a=sc.next();
        System.out.print("nhap nam sinh:");
        int namsinh=sc.nextInt();
        int tuoi=2023-namsinh;
        if(tuoi<16)
        System.out.print("Ban "+a+" o do tuoi vi thanh nien");
        if(tuoi>=16&& tuoi<18)
        System.out.print("Ban "+a+" o do tuoi truong thanh");
        if(tuoi>=18)
        System.out.print("Ban "+a+" da gia");
}
}

