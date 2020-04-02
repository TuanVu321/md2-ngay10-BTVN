public class Person {
    private String name;
    private boolean isMan;
    private int dayOfBirth;
    private String adress;

    public Person() {
    }

    public Person(String name, boolean isMan, int dayOfBirth, String adress) {
        this.name = name;
        this.isMan = isMan;
        this.dayOfBirth = dayOfBirth;
        this.adress = adress;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isMan() {
        return isMan;
    }

    public void setMan(boolean man) {
        this.isMan = man;
    }

    public int getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(int dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public String gender() {
        if (isMan) {
            return "Man";
        } else {
            return "Women";
        }
    }


    public void disPlay() {
        System.out.println(name+" "+gender()+" "+dayOfBirth+" "+adress);
    }
}
