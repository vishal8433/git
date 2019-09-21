package library;
import java.util.Scanner;

public class Books {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the number of books");
        int n=obj.nextInt();
        if (n==0){
            System.out.println("N/A");
        }
        else{
            obj.skip("\n");
            for (int i=1;i<=n;i++){
                String bookname=obj.nextLine();
                String authorname=obj.nextLine();
                String ISBN=obj.nextLine();
                System.out.println("------------------------------");
                System.out.println("BOOK NAME:\t" + bookname);
                System.out.println("AUTHOR NAME:\t" + authorname);
                System.out.println("ISBN:\t" + ISBN);
                System.out.println("-------------------------------");
            }
        }
        obj.close();

    }
}
class Book{
    private String bookname;
    private String authorname;
    private String ISBN;
    public String getBookname(){
        return bookname;
    }

    public String getAuthorname() {
        return authorname;
    }
    public String getISBN(){
        return ISBN;
    }
    public void setBookname(String bookname){
        this.bookname=bookname;
    }
    public void setAuthorname(String authorname){
        this.authorname=authorname;
    }
    public void setISBN(String ISBN){
        this.ISBN=ISBN;
    }
    public Book(String bookname, String authorname, String ISBN){
        this.bookname=bookname;
        this.authorname=authorname;
        this.ISBN=ISBN;
    }
    @Override
    public String toString(){
        return String.format("%10s%10s%5s",getBookname(),getAuthorname(),getISBN());
    }

}
