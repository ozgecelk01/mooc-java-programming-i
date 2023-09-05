public class Book {
    private String bookname;
    private int booknumber;
    private int bookyear;

    public Book(String name,int number,int year){
        this.bookname=name;
        this.booknumber=number;
        this.bookyear=year;
    }
    public String getname(){
        return this.bookname;
    }
    public int getnumber(){
        return this.booknumber;
    }
    public int getyear(){
        return this.bookyear;
    }
    @Override
    public String toString(){
        return this.bookname + ", " + this.booknumber + " pages, " + this.bookyear;
    }
}
