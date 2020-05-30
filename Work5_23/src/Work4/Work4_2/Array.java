package Work4.Work4_2;

public class Array <T extends Number>{
    private T[] array;


    public Array(T[] array) {
        this.array=array;
    }
    public void getMax(){
        T max=this.array[0];
        for (int i = 0; i <array.length ; i++) {
            if (array[i].toString().compareTo(max.toString()) > 0) {
                max = array[i];
            }
        }
        System.out.println("数组中最大的值为"+max);

    }

    public void getMin(){
        T min=this.array[0];
        for (int i = 0; i <array.length ; i++) {
            if (array[i].toString().compareTo(min.toString())<0){
                min=array[i];
            }
        }
        System.out.println("数组中最小的值为"+min);
    }

    public void getAver(){
        double ave=0.0;
        double sum=0.0;
        for (int i = 0; i <array.length ; i++) {
            sum+=array[i].doubleValue();
        }
        ave=sum/array.length;
        System.out.println("该数组的平均值为："+ave);
    }

}
