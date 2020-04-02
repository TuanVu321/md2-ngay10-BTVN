import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Student extends Person {
    private int id;
    private double scoreAverage;
    private String email;

    public Student() {
    }

    public Student(int id, double scoreAverage, String email) {
        this.id = id;
        this.scoreAverage = scoreAverage;
        this.email = email;
    }

    public Student(String name, boolean isMan, int dayOfBirth, String adress, int id, double scoreAverage, String email) {
        super(name, isMan, dayOfBirth, adress);
        this.id = id;
        this.scoreAverage = scoreAverage;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getScoreAverage() {
        return scoreAverage;
    }

    public void setScoreAverage(double scoreAverage) {
        this.scoreAverage = scoreAverage;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isScholarship() {
        if (scoreAverage > 8) {
            return true;
        }
        return false;
    }

    public String Scholarship() {
        if (isScholarship()) {
            return "Co duoc  hoc bong";
        }
        return "khong duoc hoc bong";
    }

    @Override
    public void disPlay() {
        System.out.println("id: " + id
                + " ten: " + getName()
                + " Ngay sinh: " + getDayOfBirth()
                + " Giơi tinh: " + gender()
                + " Diem trung binh: " + scoreAverage
                + " Email: " + email
                + " Dia chi: " + getAdress());

    }
}
