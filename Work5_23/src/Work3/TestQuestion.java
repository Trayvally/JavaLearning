package Work3;

import java.util.Arrays;

public class TestQuestion {
    private Integer num=0;
    private String name;
    private String[] option={"A","B","C","D"};
    private String answer;

    public TestQuestion(Integer num) {
        this.num = num;
    }

    public TestQuestion(String name, String answer) {
        this.num++;
        this.name = name;
        this.answer = answer;
    }

    public TestQuestion(Integer num, String name, String[] option, String answer) {
        this.num = num;
        this.name = name;
        this.option = option;
        this.answer = answer;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getOption() {
        return option;
    }

    public void setOption(String[] option) {
        this.option = option;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    @Override
    public String toString() {
        return "TestQuestion{" +
                "num=" + num +
                ", name='" + name + '\'' +
                ", option=" + Arrays.toString(option) +
                ", answer='" + answer + '\'' +
                '}';
    }
}
