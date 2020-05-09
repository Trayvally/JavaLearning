package Work5;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws Exception {
        while (true) {
            //获取当前时间
            Date date = new Date();
            //按题目要求创建时间格式
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            //按格式输出到控制台
            Date d1 = date;//当前时间
            Date d2 = sdf.parse("2020-05-20 11:30:24");//指定的未来天数
            long diff = d2.getTime() - d1.getTime();//这样得到的差值是微秒
            long days = diff / (1000 * 60 * 60 * 24);
            long hours = (diff-days*(1000 * 60 * 60 * 24))/(1000* 60 * 60);
            long minutes = (diff-days*(1000 * 60 * 60 * 24)-hours*(1000* 60 * 60))/(1000* 60);
            long seconds= (diff-days*(1000 * 60 * 60 * 24)-hours*(1000* 60 * 60)-minutes*(1000*60))/1000;
            System.out.println("现在距指定日期相距："+days+"天"+hours+"小时"+minutes+"分"+seconds+"秒");

            System.out.println("D1："+sdf.format(d1));
            System.out.println("D2："+sdf.format(d2));
            try {
                //主线程沉睡1000毫秒后再继续循环
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }

}
