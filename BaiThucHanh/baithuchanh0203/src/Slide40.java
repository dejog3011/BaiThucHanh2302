public class Slide40 {
    system.out.println("Viết chương trình nhập vào các số nguyên và tính tổng các số đó, nếu tổng lớn hơn > 100 thì kết thúc vòng lặp và hiển thị thông báo tổng của các số đã nhập.");
    int sum = 0;
    while (true) {
        system.out.println("Nhập vào một số nguyên:");
        int number = scanner.nextInt();
        sum += number;
        if (sum > 100) {
            system.out.println("Tổng các số đã nhập là: " + sum);
            break;
        }
    }
}
