package Work.Work3_28.WorkA_3_28;

public class Student {
    private String name;
    private int language;
    private int math;
    private int English;
    private int integratedScience;


    public Student() {
    }

    public Student(String name, int language, int math, int english, int integratedScience) {
        this.name = name;
        this.language = language;
        this.math = math;
        English = english;
        this.integratedScience = integratedScience;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLanguage() {
        return language;
    }

    public void setLanguage(int language) {
        this.language = language;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getEnglish() {
        return English;
    }

    public void setEnglish(int english) {
        English = english;
    }

    public int getIntegratedScience() {
        return integratedScience;
    }

    public void setIntegratedScience(int integratedScience) {
        this.integratedScience = integratedScience;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", language=" + language +
                ", math=" + math +
                ", English=" + English +
                ", integratedScience=" + integratedScience +
                '}';
    }
}
