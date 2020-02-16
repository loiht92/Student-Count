import java.util.Scanner;

public class StudentCount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size;
        int[] array;

        do {
            System.out.println("Nhap vao so luong sinh vien");
            size = input.nextInt();

            if (size > 30) {
                System.out.println("Vuot qua so luong sinh vien toi da");
            }

        } while (size > 30);

        //nhap vao diem cua sinh vien//
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.println("Nhap diem cua sinh vien");
            array[i] = input.nextInt();
            i++;
        }

        int count = 0;
        System.out.print("Danh sach diem sinh vien:");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t"); // sau moi lan lap se in ra so luong diem//
            if (array[j] >= 5 && array[j] <= 10) {
                count++; //tang so luong len 1 neu thoa man dieu kien
            }
        }
        System.out.print("\n So luong sinh vien thi do: " + count);

    }
}
