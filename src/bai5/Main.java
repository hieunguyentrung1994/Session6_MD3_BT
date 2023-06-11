package bai5;

import java.util.Scanner;

public class Main {

    static Student[] listStudent = new Student[100]; //tạo list khởi tạo học dinh gồm 100 học sinh khởi tạo ban đầu là null chùng với Class
    static int size = 0; // size của index giá trị khởi tạo ban đầu

    // 1. Hiển thị danh sách tất cả học sinh
    // 2. Thêm mới học sinh
    // 3. Sửa thông tin học sinh dựa vào mã học sinh
    // 4. Xoá học sinh
    // 5. Thoát
    public static Scanner scanner() {
        return new Scanner(System.in);
    }

    //    static StudentController studentController = new StudentController();
    // tạo đối tượng controller để thao tác với các phương thức
    public static void main(String[] args) {

    while (true) {
        System.out.println("1. Hiển thị danh sách tất cả học sinh");
        System.out.println("2. Thêm mới học sinh");
        System.out.println("3. Sửa thông tin học sinh dựa vào mã học sinh");
        System.out.println("4. Xoá học sinh");
        System.out.println("5. Thoát");
        System.out.println("bạn hãy nhập thông tin muốn đối chiếu dựa theo các số bên trên");
        int chon = scanner().nextInt();
        switch (chon) {
            case 1:
                //Hiển thị danh sách tất cả học sinh
                render();
                break;
            case 2:
                //Thêm mới học sinh
                createNewStudent();
                break;
            case 3:
                //Sửa thông tin học sinh dựa vào mã học sinh
                update();
                break;
            case 4:
                //Xoá học sinh
                delete();
                break;
            case 5:
                System.out.println("xin chân thành cảm ơn hẹn gặp lại");
                System.exit(0);
                break;
            default:
                System.err.println("hãy chọn các hcác số đúng từ 1-5!!!!");

        }
    }
    }

    public static void createNewStudent() { // hàm tạo mới sản phẩm
        Student newStudent = new Student(); // lấy id tự tăng
        int id = getNewId();
        newStudent.setId(id);
        System.out.println("Id = " + id);
        System.out.println("Nhập vào tên");
        newStudent.setName(scanner().nextLine());
        System.out.println("Nhập vào tuổi");
        newStudent.setAge(scanner().nextInt());
        System.out.println("Nhập vào địa chỉ");
        newStudent.setAddress(scanner().nextLine());
        boolean check = them(newStudent);
        if (check) {
            System.out.println("Thêm mới thành công");
        }
    }

    public static int getNewId() {  // hàm tạo id tự động
//        Student[] list = studentController.getListStudent(); // lấy danh sách sản phẩm
        int idMax = 0;  // tạo id lớn nhất
        for (Student p : listStudent) {   // duyệt mảng sản phẩm để tìm ra id lớn nhất
            if (p == null) {        // nếu sản phẩm null, chương trình sẽ ném lỗi nullpoiterexeption, khối if này sẽ giải quyết điều đó
                continue;   // nếu sản phẩm  == null sẽ bỏ qua vòng lặp
            }
            if (idMax < p.getId()) {  // gán max id
                idMax = p.getId();
            }
        }
        return idMax + 1;  // trả về id lớn nhất  + 1
    }

    public static boolean them(Student student) {
        if (size > 100) {// mảng danh sách Student có số lượng giới hạn cố định
            //Nếu danh sách đã vượt quá số lượng giới hạn sẽ thông báo đầy và không cho tạo thêm sinh viên rồi trả về true
            System.out.println("số lượng học sinh đã thếm đã vượt quá!!!!");
            return false;
        }
        for (int i = 0; i < listStudent.length; i++) {// duyệt qua danh sách học sinh, đến học sinh nào null thì gán sản phẩm đó bằng họ sinh mới vào
            if (listStudent[i] == null) {
                listStudent[i] = student;
                return true;
            }
        }
        return false;
    }
    public  static void render(){
        for (int i = 0; i < listStudent.length; i++){
            if (listStudent[i] != null){
                System.out.println(listStudent[i]);
            }
        }
    }
    public static void delete() {
        System.out.println("Nhập id học sinh bạn muốn xóa:");
        int id = scanner().nextInt();
        System.out.println("Học sinh bạn muốn xóa là: " + listStudent[id]);

        for (int i = 0; i < listStudent.length; i++) {
            if (listStudent[i] != null && listStudent[i].getId() == id) {
                listStudent[i] = null;
                size--;
                System.out.println("Xóa học sinh thành công.");
                return; // Kết thúc phương thức sau khi xóa thành công
            }
        }

        System.out.println("Không tìm thấy học sinh có id: " + id);
    }
    public static void update() {
        System.out.println("Nhập id học sinh bạn muốn sửa thông tin:");
        int id = scanner().nextInt();

        for (int i = 0; i < listStudent.length; i++) {
            if (listStudent[i] != null && listStudent[i].getId() == id) {
                System.out.println("Học sinh bạn muốn sửa thông tin là: " + listStudent[i]);
                System.out.println("Nhập thông tin mới cho học sinh:");

                System.out.println("Nhập tên:");
                String newName = scanner().nextLine();
                listStudent[i].setName(newName);

                System.out.println("Nhập tuổi:");
                int newAge = scanner().nextInt();
                listStudent[i].setAge(newAge);

                System.out.println("Nhập địa chỉ:");
                String newAddress = scanner().nextLine();
                listStudent[i].setAddress(newAddress);

                System.out.println("Cập nhật thông tin học sinh thành công.");
                return; // Kết thúc phương thức sau khi cập nhật thành công
            }
        }

        System.out.println("Không tìm thấy học sinh có id: " + id);
    }
}
