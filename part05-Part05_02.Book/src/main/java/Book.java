public class Book {
    private String a;
    private String n;
    private int p;
    public Book(String author, String name, int pages){
        this.a=author;
        this.n=name;
        this.p=pages;

    }
    public String getAuthor(){
        return this.a;
    }
    public String getName(){
        return this.n;
    }
    public int getPages(){
        return this.p;
    }
    @Override
    public String toString(){
        return this.a+", "+this.n+", "+this.p+" pages";
    }
}
