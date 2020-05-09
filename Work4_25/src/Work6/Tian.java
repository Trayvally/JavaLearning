package Work6;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


//计算出生了多少天

public class Tian {


    public static void main(String[] args) {


        int year = 0, month = 0, day = 0;
        int tianshu;
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入年");
        year = scanner.nextInt();
        System.out.print("请输入月");
        month = scanner.nextInt();
        System.out.print("请输入日");
        day = scanner.nextInt();
        tianshu = manyday(year, month, day);
        System.out.println("您生活了：" + tianshu + "天");
    }

    //输入年月日，输出天数
    private static int manyday(int year, int month, int day) {
        int shu = 0;
        int todayyear, todaymonth, todayday;
        String sNow = "";
        int sheng = 0; //某日期到年底的天数

        Date today = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        sNow = sdf.format(today);
        todayyear = Integer.parseInt(sNow.substring(0, 4));
        todaymonth = Integer.parseInt(sNow.substring(4, 6));
        todayday = Integer.parseInt(sNow.substring(6));

        System.out.println(year + " . " + month + " . " + day + " to " + todayyear + " . " + todaymonth + " . " + todayday);

        for (int i = year + 1; i < todayyear; i++) {
            if (i % 4 == 0) {
                shu = shu + 366;
            } else {
                shu = shu + 365;
            }
        }

        sheng = howday(year, month, day);
        if (year % 4 == 0) {
            sheng = 366 - sheng;
        } else {
            sheng = 365 - sheng;
        }
        shu = shu + sheng + howday(todayyear, todaymonth, todayday);

        return shu;
    }
    //输入年月日    返回该年的天数

    private static int howday(int year, int month, int day) {
        int da[] = {1, 3, 5, 7, 8, 10, 12};
        int xiao[] = {4, 6, 9, 11};
        int tian = 0;
        if (month == 1) {
            tian = day;
        } else {
            for (int i = 1; i < month; i++) {
                if (judge(da, i)) {
                    tian = tian + 31;
                } else if (judge(xiao, i)) {
                    tian = tian + 30;
                } else if ((i == 2) && (year % 4 == 0)) {
                    tian = tian + 29;
                } else if ((i == 2) && (year % 4 != 0)) {
                    tian = tian + 28;
                }
            }
            tian = tian + day;
        }
        return tian;
    }
    //根据年月返回月份的天数

    //判断变量是否属于数组
    private static boolean judge(int[] a, int bianliang) {
        boolean boo = false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == bianliang) {
                boo = true;
                break;
            }
        }
        return boo;
    }


}
