public class Students {
    private String stLastName;
    private String stFirstName;
    private int grade;
    private int classroom;
    private int bus;
    private double gpa;
    private String tLastName;
    private String tFirstName;

    Students(){
        this.stLastName = stLastName;
        this.stFirstName = stFirstName;
        this.grade = grade;
        this.classroom = classroom;
        this.bus = bus;
        this.gpa = gpa;
        this.tLastName = tLastName;
        this.tFirstName = tFirstName;
    }

    public void setStLastName(String name){
        stLastName = name;
    }

    public String getStLastName(){
        return stLastName;
    }

    public void setStFirstName(String name){
        stFirstName = name;
    }

    public String getStFirstName(){
        return stFirstName;
    }

    public void setGrade(int grade){
        this.grade = grade;
    }

    public int getGrade(){
        return grade;
    }

    public void setClassroom(int classroom){
        this.classroom = classroom;
    }

    public int getClassroom(){
        return classroom;
    }

    public void setBus(int bus){
        this.bus = bus;
    }

    public int getBus(){
        return bus;
    }

    public void setGpa(double gpa){
        this.gpa = gpa;
    }

    public double getGpa(){
        return gpa;
    }

    public void setTLastName(String name){
        tLastName = name;
    }

    public String getTLastName(){
        return tLastName;
    }

    public void setTFirstName(String name){
        tFirstName = name;
    }

    public String getTFirstName(){
        return tFirstName;
    }

    public double compareTo(Students object){
        double highestGPA = 0;
        return Math.max(highestGPA, object.getGpa());
    }
}
