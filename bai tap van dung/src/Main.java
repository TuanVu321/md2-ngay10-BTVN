public class Main {
    public static void main(String[] args) {
        StudentManagement studentManagement = new StudentManagement();
        studentManagement.addStudent();
        studentManagement.addStudent();
        studentManagement.disPlayList();
        studentManagement.delete(1);
        studentManagement.disPlayList();
        studentManagement.change(1);
        studentManagement.disPlayList();
        studentManagement.findScholarship();
        studentManagement.findWoman();
    }
}
