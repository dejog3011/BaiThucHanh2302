package slide40.java;

import java.util.Scanner;

public class Slide40Java {

    public static void main(String[] args) {
      Scanner sc = new Scanner (System.in);
      System.out.println("nhap so nguyen tu 1 den 7:");    
      int number=sc.nextInt();
      switch(number){
          case 1: System.out.println("chu nhat");break;
          case 2: System.out.println("thu hai");break;
          case 3: System.out.println("thu ba");break;
          case 4: System.out.println("thu tu");break;
          case 5: System.out.println("thu nam");break;
          case 6: System.out.println("thu sau");break;
          case 7: System.out.println("thu bay");break;
          default:System.out.println("ban da nhap sai so nguyen tu 1 den 7");break;

      }
              }
}
