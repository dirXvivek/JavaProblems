import java.util.Scanner;
class Library{
String [] books= new String[50];
    public void addBook(String n){

    }
    public void issueBook(){

    }
    public void returnBook(){

    }
    public void showAvailableBooks(){

    }
}

public class ChallengeLibrary {
    public static void main(String[] args) {
    //scanner instance
        Scanner input = new Scanner(System.in);
    //class instance
        Library lb = new Library();
        while(true){
            System.out.println("1: Add Book\n 2: Issue Book \n 3: Return Book \n 4: Available Book\n");
            int userSelect = input.nextInt();
            switch (userSelect){
                case 1:
                    System.out.println("Add the book here!: ");
                    String bookName = input.nextLine();
                    lb.addBook(bookName);
                    break;
            }
        }
    }
}
