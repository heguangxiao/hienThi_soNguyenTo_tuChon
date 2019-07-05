import java.util.Scanner;

public class hienThi_soNguyenTo_tuChon {

    static boolean kiemTra(int num){
        boolean flag = true;

        if (num < 2) {
            flag = false;
        } else if (num == 2) {
            flag = true;
        } else if (num > 2) {
            for (int i = 2; i < num-1; i++) {
                if (num % i == 0) {
                    flag = false;
                }
            }
        }

        return flag;
    }

    public static void main(String[] args) {
        int count = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so luong so nguyen to can in ra : ");
        int num = scanner.nextInt();
        for (int i = 2;; i++) {
            if (kiemTra(i)) {
                System.out.print(i + "  ");
                count++;
            }
            if (count == num) {
                break;
            }
        }


        System.out.println("");
        int number = 2;
        count = 0;

        while (count < num) {
            if (kiemTra(number)) {
                System.out.print(number + "  ");
                count++;
            }
            number++;
        }
    }
}
