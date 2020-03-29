package Work.Work3_28.WorkA_3_28;

public class Test {
    public static void main(String[] args) {
        Student student[]=new Student[5];
        student[0]=new Student("张三",95,72,100,192);
        student[1]=new Student("李四",116,140,89,192);
        student[2]=new Student("王五",107,118,120,213);
        student[3]=new Student("赵六",89,98,99,202);
        student[4]=new Student("陈七",77,135,105,201);

        int Max=0;
        double average[]= new double[student.length];
        for (int i=1;i<student.length;i++){

            average[i]=(student[i].getLanguage()+student[i].getMath()+student[i].getEnglish()+student[i].getIntegratedScience())*0.25;
            if(average[Max]<average[i])
                Max=i;
        }
        System.out.println("平均成绩最高的人的所有信息：");
        System.out.println(student[Max].toString());

        Max=0;

        double science[]= new double[student.length];
        for (int i=1;i<student.length;i++){

            science[i]=student[i].getMath()+student[i].getIntegratedScience();
            if(science[Max]<science[i])
                Max=i;
        }
        System.out.println("理科成绩最高的人是"+student[Max].getName());

    }
}
