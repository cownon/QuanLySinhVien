package QuanLySinhVien;
import java.util.Scanner;

public class SinhVien {
    private String mssv;
    private String name;
    private String room;
    private double point;

    Scanner input = new Scanner(System.in);

    public void inp() {

        System.out.print("Hãy nhập Mã số sinh viên: ");
        this.mssv = input.nextLine();

        System.out.print("Hãy nhập tên sinh viên: ");
        this.name = input.nextLine();

        System.out.print("Hãy nhập lớp sinh viên đang học: ");
        this.room = input.nextLine();

        System.out.print("Hãy nhập điểm trung bình của sinh viên: ");
        this.point = input.nextDouble();
    }

    public void out() {
        System.out.println();
        System.out.println("Mã số của sinh viên là: " +this.mssv);
        System.out.println("Tên sinh viên là: " +this.name);
        System.out.println("Lớp của sinh viên là: " +this.room);
        System.out.println("Điểm của sinh viên là: " +this.point);
        System.out.println();
    }

    public void repairMssv() {
        while (true) {
            System.out.println("1. Mã số sinh viên");
            System.out.println("2. Tên sinh viên");
            System.out.println("3. Lớp của sinh viên");
            System.out.println("4. điểm của sinh viên");
            System.out.println("0. Thoát");

            System.out.println("Mời bạn nhập thông tin cần sửa của sinh viên: ");
            int x = input.nextInt();
            input.nextLine();

            if (x == 0) {
                break;
            }

            switch (x) {
                case 1:
                    System.out.println("Mời bạn nhập lại mã số sinh viên: ");
                    String mssv = input.nextLine();
                    //input.nextLine();
                    this.mssv = mssv;
                    break;
                case 2:
                    System.out.println("Mời bạn nhập lại tên sinh viên: ");
                    String name = input.nextLine();
                    this.name = name;
                    break;
                case 3:
                    System.out.println("Mời bạn nhập lại lớp của sinh viên: ");
                    String room = input.nextLine();
                    this.room = room;
                    break;
                case 4:
                    System.out.println("Mời bạn nhập lại điểm của sinh viên: ");
                    Double point = input.nextDouble();
                    this.point = point;
                    break;
                case 0:
                    break;
            }
        }
    }
    
    public String getMssv() {
        return this.mssv;
    }
    public String getName() {
        return this.name;
    }
    public String getRoom() {
        return this.room;
    }
    public double getPoint() {
        return this.point;
    }
}
