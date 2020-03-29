package Work.Work3_28.Work8_3_28;

public class Book {
    private String name;
    private int pageNum;

    public Book() {
    }

    public Book(String name, int pageNum) {
        this.name = name;
        if (pageNum<200){
            this.pageNum = 200;
            System.out.println("页数不得少于200页，赋予默认值200");
        }else {
            this.pageNum = pageNum;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        if (pageNum<200){
            this.pageNum = 200;
            System.out.println("页数不得少于200页，赋予默认值200");
        }else {
            this.pageNum = pageNum;
        }
    }

    public void detail(Book bookshelf[]){
        for (int i=0;i<bookshelf.length;i++){
            if (bookshelf[i].name==null){
                break;
            }
            System.out.println("书名:"+ bookshelf[i].name + "，页数：" + bookshelf[i].pageNum);

        }

    }


}
