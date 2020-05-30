package Work2.Lecture3;

public class Person implements Comparable<Person> {
    String name;
    Integer age;
    Integer score;
    Integer average;

    public Person() {
    }

    public Person(String name, Integer age, Integer score, Integer average) {
        this.name = name;
        this.age = age;
        this.score = score;
        this.average = average;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Integer getAverage() {
        return average;
    }

    public void setAverage(Integer average) {
        this.average = average;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                ", average=" + average +
                '}';
    }


    @Override
    public int compareTo(Person o) {
        //  根据年龄进行排序
        int num = this.average - o.getAverage();

        int key = num == 0 ? this.name.length() - o.getName().length() : num;

        int num1 = key == 0 ? this.name.compareTo(o.getName()) : key;

        return num1;
    }
}
