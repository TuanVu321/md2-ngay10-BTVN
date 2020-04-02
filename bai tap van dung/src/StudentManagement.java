
import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagement {
    ArrayList<Student> listStudent = new ArrayList<Student>();

    public void addStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap ten");
        String name = scanner.nextLine();
        System.out.println("Giơi tinh nam? true-false");
        boolean isMan = scanner.nextBoolean();
        scanner.nextLine();
        System.out.println("ngay sinh");
        int dayOfBirth = scanner.nextInt();
        scanner.nextLine();
        System.out.println("dia chi");
        String adress = scanner.nextLine();
        System.out.println("id sinh vien");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("diem trung binh");
        int scoreAverage = scanner.nextInt();
        scanner.nextLine();
        System.out.println("email");
        String email = scanner.nextLine();
        Student student = new Student(name, isMan, dayOfBirth, adress, id, scoreAverage, email);
        listStudent.add(student);
    }

    public void disPlayList() {
        for (int i = 0; i < listStudent.size(); ++i) {
            listStudent.get(i).disPlay();
        }
    }

    public void delete(int id) {
        for (int i = 0; i < listStudent.size(); ++i) {
            if (listStudent.get(i).getId() == id) {
                listStudent.remove(i);
            }else{
                System.out.println("trong danh sach khong co id sinh vien do");
            }
        }
    }

    public void change(int id) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < listStudent.size(); ++i) {
            if (listStudent.get(i).getId() == id) {
                System.out.println("sua ten");
                String name = scanner.nextLine();
                listStudent.get(i).setName(name);
                System.out.println("Giơi tinh nam? true-false");
                boolean isMan = scanner.nextBoolean();
                listStudent.get(i).setMan(isMan);
                scanner.nextLine();
                System.out.println("ngay sinh");
                int dayOfBirth = scanner.nextInt();
                listStudent.get(i).setDayOfBirth(dayOfBirth);
                scanner.nextLine();
                System.out.println("dia chi");
                String adress = scanner.nextLine();
                listStudent.get(i).setAdress(adress);
                System.out.println("id sinh vien");
                int idStudent = scanner.nextInt();
                listStudent.get(i).setId(idStudent);
                scanner.nextLine();
                System.out.println("diem trung binh");
                int scoreAverage = scanner.nextInt();
                listStudent.get(i).setScoreAverage(scoreAverage);
                scanner.nextLine();
                System.out.println("email");
                String email = scanner.nextLine();
                listStudent.get(i).setEmail(email);
            }else{
                System.out.println("trong danhs sach khong co id sinh vien do");
            }
        }
    }

    public void idFind(int id) {
        for (int i = 0; i < listStudent.size(); ++i) {
            if (listStudent.get(i).getId() == id) {
                listStudent.get(i).disPlay();
            }else{
                System.out.println("trong danh sach khong co id do");
            }
        }
    }

    public void nameFind(String name) {
        for (int i = 0; i < listStudent.size(); ++i) {
            if (listStudent.get(i).getName() == name) {
                listStudent.get(i).disPlay();
            }else{
                System.out.println("trong danh sach khong co ten do");
            }

        }


    }

    public void findScholarship(){
        for(int i=0;i<listStudent.size();++i){
            if(listStudent.get(i).isScholarship()){
                listStudent.get(i).disPlay();
            }else{
                System.out.println("Khong co sinh vien nao duoc hoc bong");
            }
        }
    }

    public void findWoman(){
        for(int i=0;i<listStudent.size();++i){
            if(listStudent.get(i).isMan()==false){
                listStudent.get(i).disPlay();
            }else{
                System.out.println("khong co sinh vien nu");
            }
        }
    }
}
