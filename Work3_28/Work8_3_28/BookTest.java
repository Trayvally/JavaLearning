package Work.Work3_28.Work8_3_28;

import Work.Work3_28.Work2_3_28.B;

public class BookTest {
    public static void main(String[] args) {
        Book [] bookshelf=new Book[10];
        bookshelf[0]  =new  Book("时间简史",600);
        bookshelf[1]  =new  Book("药物简史",300);
        bookshelf[2]  =new  Book("宇宙简史",560);
        bookshelf[3]  =new  Book("Java开发指南",100);

        bookshelf[0].detail(bookshelf);
    }
}
