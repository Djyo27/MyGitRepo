public class Student {
    private String name;
    private String surname;
    private double score;

    public Student(String name, String surname, double score) {
        this.name = name;
        this.surname = surname;
        this.score = score;
    }
    
    public String getName() {
        return name;
    }
    
    public String getSurname() {
        return surname;
    }
    
    public double getScore() {
        return score;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setSurname(String surname) {
        this.surname = surname;
    }
    
    public void setScore(double score) {
        this.score = score;
    }
    
    @Override
    public String toString() {
        return name + " " + surname + " - Score: " + score;
    }
}