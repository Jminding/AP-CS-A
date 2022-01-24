public class Student {
    private String name;
    private int id;
    private double grade;
    
    public Student(String initName, int initId, double initGrade) {
        this.name = initName;
        this.id = initId;
        this.grade = initGrade;
    }
    
    public Student() {
        this.name = "baker";
        this.id = 1234;
        this.grade = 4.0;
    }
    
    public void addGrade(double score) {
        this.grade += score;
    }
}