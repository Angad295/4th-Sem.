/*. Library Management 
Create class Book with title and author. 
Create subclass IssuedBook with issueDate and returnDate. 
     Display issued book details. */

     class Book{
        String title;
        String auther;
        Book(String t,String a){
            title = t ;
            auther = a;
        }
     }

     class IssuedBook extends Book{
        int issueDate;
        int returnDate;
        IssuedBook(String t , String a,int id ,int rd){
            super(t,a);
            issueDate=id;
            returnDate=rd;
        }
        void show(){
        System.out.println("Title :"+title);
        System.out.println("Auther :"+auther);
        System.out.println("Issued date :"+issueDate);
        System.out.println("Return date :"+returnDate);
    }
     }


     public class P9{
        public static void main(String[] args){
            IssuedBook id = new IssuedBook("Atom" ,"Unknown" ,1 , 10);
            id.show();
        }
     }