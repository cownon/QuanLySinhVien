package QuanLySinhVien;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class QuanLySinhVien {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<SinhVien> sv = new ArrayList<SinhVien>();
        int countSv = 0;

        while (true) {
            //Menu lựa chọn chức năng
            System.out.println();
            System.out.println("1. Thêm sinh viên vào danh sách");
            System.out.println("2. Sửa thông tin sinh viên");
            System.out.println("3. Tìm kiếm sinh viên");
            System.out.println("4. Xem toàn bộ thông tin các sinh viên");
            System.out.println("5. Sắp xếp sinh viên theo điểm");
            System.out.println("0. Thoát");
            System.out.println();

            //Chương trình chọn
            System.out.println("Nhập lựa chọn của bạn: ");
            int choose = input.nextInt();
            input.nextLine();
            
            //Chương trình xử lý
            switch (choose) {
                case 1:
                    SinhVien svNew = new SinhVien();
                    svNew.inp();
                    sv.add(svNew);
                    countSv++;
                    break;

                case 2:
                    System.out.println("Nhập sinh viên cần sửa thông tin: ");
                    int vtSvRepair = input.nextInt();

                    if (vtSvRepair >= countSv) {
                        System.out.println("Không tồn tại sinh viên đã chọn");
                        break;
                    }
                    sv.get(vtSvRepair).repairMssv();
                    break;
                
                case 3:
                    System.out.println("Mời bạn nhập mã số sinh viên để tìm thông tin sinh viên bạn cần:");
                    String msFind = input.nextLine();

                    for (SinhVien i:sv) {
                        if (msFind.equalsIgnoreCase(i.getMssv())) {
                            System.out.println("Thong tin sinh vien ban can tim:");
                            i.out();
                            break;
                        }
                    }
                    break;

                case 4:
                    System.out.println("Đây là danh sách sinh viên:");
                    System.out.println();
                    for (int i = 0; i < countSv; i++) {
                        System.out.println("Sinh vien thu " +(i+1));
                        sv.get(i).out();
                        System.out.println();
                    }
                    break;
                case 5:
                    System.out.println("Đây là danh sách sau khi sắp xếp theo điểm");

                    ArrayList<SinhVien> svTmp = new ArrayList<>();

                    svTmp.addAll(sv);
                    svTmp.sort(Comparator.comparingDouble(SinhVien::getPoint).reversed());
                    Collections.sort(svTmp, Comparator.comparingDouble(SinhVien::getPoint).reversed());
                    svTmp.forEach(tmp -> tmp.out());
            }
        }
        
    }
}
